package com.trung.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.color.utilities.Score;

public class QuestionActivity extends AppCompatActivity {

    String question[]={
            "Which of the following is true?",
            "Given that x = 7.5, j = -1.0, n = 1.0, m = 2.0 the value of - - x + j == x>n> = m is: ",
            "If n has 3, then the statement a[++n]=n++;",
            "Which of the following is not a logical operator?"
    };
    String answer[]={
            "gets() doesn't do any array bound testing and should not be used. ",
            "1",
            "assigns 3 to a[5]",
            "&& "

    };
    String opt[]={
            "gets() doesn't do any array bound testing and should not be used. ","gets() should be used in place of gets() only for files, otherwise gets() is fine","gets() cannot read strings with spaces","None of the above",

            "0","1","2","3",

            "assigns 3 to a[5]","assigns 4 to a[5]","assigns 4 to a[4]","what is assigned is compiler dependent",

            "&& ","!","II","I",

            "","","",""

    };

    int flag=0;

    public static  int marks=0,correct=0,wrong=0;
    TextView tv;
    Button submitbutton, quitbutton;
    RadioButton radio_g;
    RadioButton rb1, rb2, rb3, rb4;
    private  TextView questionumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        final TextView score = (TextView) findViewById(R.id.textview4);
        TextView textView = (TextView) findViewById(R.id.textview4);
        Intent intent = getIntent();

        questionumber = findViewById(R.id.DispName);
        submitbutton = (Button) findViewById(R.id.button3);
        quitbutton = (Button) findViewById(R.id.buttonquit);
        tv = (textView) findViewById(R.id.tvque);

        radio_g = (RadioGroup) findViewById(R.id.ansewrgrp);
        rb1 = (RadioButton) findViewById(R.id.radiobutton1);
        rb2 = (RadioButton) findViewById(R.id.radiobutton2);
        rb3 = (RadioButton) findViewById(R.id.radiobutton3);
        rb4 = (RadioButton) findViewById(R.id.radiobutton4);

        tv.setText(question[flag]);
        rb1.setText(opt[1]);
        rb2.setText(opt[2]);
        rb3.setText(opt[3]);
        rb4.setText(opt[4]);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radio_g.getCheckedRadioButtonId()== -1)
                {
                    Toast.makeText(QuestionActivity.this,"please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String anText = uans.getText().toString();

                if (ansText.equals(answer[flag]))
                {
                    correct++;
                    Toast.makeText(QuestionActivity.this,"Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(QuestionActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                }
                flag++;
                if (score!=null)
                {
                    score.setText(""+correct);
                    if (flag<question.length)
                    {
                        tv.setText(question[flag]);
                        rb1.setText(opt[flag*4+1]);
                        rb2.setText(opt[flag*4+2]);
                        rb3.setText(opt[flag*4+3]);
                        rb4.setText(opt[flag*4+4]);
                        questionumber.setText(flag+"/"+question.length+"Question");

                    }
                    else {
                        marks=correct;
                        Intent in = new Intent(QuestionActivity.this,ResultActivity.class);
                        startActivity(in);
                    }
                    radio_g.clearCheck();
                }


            }
        });
        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(getApplicationContext(),ResultActivity.class);
                startActivity(intent1);
            }
        });

    }
}