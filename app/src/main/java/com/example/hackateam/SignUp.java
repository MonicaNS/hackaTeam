package com.example.hackateam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    private Button login;
    private Button signup;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLogin();
            }
        });
        signup = (Button)findViewById(R.id.submitButton);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edittext   = (EditText)findViewById(R.id.firstNameEntry);
                String firstname = edittext.getText().toString();
                System.out.println("first name: "+firstname);
                openSubmit();
            }
        });
    }

    public void openLogin(){
        System.out.println("dvnfdfj");
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void openSubmit(){
        System.out.println("here");
    }


}
