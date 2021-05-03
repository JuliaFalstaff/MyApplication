package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView textViewResult;
    private TextView textViewCalc;
    private String lastResult = "";
    private char operator;
    private double totalResult = 0.0;
    private boolean isNewOperator = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String instanceState;
        if (savedInstanceState == null) {
            instanceState = "Первый запуск";
        } else {
            instanceState = "Повторный запуск";
        }
        Log.d(TAG, "onCreate()");


        textViewCalc = findViewById(R.id.textView_calc);
        textViewResult = findViewById(R.id.textView_result);
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "1");
            }
        });
        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "2");
            }
        });
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "3");
            }
        });
        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "4");
            }
        });
        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "5");
            }
        });
        Button button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "6");
            }
        });
        Button button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "7");
            }
        });
        Button button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "8");
            }
        });
        Button button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "9");
            }
        });
        Button button0 = findViewById(R.id.button_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperator) {
                    textViewCalc.setText("");
                    isNewOperator = false;
                }
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + "0");
            }
        });
        Button buttonDividing = findViewById(R.id.button_dividing);
        buttonDividing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNewOperator = true;
                operator = '/';
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + '/');
            }
        });
        Button buttonMultiplication = findViewById(R.id.button_multiplication);
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNewOperator = true;
                operator = '*';
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + '*');
            }
        });
        Button buttonEquals = findViewById(R.id.button_equals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalsMethod(true);
            }

            private void equalsMethod(boolean isLast) {
                double current = Double.parseDouble(textViewResult.getText().toString());
                double newResult = Double.parseDouble(lastResult);
                newResult = totalResult;
                totalResult = (double) getTotalResult(current);
                if (isLast) {
                    textViewResult.setText(String.valueOf(lastResult));
                }
            }

        });

        Button buttonSubtraction = findViewById(R.id.button_subtraction);
        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNewOperator = true;
                operator = '-';
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + '-');
            }
        });
        Button buttonAddition = findViewById(R.id.button_addition);
        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNewOperator = true;
                operator = '+';
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + '+');
            }
        });
        Button buttonPoint = findViewById(R.id.button_point);
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lastResult = textViewCalc.getText().toString();
                textViewCalc.setText(lastResult + '.');
            }
        });
    }

    public double getTotalResult(double current) {
        double newResult = Double.parseDouble(lastResult);
        switch (operator) {
            case '*':
                return newResult *= current;
            break;
            case '/':
                return newResult /= current;
            break;
            case '+':
                return newResult += current;
            break;
            case '-':
                return newResult -= current;
            break;



        }
        return newResult;
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPauset()");
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }


}

























