package com.demo.vendomachine_amionegaytacolod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pringles2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String result = extras.getString("result");
        setContentView(R.layout.activity_pringles2);

        TextView tvAmt = (TextView) findViewById(R.id.tvAmount);
        tvAmt.setText(result);
        Button btnReturn = (Button) findViewById(R.id.btn_return);
        btnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Pringles2.this, MainActivity.class);
        startActivity(intent);
    }
}