package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button image = findViewById(R.id.Hidden);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecond();
            }
        });

        Button buttonOne = findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }

    public void openNewActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void openSecond(){
        Intent intent = new Intent(this,biryani_r.class);
        startActivity(intent);
    }
}
