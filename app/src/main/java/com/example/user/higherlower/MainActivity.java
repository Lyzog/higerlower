package com.example.user.higherlower;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               openGame();
           }
        });

    /*
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHighScore();
            }
        });

        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });
*/
    }
    public void openGame(){
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
    }

    /*
    public void  openHighScore(){
        Intent intent2 = new Intent(this, HighScoreActivity.class);
        startActivity(intent2);
    }

    public void  openSettings(){
        Intent intent3 = new Intent(this,SettingsActivity.class);
        startActivity(intent3);
    }
*/
}
