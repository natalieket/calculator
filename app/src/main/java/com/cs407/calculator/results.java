package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class results extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        double result = intent.getDoubleExtra("result",110);
        textView.setText("Result: "+ result);
    }
}