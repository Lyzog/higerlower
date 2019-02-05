package com.example.user.higherlower;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HighScoreActivity extends AppCompatActivity {

    private ImageButton button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_highscore);

        button = findViewById(R.id.backToMain);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goBackToMain();
            }
        });
    }

    public void goBackToMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
