package com.example.user.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

private ArrayList<Integer> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageView imgView=findViewById(R.id.card);
        imgView.setImageResource(R.drawable.ess_h);

        list = new ArrayList<>();
        list.add(R.drawable.ess_h);
       /* list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.); */
        list.add(R.drawable.ess_s);
        /* list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.); */
        list.add(R.drawable.ess_d);
        /*list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.); */
        list.add(R.drawable.ess_c);
        /*list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.);
        list.add(R.drawable.); */

    }
}
