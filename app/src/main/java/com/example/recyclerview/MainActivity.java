package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView studentsRecyclerView;
    private StudentAdapter studentAdapter;

    private List<Student> studentsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        studentsRecyclerView = findViewById(R.id.students_recycler_view);
        studentsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        studentAdapter = new StudentAdapter(this, studentsList);
        studentsRecyclerView.setAdapter(studentAdapter);

    }

    private void initData() {
        studentsList.add(new Student("Samer Shaqalih", "20160608", "5", 90));
        studentsList.add(new Student("Mohammed Zaqout", "20160338", "5", 80));

        studentsList.add(new Student("Emad Darabeh", "20165086", "5", 85));

        studentsList.add(new Student("Mohammed Shaqalih", "20154321", "5", 70));
        studentsList.add(new Student("Sami Odah", "20161234", "5", 77));
    }
}
