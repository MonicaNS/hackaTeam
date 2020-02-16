package com.example.hackateam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    Button back;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backSignUp();
            }
        });
        login = findViewById(R.id.submitLogin);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openProfile();
            }
        });
    }
    public void backSignUp(){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void openProfile(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
