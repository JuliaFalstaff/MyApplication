package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;
    private double numberOne;
    private double numberTwo;
    private boolean operationAddition;
    private boolean operationSubtract;
    private boolean operationDivide;
    private boolean operatorMultiply;
    private char arithmeticOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.textView_result);
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "1");
            }
        });
        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "2");
            }
        });
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "3");
            }
        });
        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "4");
            }
        });
        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "5");
            }
        });
        Button button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "6");
            }
        });
        Button button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "7");
            }
        });
        Button button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "8");
            }
        });
        Button button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "9");
            }
        });
        Button button0 = findViewById(R.id.button_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + "0");
            }
        });
        //Operation Buttons
        Button buttonDividing = findViewById(R.id.button_dividing);
        buttonDividing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Double.parseDouble(textViewResult.getText().toString() + "");
                operationDivide = true;
                arithmeticOperation = '/';
                textViewResult.setText(null);
            }
        });
        Button buttonMultiplication = findViewById(R.id.button_multiplication);
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Double.parseDouble(textViewResult.getText().toString() + "");
                operatorMultiply = true;
                arithmeticOperation = '*';
                textViewResult.setText(null);
            }
        });
        Button buttonSubtraction = findViewById(R.id.button_subtraction);
        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Double.parseDouble(textViewResult.getText().toString() + "");
                operationSubtract = true;
                arithmeticOperation = '-';
                textViewResult.setText(null);
            }
        });
        Button buttonAddition = findViewById(R.id.button_addition);
        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Double.parseDouble(textViewResult.getText().toString() + "");
                operationAddition = true;
                arithmeticOperation = '+';
                textViewResult.setText(null);
            }
        });
        Button buttonPoint = findViewById(R.id.button_point);
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(textViewResult.getText().toString() + ".");
            }
        });
        Button buttonClear = findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText("");
            }
        });
        Button buttonEquals = findViewById(R.id.button_equals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                numberTwo = Double.parseDouble(textViewResult.getText().toString() + "");
                if ((operationAddition)) {
                    textViewResult.setText(addition() + "");
                    operationAddition = false;
                } else if ((operationSubtract)) {
                    textViewResult.setText(subtract() + "");
                    operationSubtract = false;
                } else if ((operatorMultiply)) {
                    textViewResult.setText(multiply() + "");
                    operatorMultiply = false;
                } else if ((operationDivide)) {
                    textViewResult.setText(divide() + "");
                    operationDivide = false;
                }
            }
        });
    }
    //methods of operations
    public double divide(){
        return numberOne /= numberTwo;
    }
    public double multiply(){
        return numberOne *= numberTwo;
    }
    public double subtract(){
        return numberOne -= numberTwo;
    }
    public double addition(){
        return numberOne += numberTwo;
    }
}

























