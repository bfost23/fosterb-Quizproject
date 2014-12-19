package com.example.student.quiz_project;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Quiz_Project extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__project);

        final Button button = (Button) findViewById(R.id.trueB);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast toast =  Toast.makeText(getApplication(), "incorrect", Toast.LENGTH_SHORT);
               toast.show();
            }
        });

        final Button button2 = (Button) findViewById(R.id.fasleB);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast =  Toast.makeText(getApplication(), "incorrect", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
