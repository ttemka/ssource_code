package com.example.temuulen.practice5_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnDiv, btnMul;
    TextView textResult;
    String num1, num2;
    Integer result;

    Button[] numButtons= new Button[10];
    Integer[] numBtnIDs={R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,
            R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9};
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("TableLayout Calculator");

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        textResult = (TextView) findViewById(R.id.textResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("Result:" + result.toString());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("Result:" + result.toString());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("Result:" + result.toString());
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("Result:" + result.toString());
            }
        });
        for(i=0; i<numButtons.length;i++)
        {
            final int index;
            index=i;

            numButtons[index].setOnClickListener(new View.OnClickListener(){

                @Override
            public void onClick(View arg0)
                {
                    if(edit1.isFocused()==true)
                    {
                        num1=edit1.getText().toString()+numButtons[index].getText().toString();
                        edit1.setText(num1);
                    }
                    if(edit2.isFocused()==true)
                    {
                        num2=edit2.getText().toString()+numButtons[index].getText().toString();
                        edit2.setText(num2);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Click on the edittext",0).show();
                    }
                }
            });
        }
    }
}
