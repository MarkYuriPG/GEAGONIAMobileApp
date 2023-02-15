package com.example.geagoniamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(view -> openHelloWorldMenu());
    }
    public void openHelloWorldMenu(){
        Intent intent = new Intent(this, HelloworldMenu.class);
        startActivity(intent);
    }
}