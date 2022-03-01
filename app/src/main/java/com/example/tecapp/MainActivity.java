package com.example.tecapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


        btn3.setOnClickListener(view -> {
            textView.setText("Button C");
        });
    }

    public void PushHandler(View view) {
        textView.setText("You've clicked the button.");
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn1) {
            textView.setText("Button A");
        }
        else {
            textView.setText("Button B");
        }
    }
}