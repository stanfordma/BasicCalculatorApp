package com.example.basiccalculatorapp;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEvent1(View view) {
        EditText enteredText = findViewById(R.id.enteredNumber);
        EditText enteredText2 = findViewById(R.id.enteredNumber2);
        int num = parseInt(enteredText.getText().toString());
        int num2 = parseInt(enteredText2.getText().toString());
        int answer = num+num2;
        goToActivity2(answer);
    }

    public void clickEvent2(View view) {
        EditText enteredText = findViewById(R.id.enteredNumber);
        EditText enteredText2 = findViewById(R.id.enteredNumber2);
        int num = parseInt(enteredText.getText().toString());
        int num2 = parseInt(enteredText2.getText().toString());
        int answer = num-num2;
        goToActivity2(answer);
    }

    public void clickEvent3(View view) {
        EditText enteredText = findViewById(R.id.enteredNumber);
        EditText enteredText2 = findViewById(R.id.enteredNumber2);
        int num = parseInt(enteredText.getText().toString());
        int num2 = parseInt(enteredText2.getText().toString());
        int answer = num*num2;
        goToActivity2(answer);
    }

    public void clickEvent4(View view) {
        EditText enteredText = findViewById(R.id.enteredNumber);
        EditText enteredText2 = findViewById(R.id.enteredNumber2);
        int num = parseInt(enteredText.getText().toString());
        int num2 = parseInt(enteredText2.getText().toString());
        int answer = num/num2;
        goToActivity2(answer);
    }

    public void goToActivity2(int answer){
        Intent intent = new Intent(this,MainActivity2.class);
        String str = String.valueOf(answer);
        intent.putExtra("answer",str);
        startActivity(intent);
    }
}