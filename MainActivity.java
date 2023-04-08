package com.example.loginapplication;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView userName = findViewById(R.id.userName);
        TextView userPassword = findViewById(R.id.userPassword);

        MaterialButton loginBtn = findViewById(R.id.loginBtn);

        //admin and admin

        loginBtn.setOnClickListener(view -> {
            if (userName.getText().toString().equals("admin") && userPassword.getText().toString().equals("admin")) {
                //correct
                Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
            } else {
                //incorrect
                Toast.makeText(MainActivity.this, "LOGIN FAILED!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
