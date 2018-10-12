package com.example.android.student;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

//Entity represents the table for the database

@Entity(tableName="student")
public class Student {

    public Student(@NonNull String mRollNumber,
                   @NonNull String mName,
                   @NonNull int gender,
                   @NonNull String phoneNumber,
                   String email,
                   @NonNull String address,
                   @NonNull String bloodGroup,
                   int hobby) {
        this.mRollNumber = mRollNumber;
        this.mName = mName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.hobby = hobby;
    }

    @NonNull
    public String getmRollNumber() {
        return mRollNumber;
    }

    @NonNull
    public String getmName() {
        return mName;
    }

    @NonNull
    public int getGender() {
        return gender;
    }

    @NonNull
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @NonNull
    public String getAddress() {
        return address;
    }

    @NonNull
    public String getBloodGroup() {
        return bloodGroup;
    }

    public int getHobby() {
        return hobby;
    }



    @ColumnInfo(name = "roll")
    @NonNull
    @PrimaryKey
    public String mRollNumber;

    @NonNull
    @ColumnInfo(name = "name")
    public String mName;

    @NonNull
    @ColumnInfo(name = "gender")
    public int gender;

    @NonNull
    @ColumnInfo(name = "phone")
    public String phoneNumber;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "address")
    @NonNull
    public String address;

    @ColumnInfo(name = "blood_group")
    @NonNull
    public  String bloodGroup;

    @ColumnInfo(name="hobby")
    public int hobby;



}
