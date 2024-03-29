package com.example.hp.intenttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnReturn;
    int sum = 0;
    int number1 = 0, number2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(this);

        //getIntent 속에 값이 들어있다.
        Intent intent = getIntent();
        number1 = intent.getIntExtra("number1", 0);
        number2 = intent.getIntExtra("number2", 0);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        sum = number1 + number2;
        intent.putExtra("sum", sum);
        setResult(1001, intent);
        finish();
    }
}
