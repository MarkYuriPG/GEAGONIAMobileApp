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
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.caramel)));

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(view -> openHelloWorldMenu());
    }
    public void openHelloWorldMenu(){
        Intent intent = new Intent(this, HelloworldMenu.class);
        startActivity(intent);
    }
}