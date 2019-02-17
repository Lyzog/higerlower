package com.example.user.higherlower;

import android.content.Intent;
import android.graphics.Picture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

private ArrayList<com.example.user.higherlower.Card> list;

private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_game);

        Card c1 = new Card(1, R.drawable.c_1);
        Card c2 = new Card(2, R.drawable.c_2);
        Card c3 = new Card(3, R.drawable.c_3);
        Card c4 = new Card(4, R.drawable.c_4);
        Card c5 = new Card(5, R.drawable.c_5);
        Card c6 = new Card(6, R.drawable.c_6);
        Card c7 = new Card(7, R.drawable.c_7);
        Card c8 = new Card(8, R.drawable.c_8);
        Card c9 = new Card(9, R.drawable.c_9);
        Card c10 = new Card(10, R.drawable.c_10);
        Card cJ = new Card(11, R.drawable.c_j);
        Card cQ = new Card(12, R.drawable.c_q);
        Card cK = new Card(13, R.drawable.c_k);
        Card d1 = new Card(1, R.drawable.d_1);
        Card d2 = new Card(2, R.drawable.d_2);
        Card d3 = new Card(3, R.drawable.d_3);
        Card d4 = new Card(4, R.drawable.d_4);
        Card d5 = new Card(5, R.drawable.d_5);
        Card d6 = new Card(6, R.drawable.d_6);
        Card d7 = new Card(7, R.drawable.d_7);
        Card d8 = new Card(8, R.drawable.d_8);
        Card d9 = new Card(9, R.drawable.d_9);
        Card d10 = new Card(10, R.drawable.d_10);
        Card dJ = new Card(11, R.drawable.d_j);
        Card dQ = new Card(12, R.drawable.d_q);
        Card dK = new Card(13, R.drawable.d_k);
        Card h1 = new Card(1, R.drawable.h_1);
        Card h2 = new Card(2, R.drawable.h_2);
        Card h3 = new Card(3, R.drawable.h_3);
        Card h4 = new Card(4, R.drawable.h_4);
        Card h5 = new Card(5, R.drawable.h_5);
        Card h6 = new Card(6, R.drawable.h_6);
        Card h7 = new Card(7, R.drawable.h_7);
        Card h8 = new Card(8, R.drawable.h_8);
        Card h9 = new Card(9, R.drawable.h_9);
        Card h10 = new Card(10, R.drawable.h_10);
        Card hJ = new Card(11, R.drawable.h_j);
        Card hQ = new Card(12, R.drawable.h_q);
        Card hK = new Card(13, R.drawable.h_k);
        Card s1 = new Card(1, R.drawable.s_1);
        Card s2 = new Card(2, R.drawable.s_2);
        Card s3 = new Card(3, R.drawable.s_3);
        Card s4 = new Card(4, R.drawable.s_4);
        Card s5 = new Card(5, R.drawable.s_5);
        Card s6 = new Card(6, R.drawable.s_6);
        Card s7 = new Card(7, R.drawable.s_7);
        Card s8 = new Card(8, R.drawable.s_8);
        Card s9 = new Card(9, R.drawable.s_9);
        Card s10 = new Card(10, R.drawable.s_10);
        Card sJ = new Card(11, R.drawable.s_j);
        Card sQ = new Card(12, R.drawable.s_q);
        Card sK = new Card(13, R.drawable.s_k);

        list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);
        list.add(c8);
        list.add(c9);
        list.add(c10);
        list.add(cJ);
        list.add(cQ);
        list.add(cK);
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);
        list.add(d7);
        list.add(d8);
        list.add(d9);
        list.add(d10);
        list.add(dJ);
        list.add(dQ);
        list.add(dK);
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
        list.add(h6);
        list.add(h7);
        list.add(h8);
        list.add(h9);
        list.add(h10);
        list.add(hJ);
        list.add(hQ);
        list.add(hK);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);
        list.add(sJ);
        list.add(sQ);
        list.add(sK);

        Random random = new Random();
        int n = random.nextInt(52);

        final Card card =  list.get(n);

        final ImageView imgView=findViewById(R.id.card);
        imgView.setImageResource(card.picture);


        button = findViewById(R.id.buttonHigher);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int n = random.nextInt(52);
                Card card =  list.get(n);

                if (card.value > n){
                    System.out.println("abcdefghijkl");
                }
                else {
                    ImageView imgView = findViewById(R.id.card);
                    imgView.setImageResource(card.picture);

                    System.out.println(n);

                }
            }
        });

        button = findViewById(R.id.buttonLower);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int n = random.nextInt(52);
                Card card =  list.get(n);

                if (card.value < n){
                    System.out.println(123456789);
                }
                else {
                    ImageView imgView = findViewById(R.id.card);
                    imgView.setImageResource(card.picture);

                    System.out.println(n);

                }
            }

        });

    }
}
