package com.example.android.student;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class EditorActivity extends AppCompatActivity {

    TextInputEditText mRollNumber;
    TextInputEditText mName;
    TextInputEditText mPhoneNumber;
    TextInputEditText mEmail;
    TextInputEditText mAddress;
    TextInputEditText mBloodGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        mRollNumber=(TextInputEditText)findViewById(R.id.roll_txt);
        mName = (TextInputEditText)findViewById(R.id.name_txt);
        mPhoneNumber = (TextInputEditText)findViewById(R.id.phone_txt);
        mEmail=(TextInputEditText)findViewById(R.id.email_txt);
        mAddress=(TextInputEditText)findViewById(R.id.address_txt);
        mBloodGroup=(TextInputEditText)findViewById(R.id.bloodgroup_txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.editor_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuId = item.getItemId();
        if (menuId==R.id.save){
            //Method to save the data
        }
        if (menuId==R.id.delete){
            //Method to delete the data
        }
        return super.onOptionsItemSelected(item);
    }
}
