package com.example.riddlesappt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RiddlesActivity extends AppCompatActivity {
    private Questions mQuestions=new Questions();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonAnswer1;
    private Button mButtonAnswer2;
    private Button mButtonAnswer3;

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddles);

        final MediaPlayer correctMP= MediaPlayer.create(this,R.raw.correct);
        final MediaPlayer wrongMP= MediaPlayer.create(this,R.raw.wrong);


        mScoreView=(TextView)findViewById(R.id.score);
        mQuestionView=(TextView)findViewById(R.id.question);
        mButtonAnswer1=(Button)findViewById(R.id.answer1);
        mButtonAnswer2=(Button)findViewById(R.id.answer2);
        mButtonAnswer3=(Button)findViewById(R.id.answer3);

        updateQuestion();

        //Start Action Listener for button1
        mButtonAnswer1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mButtonAnswer1.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    correctMP.start();
                    //test to see if we are in the last question
                    if (mQuestionNumber == Questions.mQuestions.length){
                        Intent intent = new Intent(RiddlesActivity.this,ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        RiddlesActivity.this.finish();
                        startActivity(intent);

                    }else{
                        updateQuestion();
                    }

                    //toast
                    Toast.makeText(RiddlesActivity.this,"correct",Toast.LENGTH_SHORT).show();


                }else{
                    Toast.makeText(RiddlesActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    wrongMP.start();
                    if (mQuestionNumber == Questions.mQuestions.length){
                        Intent intent = new Intent(RiddlesActivity.this,ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        RiddlesActivity.this.finish();
                        startActivity(intent);

                    }else{
                        updateQuestion();
                    }
                }
            }
        });
        mButtonAnswer2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mButtonAnswer2.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    correctMP.start();
                    if (mQuestionNumber == Questions.mQuestions.length){
                        Intent intent = new Intent(RiddlesActivity.this,ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        RiddlesActivity.this.finish();
                        startActivity(intent);

                    }else{
                        updateQuestion();
                    }
                    //toast
                    Toast.makeText(RiddlesActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(RiddlesActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    wrongMP.start();
                    if (mQuestionNumber == Questions.mQuestions.length){
                        Intent intent = new Intent(RiddlesActivity.this,ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        RiddlesActivity.this.finish();
                        startActivity(intent);

                    }else{
                        updateQuestion();
                    }
                }
            }
        });
        mButtonAnswer3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mButtonAnswer3.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    correctMP.start();
                    if (mQuestionNumber == Questions.mQuestions.length){
                        Intent intent = new Intent(RiddlesActivity.this,ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        RiddlesActivity.this.finish();
                        startActivity(intent);

                    }else{
                        updateQuestion();
                    }
                    //toast
                    Toast.makeText(RiddlesActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(RiddlesActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    wrongMP.start();
                    if (mQuestionNumber == Questions.mQuestions.length){
                        Intent intent = new Intent(RiddlesActivity.this,ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        RiddlesActivity.this.finish();
                        startActivity(intent);

                    }else{
                        updateQuestion();
                    }
                }
            }
        });



    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestions.getQuestion(mQuestionNumber));
        mButtonAnswer1.setText(mQuestions.getAnswer1(mQuestionNumber));
        mButtonAnswer2.setText(mQuestions.getAnswer2(mQuestionNumber));
        mButtonAnswer3.setText(mQuestions.getAnswer3(mQuestionNumber));

        mAnswer=mQuestions.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }
    private void updateScore(int point){
        mScoreView.setText(""+mScore);
    }
}