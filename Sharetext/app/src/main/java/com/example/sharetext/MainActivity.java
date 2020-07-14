package com.example.sharetext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button share;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        share = findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = text.getText().toString();
                Intent forward = new Intent(Intent.ACTION_SEND);
                forward.setType("text/plain");
                forward.putExtra(Intent.EXTRA_TEXT, s);
                startActivity(forward);
            }
        });

    }
}