package com.demo.vendomachine_amionegaytacolod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText amount_num;
    String strAmount;
    int userMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInsert = (Button) findViewById(R.id.btnAmount);

        btnInsert.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        CalculateAmount();
    }

    public void CalculateAmount() {
        amount_num = (EditText) findViewById(R.id.amount_num);

        strAmount = amount_num.getText().toString();
        userMoney = Integer.parseInt(strAmount);

        if (userMoney <= 50) {
            piknikIntent();

        } else if (userMoney > 50 && userMoney <= 1000) {
            pringlesIntent();
        }


    }

    public void piknikIntent() {
        Bundle args = new Bundle();
        args.putString("result", strAmount);

        Intent intent = new Intent(MainActivity.this, Piknik.class);
        intent.putExtras(args);
        startActivity(intent);

    }

    public void pringlesIntent() {
        Bundle args = new Bundle();
        args.putString("result", strAmount);

        Intent intent = new Intent(MainActivity.this, Pringles.class);
        intent.putExtras(args);
        startActivity(intent);
    }

}