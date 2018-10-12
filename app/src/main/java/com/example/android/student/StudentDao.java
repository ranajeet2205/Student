package com.example.android.student;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Student student);

    @Query("Delete from student")
    void deleteAll();

    @Query("SELECT * FROM student ORDER BY roll ASC")
    LiveData<List<Student>>  getAllStudent();
}
