package com.example.blogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuPage extends AppCompatActivity {
AppCompatButton b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_page);
        b1=(AppCompatButton) findViewById(R.id.ad);
        b2=(AppCompatButton) findViewById(R.id.del);
        b3=(AppCompatButton) findViewById(R.id.sear);
        b4=(AppCompatButton) findViewById(R.id.view);
        b5=(AppCompatButton) findViewById(R.id.log);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e3=new Intent(getApplicationContext(), AddPage.class);
                startActivity(e3);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent e4=new Intent(getApplicationContext(), DeletePage.class);
               startActivity(e4);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent e5=new Intent(getApplicationContext(),SearchPage.class);
             startActivity(e5);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent e6=new Intent(getApplicationContext(), ViewPage.class);
               startActivity(e6);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e7=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(e7);
            }
        });
    }
}