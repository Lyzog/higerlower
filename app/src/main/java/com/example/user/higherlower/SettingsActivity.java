package com.example.user.higherlower;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_settings);

        ImageButton imagebutton = findViewById(R.id.backToMain);
        imagebutton.setOnClickListener(new View.OnClickListener(){
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
