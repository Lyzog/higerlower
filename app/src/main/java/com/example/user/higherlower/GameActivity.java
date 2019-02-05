package com.example.user.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

private ArrayList<com.example.user.higherlower.Card> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_game);

        Card c1 = new Card(1, R.drawable.c_1);
        Card c2 = new Card(2, R.drawable.c_2);
      /*  Card c3 = new Card(3, R.drawable._3_c);
        Card c4 = new Card(4, R.drawable._4_c);
        Card c5 = new Card(5, R.drawable._5_c);
        Card c6 = new Card(6, R.drawable._6_c);
        Card c7 = new Card(7, R.drawable._7_c);
        Card c8 = new Card(8, R.drawable._8_c);
        Card c9 = new Card(9, R.drawable._9_c);
        Card c10 = new Card(10, R.drawable._10_c);
        Card cJ = new Card(11, R.drawable._j_c);
        Card cQ = new Card(12, R.drawable._q_c);
        Card cK = new Card(13, R.drawable._k_c);
        Card d1 = new Card(1, R.drawable._1_d);
        Card d2 = new Card(2, R.drawable._2_d);
        Card d3 = new Card(3, R.drawable._3_d);
        Card d4 = new Card(4, R.drawable._4_d);
        Card d5 = new Card(5, R.drawable._5_d);
        Card d6 = new Card(6, R.drawable._6_d);
        Card d7 = new Card(7, R.drawable._7_d);
        Card d8 = new Card(8, R.drawable._8_d);
        Card d9 = new Card(9, R.drawable._9_d);
        Card d10 = new Card(10, R.drawable._10_d);
        Card dJ = new Card(11, R.drawable._j_d);
        Card dQ = new Card(12, R.drawable._q_d);
        Card dK = new Card(13, R.drawable._k_d);
        Card h1 = new Card(1, R.drawable._1_h);
        Card h2 = new Card(2, R.drawable._2_h);
        Card h3 = new Card(3, R.drawable._3_h);
        Card h4 = new Card(4, R.drawable._4_h);
        Card h5 = new Card(5, R.drawable._5_h);
        Card h6 = new Card(6, R.drawable._6_h);
        Card h7 = new Card(7, R.drawable._7_h);
        Card h8 = new Card(8, R.drawable._8_h);
        Card h9 = new Card(9, R.drawable._9_h);
        Card h10 = new Card(10, R.drawable._10_h);
        Card hJ = new Card(11, R.drawable._j_h);
        Card hQ = new Card(12, R.drawable.q_h);
        Card hK = new Card(13, R.drawable._k_h);
        Card s1 = new Card(1, R.drawable._1_s);
        Card s2 = new Card(2, R.drawable._2_s);
        Card s3 = new Card(3, R.drawable._3_s);
        Card s4 = new Card(4, R.drawable._4_s);
        Card s5 = new Card(5, R.drawable._5_s);
        Card s6 = new Card(6, R.drawable._6_s);
        Card s7 = new Card(7, R.drawable._7_s);
        Card s8 = new Card(8, R.drawable._8_s);
        Card s9 = new Card(9, R.drawable._9_s);
        Card s10 = new Card(10, R.drawable._10_s);
        Card sJ = new Card(11, R.drawable._j_s);
        Card sQ = new Card(12, R.drawable._q_s);
        Card sK = new Card(13, R.drawable._k_s);
        */

        ImageView imgView=findViewById(R.id.card);
        imgView.(c1);  // need to fix so i can use the arraylist with list.get()

        list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
       /* list.add(c3);
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
        */
    }
}
