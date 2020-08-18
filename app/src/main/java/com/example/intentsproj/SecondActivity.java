package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etnum1;
    EditText etnum2;

    TextView lblSum;

    String num1;
    String num2;

    int textView_num1;
     int textView_num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etnum1 = findViewById(R.id.etnum1);
        etnum2 = findViewById(R.id.etnum2);
        lblSum=findViewById(R.id.lblSum);

        Intent intent = getIntent();

        num1=intent.getStringExtra("textView_num1");
        num2=intent.getStringExtra("textView_num2");

        etnum1.setText(num1);
        etnum2.setText(num2);

        textView_num1=Integer.parseInt(num1);
        textView_num2=Integer.parseInt(num2);
    }

    public void Add(View view){
        lblSum.setText(num1+ "+" +num2+"="+(textView_num1 +textView_num2));
    }
    public void Substract(View view){
        lblSum.setText(num1+ "-" +num2+"="+(textView_num1 - textView_num2));
    }
    public void Multiply(View view){
        lblSum.setText(num1+ "x" +num2+"="+(textView_num1 * textView_num2));
    }
    public void Devide(View view){
        lblSum.setText(num1+ "/" +num2+"="+(textView_num1 / textView_num2));
    }
}