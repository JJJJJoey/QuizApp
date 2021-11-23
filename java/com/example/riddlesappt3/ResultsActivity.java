package com.example.riddlesappt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    TextView mScore,mFinalScore;
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mScore=(TextView)findViewById(R.id.congrats);
        mFinalScore=(TextView)findViewById(R.id.score);
        mButton=(Button) findViewById(R.id.start_over);

        Bundle bundle=getIntent().getExtras();
        int score=bundle.getInt("finalScore");

        mFinalScore.setText("You scored:  "+score);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultsActivity.this,MainActivity.class));
                ResultsActivity.this.finish();
            }
        });
    }
}