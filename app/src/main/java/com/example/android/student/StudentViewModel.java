package com.example.android.student;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class StudentViewModel extends AndroidViewModel {

    private StudentRepository mStudentRepository;

    private LiveData<List<Student>> mAllStudents;

    public StudentViewModel(@NonNull Application application) {
        super(application);
        mStudentRepository = new StudentRepository(application);
        mAllStudents = mStudentRepository.getmAllStudents();
    }

    LiveData<List<Student>> getmAllStudents(Student student){return mAllStudents;}

    public void insert(Student student){mStudentRepository.insert(student); }
}
