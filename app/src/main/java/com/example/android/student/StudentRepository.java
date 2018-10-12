package com.example.android.student;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

/**
 * A Repository is a class that abstracts access to multiple data sources.
 * The Repository is not part of the Architecture Components libraries,
 * but is a suggested best practice for code separation and architecture.
 * A Repository class handles data operations.
 * It provides a clean API to the rest of the app for app data.
 *
 *
 * A Repository manages query threads and allows you to use multiple backends.
 * In the most common example, the Repository implements the logic
 * for deciding whether to fetch data from a network or use results cached in a local database.
 */

public class StudentRepository {

    private StudentDao studentDao;
    private LiveData<List<Student>> mAllStudents;


    StudentRepository(Application application) {
        StudentRoomDatabase db = StudentRoomDatabase.getStudentRoomDatabase(application);
        studentDao = db.studentDao();
        mAllStudents = studentDao.getAllStudent();
    }

    LiveData<List<Student>> getmAllStudents() {
        return mAllStudents;
    }

    public void insert(Student student){
        new insertAsyncTask(studentDao).execute(student);
    }

    private  static  class insertAsyncTask extends AsyncTask<Student,Void,Void>{

        private StudentDao mAsyncTaskDao;

        insertAsyncTask(StudentDao studentDao){
            mAsyncTaskDao=studentDao;
        }

        @Override
        protected Void doInBackground(final Student... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
