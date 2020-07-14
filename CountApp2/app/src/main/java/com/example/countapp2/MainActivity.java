package com.example.countapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int temp = 0;

    Button first,second,third,fourth;
    TextView center;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        center = findViewById(R.id.center);

        first.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                temp++;
                center.setText("" + temp);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                temp--;
                center.setText("" + temp);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                temp = 0;
                center.setText("" + 0);
            }
        });

        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Your count is : " + temp,
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });


    }
}