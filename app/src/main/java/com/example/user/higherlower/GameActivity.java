package com.example.user.higherlower;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private ArrayList<com.example.user.higherlower.Card> list;

    private Button button;

    private Card card;

    final Context context = this;

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

        list.add(c1); //0
        list.add(c2); //1
        list.add(c3); //2
        list.add(c4); //3
        list.add(c5); //4
        list.add(c6); //5
        list.add(c7); //6
        list.add(c8); //7
        list.add(c9); //8
        list.add(c10); //9
        list.add(cJ); //10
        list.add(cQ); //11
        list.add(cK); //12
        list.add(d1); //13
        list.add(d2); //14
        list.add(d3); //15
        list.add(d4); //16
        list.add(d5); //17
        list.add(d6); //18
        list.add(d7); //19
        list.add(d8); //20
        list.add(d9); //21
        list.add(d10); //22
        list.add(dJ); //23
        list.add(dQ); //24
        list.add(dK); //25
        list.add(h1); //26
        list.add(h2); //27
        list.add(h3); //28
        list.add(h4); //29
        list.add(h5); //30
        list.add(h6); //31
        list.add(h7); //32
        list.add(h8); //33
        list.add(h9); //34
        list.add(h10); //35
        list.add(hJ); //36
        list.add(hQ); //37
        list.add(hK); //38
        list.add(s1); //39
        list.add(s2); //40
        list.add(s3); //41
        list.add(s4); //42
        list.add(s5); //43
        list.add(s6); //44
        list.add(s7); //45
        list.add(s8); //46
        list.add(s9); //47
        list.add(s10); //48
        list.add(sJ); //49
        list.add(sQ); //50
        list.add(sK); //51

        Random random = new Random();
        int n = random.nextInt(52);
        card = list.get(n);

        button = findViewById(R.id.buttonHigher);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random random = new Random();
                int n = random.nextInt(52);
                int c = card.value;
                card = list.get(n);

                if (c < card.value) {
                    ImageView imgView = findViewById(R.id.card);
                    imgView.setImageResource(card.picture);
                    //    System.out.println(n + " this is higher than previous");
                } else if (c == card.value) { // denna behövs inte bara för att see bättre
                    ImageView imageView = findViewById(R.id.card);
                    imageView.setImageResource(card.picture);

                    //  System.out.println(n + " this is equal than previous");
                } else {
                    AlertDialog.Builder alert = new AlertDialog.Builder(context);
                    alert.setMessage("Game Over");
                    alert.setCancelable(true);
                    alert.setPositiveButton("end", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alert1 = alert.create();
                    alert1.show();
                    //System.out.println(n + " this is lower than previous when it should have been higher");
                    // add alert
                }
            }
        });

        button = findViewById(R.id.buttonLower);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int n = random.nextInt(52);
                int c = card.value;
                Log.d("David", "present: " + c);
                card = list.get(n);
                Log.d("David", "next: " + card.value);

                if (c > card.value) {
                    ImageView imgView = findViewById(R.id.card);
                    imgView.setImageResource(card.picture);

                    System.out.println(n + " this is lower than previous");
                } else if (c == card.value) { // denna behövs inte bara för att se bättre
                    ImageView imageView = findViewById(R.id.card);
                    imageView.setImageResource(card.picture);

                    System.out.println(n + " this is equal than previous");
                } else {

                    AlertDialog.Builder alert = new AlertDialog.Builder(context);
                    alert.setMessage("Game Over");
                    alert.setCancelable(true);
                    alert.setPositiveButton("end", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alert1 = alert.create();
                    alert1.show();
                /*
                    Intent intent = new Intent(GameActivity.this, MainActivity.class);
                    startActivity(intent);
                    */

                    System.out.println(n + " this is higher than previous when it should have been lower");
                    // add alert / alarmruta / not is
                }
            }
        });
        final ImageView imgView = findViewById(R.id.card);
        imgView.setImageResource(card.picture);
    }
}
