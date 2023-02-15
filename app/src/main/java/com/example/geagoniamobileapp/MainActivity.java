package com.example.geagoniamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    @Override


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.caramel)));

        button = (Button) findViewById(R.id.button6);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button.setOnClickListener(view -> openHelloWorldMenu());
        button1.setOnClickListener(view -> openActivity_1());
        button2.setOnClickListener(view -> openActivity_2());
        button3.setOnClickListener(view -> openActivity_3());
        button3.setOnClickListener(view -> openExercise_1());
    }
    public void openHelloWorldMenu(){
        Intent intent = new Intent(this, HelloworldMenu.class);
        startActivity(intent);
    }
    public void openActivity_1(){
        Intent intent = new Intent(this, Activity_1.class);
        startActivity(intent);
    }
    public void openActivity_2(){
        Intent intent = new Intent(this, Activity_2.class);
        startActivity(intent);
    }
    public void openActivity_3(){
        Intent intent = new Intent(this, Activity_3.class);
        startActivity(intent);
    }
    public void openExercise_1(){
        Intent intent = new Intent(this, Exercise_1.class);
        startActivity(intent);
    }
}