package com.daclink.drew.gymlog_sp20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView logDisplay;

    EditText exercise;
    EditText weight;
    EditText reps;

    Button logButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logDisplay = findViewById(R.id.textViewLogs);

        exercise = findViewById(R.id.editTextExercise);
        weight = findViewById(R.id.editTextWeight);
        reps = findViewById(R.id.editTextReps);

        logButton = findViewById(R.id.buttonLogIt);


        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String log;
                log = getLog();

                logDisplay.setText(log);
            }
        });

    }

    private String getLog() {
        StringBuilder logData = new StringBuilder();

        logData.append("Log :");
        logData.append(new Date());
        logData.append("\n");
        logData.append(exercise.getText().toString());
        logData.append(" : ");
        logData.append(weight.getText().toString());
        logData.append(" X ");
        logData.append(reps.getText().toString());
        logData.append("\n");

        logData.append(logDisplay.getText().toString());

        return logData.toString();


    }
}
