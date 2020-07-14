package com.example.loginregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration extends AppCompatActivity {
    Button reg_final, login_final;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_main);

        reg_final = findViewById(R.id.reg_final);
        login_final = findViewById(R.id.login_final);

        login_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(registration.this,MainActivity.class);
                startActivity(reg);
            }
        });
        reg_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(registration.this,welcome.class);
                startActivity(reg);
            }
        });

    }
}