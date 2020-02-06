package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button answer1, answer2, answer3, answer4;

    TextView Question,Score;

    private Questions mQuestions = new Questions();

    private  String mAnswer;
    private int mScore=0;
    private int mQuestionsLenght = mQuestions.mQuestions.length;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();

        answer1 = (Button) findViewById(R.id.Button2);
        answer2 = (Button) findViewById(R.id.Button3);
        answer3 = (Button) findViewById(R.id.Button4);
        answer4 = (Button) findViewById(R.id.Button5);

        Score = (TextView) findViewById(R.id.Score);
        Question = (TextView) findViewById(R.id.Question);

        Score.setText("Score:"+mScore);

        updateQuestion(r.nextInt(mQuestionsLenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText() == mAnswer){
                    mScore++;
                    Score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText() == mAnswer){
                    mScore++;
                    Score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText() == mAnswer){
                    mScore++;
                    Score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText() == mAnswer){
                    mScore++;
                    Score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();
                }
            }
        });
    }
    private void updateQuestion(int num){
        Question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getchoice1(num));
        answer2.setText(mQuestions.getchoice2(num));
        answer3.setText(mQuestions.getchoice3(num));
        answer4.setText(mQuestions.getchoice4(num));

        mAnswer=mQuestions.getCorrectAnswer(num);
    }
    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is" +mScore+"points.")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
    }
}

