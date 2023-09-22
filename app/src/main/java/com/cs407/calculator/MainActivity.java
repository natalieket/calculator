package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickAddFunction(View view){
        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);
        String num1Str = num1.getText().toString();
        String num2Str = num2.getText().toString();
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            double num1Int = Double.parseDouble(num1Str);
            double num2Int = Double.parseDouble(num2Str);
            double result = num1Int + num2Int;
            goToActivity(result);
        } else {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
        }
    }

    public void clickSubtractFunction(View view){
        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);
        String num1Str = num1.getText().toString();
        String num2Str = num2.getText().toString();
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            double num1Int = Double.parseDouble(num1Str);
            double num2Int = Double.parseDouble(num2Str);
            double result = num1Int - num2Int;
            goToActivity(result);
        } else {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
        }
    }

    public void clickMultiplyFunction(View view){
        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);
        String num1Str = num1.getText().toString();
        String num2Str = num2.getText().toString();
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            double num1Int = Double.parseDouble(num1Str);
            double num2Int = Double.parseDouble(num2Str);
            double result = num1Int * num2Int;
            goToActivity(result);
        } else {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
        }
    }

    public void clickDivideFunction(View view){
        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);
        String num1Str = num1.getText().toString();
        String num2Str = num2.getText().toString();
        if (!num2Str.isEmpty() && Integer.parseInt(num2Str)==0){
            Toast.makeText(this, "Cannot divide by 0.", Toast.LENGTH_SHORT).show();
        } else if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            double num1Int = Double.parseDouble(num1Str);
            double num2Int = Double.parseDouble(num2Str);
            double result = num1Int / num2Int;
            goToActivity(result);
        } else {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToActivity(double i){
        Intent intent = new Intent(this, results.class);
        intent.putExtra("result",i);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}