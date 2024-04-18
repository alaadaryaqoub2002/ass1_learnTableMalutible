package com.example.a1202007_alaadaryaquop_ass1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LearnTableX2Activity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private Button button07;
    private Button button4;
    private Button button04;
    private Button button05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_table_x1);

        // Initialize TextViews and Buttons
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        button07 = findViewById(R.id.button07);
        button4 = findViewById(R.id.button4);
        button04 = findViewById(R.id.button04);
        button05 = findViewById(R.id.button05);

        // Set button click listeners
        button07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(4);
            }
        });

        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(6);
            }
        });

        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(1);
            }
        });
    }

    private void checkAnswer(int answer) {
        // Assume the correct answer is 3 for the example "3 * 1 = ?"
        int correctAnswer = 3;
        if (answer == correctAnswer) {
            textView1.setText("Correct!");
            textView1.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
            updateScore(true);
        } else {
            textView1.setText("Wrong!");
            textView1.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            updateScore(false);
        }
    }

    private void updateScore(boolean correct) {
        String scoreText = textView4.getText().toString();
        int score = Integer.parseInt(scoreText.split("/")[0]);
        int total = Integer.parseInt(scoreText.split("/")[1]);
        total++;
        if (correct) {
            score++;
        }
        textView4.setText(score + "/" + total);
    }
}

