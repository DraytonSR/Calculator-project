package com.example.dscott.calculator_redick;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    TextView numView;

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonC;
    Button buttonCE;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMulti;
    Button buttonDiv;
    Button buttonDec;
    Button buttonEquals;

    int currentNum = 0;
    String currentOp = "noOp";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numView = findViewById(R.id.numView);
        numView.setText("");
        numView.setTextColor(Color.BLACK);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonC = findViewById(R.id.buttonC);
        buttonCE = findViewById(R.id.buttonCE);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonDec = findViewById(R.id.buttonDec);
        buttonEquals = findViewById(R.id.buttonEquals);

        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 0", Toast.LENGTH_LONG).show();

                numView.append("0");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 1", Toast.LENGTH_LONG).show();

                if(currentOp.equals("noOp") && currentNum == 0){
                    currentNum = 1;
                }
                else if(currentOp.equals("noOp") && currentNum != 0){
                    String concat = String.valueOf(currentNum) + "1";
                    currentNum = Integer.parseInt(concat);
                }
                else if(currentOp.equals("+")){
                    currentNum += 1;
                }
                else if(currentOp.equals("-")){
                    currentNum -= 1;
                }
                else if(currentOp.equals("*")){
                    currentNum *= 1;
                }
                else if(currentOp.equals("/")){
                    currentNum /= 1;
                }

                numView.append("1");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 2", Toast.LENGTH_LONG).show();


                numView.append("2");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 3", Toast.LENGTH_LONG).show();
                numView.append("3");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 4", Toast.LENGTH_LONG).show();
                numView.append("4");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 5", Toast.LENGTH_LONG).show();
                numView.append("5");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 6", Toast.LENGTH_LONG).show();
                numView.append("6");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 7", Toast.LENGTH_LONG).show();
                numView.append("7");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 8", Toast.LENGTH_LONG).show();
                numView.append("8");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed 9", Toast.LENGTH_LONG).show();
                numView.append("9");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed C", Toast.LENGTH_LONG).show();
                numView.setText("");
                numView.setTextColor(Color.BLACK);


            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(), "pressed CE", Toast.LENGTH_LONG).show();
                numView.setText("");
                numView.setTextColor(Color.BLACK);
                currentNum = 0;
                currentOp = "noOp";

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed +", Toast.LENGTH_LONG).show();

                if(currentOp.equals("noOp")){
                    currentOp = "+";
                    numView.append("+");
                }
                else{
                    Toast.makeText(getApplicationContext(), currentOp, Toast.LENGTH_LONG).show();
                }

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed -", Toast.LENGTH_LONG).show();
                if(currentOp.equals("noOp")){
                    currentOp = "-";
                    numView.append("-");
                }
                else{
                    Toast.makeText(getApplicationContext(), "bad input", Toast.LENGTH_LONG).show();
                }

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed *", Toast.LENGTH_LONG).show();
                if(currentOp.equals("noOp")){
                    currentOp = "*";
                    numView.append("*");
                }
                else{
                    Toast.makeText(getApplicationContext(), "bad input", Toast.LENGTH_LONG).show();
                }

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed /", Toast.LENGTH_LONG).show();
                if(currentOp.equals("noOp")){
                    currentOp = "/";
                    numView.append("/");
                }
                else{
                    Toast.makeText(getApplicationContext(), "bad input", Toast.LENGTH_LONG).show();
                }

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed .", Toast.LENGTH_LONG).show();
                numView.append(".");

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(getApplicationContext(), "pressed Equals", Toast.LENGTH_LONG).show();

                //These are funny jokes ha ha
                if(numView.getText().toString().equals("69")) {
                    Toast.makeText(getApplicationContext(), "nice", Toast.LENGTH_LONG).show();

                }
                if(numView.getText().toString().equals("420")){
                    numView.setTextColor(Color.GREEN);
                }
                //End humor

                String solution = Integer.toString(currentNum);
                numView.setText(solution);

                //Reset operator
                currentOp = "noOp";

            }
        });
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    }
}
