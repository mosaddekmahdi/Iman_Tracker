package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newHabit = new Intent(getApplicationContext(), NewHabitActivity.class);
                // Perform action on click
//                startActivity(new Intent("com.example.myfirstapp.NewHabitActivity"));
                startActivity(newHabit);
            }
        });

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newToDoToday = new Intent(getApplicationContext(), ToDoToday.class);
                // Perform action on click
                startActivity(newToDoToday);
            }
        });
    }
}
