package com.example.riddlesappt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mStartButton;
    Button mExitButton;
    Button mAboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartButton = (Button)findViewById(R.id.startButton);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RiddlesActivity.class));
            }
        });
        mAboutButton = (Button) findViewById(R.id.aboutButton);
        mAboutButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,AboutActivity.class));
            }
        });

        mExitButton = (Button) findViewById(R.id.exitButton);
        mExitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                finish();
                System.exit(0);
            }
        });
    }
}