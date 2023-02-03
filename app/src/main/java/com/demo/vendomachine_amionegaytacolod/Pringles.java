package com.demo.vendomachine_amionegaytacolod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Pringles extends AppCompatActivity {
    int change1, change2, itemPrice1 = 100, itemPrice2 = 95, tvAmnt;
    String finalChange1, finalChange2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String result = extras.getString("result");
        setContentView(R.layout.activity_pringles);

        tvAmnt = Integer.parseInt(String.valueOf(result));
        change1 = tvAmnt - itemPrice1;
        change2 = tvAmnt - itemPrice2;

        finalChange1 = Integer.toString(change1);
        finalChange2 = Integer.toString(change2);

        ImageView imgOne = findViewById(R.id.item3View2);
        imgOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toPringles1();
            }
        });
        ImageView imgTwo = findViewById(R.id.item4View2);
        imgTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toPringles2();
            }
        });
    }

    public void toPringles1() {
        finalChange1 = "Amount Inserted : " + tvAmnt + "\n" +
                "Item Price: " + itemPrice1 + "\n" +
                "Change: " + finalChange1;

        Bundle args = new Bundle();
        args.putString("result", finalChange1);

        Intent intent = new Intent(Pringles.this, Pringles1.class);
        intent.putExtras(args);
        startActivity(intent);
    }

    public void toPringles2() {
        finalChange2 = "Amount Inserted : " + tvAmnt + "\n" +
                "Item Price: " + itemPrice2 + "\n" +
                "Change: " + finalChange2;

        Bundle args = new Bundle();
        args.putString("result", finalChange2);

        Intent intent = new Intent(Pringles.this, Pringles2.class);
        intent.putExtras(args);
        startActivity(intent);
    }
}