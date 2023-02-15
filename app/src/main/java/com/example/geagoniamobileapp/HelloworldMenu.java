package com.example.geagoniamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class HelloworldMenu extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld_menu);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.caramel)));

        button1 = (Button) findViewById(R.id.button8);
        button2 = (Button) findViewById(R.id.button9);
        button3 = (Button) findViewById(R.id.button10);

        button1.setOnClickListener(view -> openActivity_1());
        button2.setOnClickListener(view -> openActivity_2());
        button3.setOnClickListener(view -> openActivity_3());
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
}