package com.example.android.student;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.StudentViewHolder> {


    class StudentViewHolder extends RecyclerView.ViewHolder {

        private TextView rollNumber;
        private TextView name;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            rollNumber=itemView.findViewById(R.id.roll_number);
            name = itemView.findViewById(R.id.name);
        }
    }

    private LayoutInflater layoutInflater;

    private List<Student> mStudents;

    StudentListAdapter(Context context){layoutInflater=LayoutInflater.from(context);}


    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = layoutInflater.inflate(R.layout.recyclerview_item,viewGroup,false);
        return new StudentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {

        if (mStudents!=null){
            Student current = mStudents.get(i);
            studentViewHolder.rollNumber.setText(current.getmRollNumber());
            studentViewHolder.name.setText(current.getmName());
        } else{
            studentViewHolder.rollNumber.setText("No Data");
            studentViewHolder.name.setText("No Data");
        }
    }

    void setStudents(List<Student> students){
        mStudents=students;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mStudents!=null)
            return mStudents.size();

        else return 0;
    }
}
