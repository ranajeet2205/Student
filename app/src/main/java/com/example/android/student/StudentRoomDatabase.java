package com.example.android.student;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities ={Student.class} ,version = 1)
public abstract class StudentRoomDatabase extends RoomDatabase {

    public abstract StudentDao studentDao();

    public static volatile StudentRoomDatabase studentRoomInstance;

    static StudentRoomDatabase getStudentRoomDatabase(final Context context){
        if (studentRoomInstance==null){
            synchronized (StudentRoomDatabase.class){
                if (studentRoomInstance==null){
                    studentRoomInstance=Room.databaseBuilder(context.getApplicationContext(),
                        StudentRoomDatabase.class,"student_database").build();
                }
            }
        }

        return studentRoomInstance;
    }
}
