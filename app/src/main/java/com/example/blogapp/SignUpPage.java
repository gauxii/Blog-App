package com.example.blogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpPage extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6;
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_page);
        ed1=(EditText) findViewById(R.id.namme);
        ed2=(EditText) findViewById(R.id.emaill);
        ed3=(EditText) findViewById(R.id.mob);
        ed4=(EditText) findViewById(R.id.user);
        ed5=(EditText) findViewById(R.id.paz);
        ed6=(EditText) findViewById(R.id.confpaz);
        b1=(AppCompatButton) findViewById(R.id.register);
        b2=(AppCompatButton) findViewById(R.id.bactolog);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Registered",Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e1=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(e1);
            }
        });
    }
}