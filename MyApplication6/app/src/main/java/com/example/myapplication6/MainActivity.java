
package com.example.myapplication6;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Note> stdList = new ArrayList<>();
    RecyclerView students_rv;
    NotesAdapter notesAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();


        students_rv = findViewById(R.id.students_rv);
        students_rv.setLayoutManager(new LinearLayoutManager(this));
        notesAdapter = new NotesAdapter(this ,stdList );
        students_rv.setAdapter(notesAdapter);
    }

    private void initData() {
        stdList . add(new Note("1","ahmed" , "1" , "60"));
        stdList . add(new Note("2","ali" , "2" , "70"));
        stdList . add(new Note("3","omar" , "3" , "80"));
        stdList . add(new Note("4","m" , "4" , "90"));
        stdList . add(new Note("5","a" , "5" , "95"));
        stdList . add(new Note("6","ola" , "5" , "99"));
        stdList . add(new Note("6","ola" , "3" , "99"));
        stdList . add(new Note("6","ola" , "2" , "99"));
    }
}
