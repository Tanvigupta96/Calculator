package com.example.tanvigupta.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener{
    Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multiply, divide, equals, delete, decimal, reset;
    TextView textView;
    float num1, num2;
    boolean operatorPressed = false;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        equals = findViewById(R.id.equals);
        delete = findViewById(R.id.delete);
        decimal = findViewById(R.id.decimal);
        reset = findViewById(R.id.reset);
        textView = findViewById(R.id.text1);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        equals.setOnClickListener(this);
        delete.setOnClickListener(this);
        decimal.setOnClickListener(this);
        reset.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        calculate(view);

    }

    private void calculate(View view) {
        String buttonValue, outputString, operator = "";
        switch (view.getId()) {
            case R.id.one:
                buttonValue = one.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;

            case R.id.two:
                buttonValue = two.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;

            case R.id.three:
                buttonValue = two.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;

            case R.id.four:
                buttonValue = two.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;

            case R.id.five:
                buttonValue = two.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;

            case R.id.six:
                buttonValue = two.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;


            case R.id.seven:
                buttonValue = two.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;


            case R.id.eight:
                buttonValue = two.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;

            case R.id.nine:
                buttonValue = two.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;

            case R.id.zero:
                buttonValue = two.getText().toString();
                if (operatorPressed) {
                    textView.setText("");
                }
                outputString = textView.getText().toString();
                textView.setText(outputString + buttonValue);
                operatorPressed = false;
                break;

            case R.id.plus:
                operatorPressed = true;
                String textValue = textView.getText().toString();
                num1 = Float.parseFloat(textValue);
                operator = "+";
                break;

            case R.id.minus:
                operatorPressed = true;
                textValue = textView.getText().toString();
                num1 = Float.parseFloat(textValue);
                operator = "-";
                break;

            case R.id.multiply:
                operatorPressed = true;
                textValue = textView.getText().toString();
                num1 = Float.parseFloat(textValue);
                operator = "*";
                break;

            case R.id.divide:
                operatorPressed = true;
                textValue = textView.getText().toString();
                num1 = Float.parseFloat(textValue);
                operator = "/";
                break;


            case R.id.equals:
                textValue = textView.getText().toString();
                num2 = Float.parseFloat(textValue);
                if (operator.equals("+")) {
                    textView.setText(String.valueOf(num1+num2));
                } else if (operator.equals("-")) {
                    textView.setText(String.valueOf(num1-num2));
                } else if (operator.equals("*")) {
                    textView.setText(String.valueOf(num1*num2));
                } else if (operator.equals("/")) {
                    textView.setText(String.valueOf(num1/num2));
                }


            case R.id.reset:
                operatorPressed = false;
                num1 = 0;
                num2 = 0;
                break;


        }
    }


}


