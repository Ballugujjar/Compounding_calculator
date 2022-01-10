package com.example.princeprice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber;
    EditText editTextNumber2;
    EditText editTextNumber3;
    Button button;
    TextView textView4,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
        button = findViewById(R.id.button);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        int price  = Integer.parseInt(editTextNumber.getText().toString());
        float percentage = Float.parseFloat(editTextNumber2.getText().toString());
        int time = Integer.parseInt(editTextNumber3.getText().toString());
        int p = time/12;
        int j = time%12;
        float total_price = price;
        for(int i = 0;i<p;i++){
            total_price = total_price*(1+percentage*12/100);
        }
        total_price = total_price*(1+percentage*j/100);
        float total_interest = total_price-price;
        textView4.setText("Net interest is = "+ total_interest);
        textView5.setText("Total price is = "+ total_price);

    }

    /*private float total_price(float percentage,int price, int time) {
        int p = time/12;
        int j = time%12;
        float total_price = price;
        for(int i = 0;i<p;i++){
            total_price = total_price*(1+percentage*12/100);
        }
        total_price = total_price(1+percentage*j/100);

    }*/
}