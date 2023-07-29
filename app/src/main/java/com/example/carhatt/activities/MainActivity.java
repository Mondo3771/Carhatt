package com.example.carhatt.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.carhatt.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void doSomething (View v){
       System.out.println("Hi");
       Intent intent = new Intent(getApplicationContext(), sign_UP.class);
       startActivity(intent);
   }

   public void Login (View v){
       Intent intent = new Intent(getApplicationContext(), userHome.class);
       startActivity(intent);
   }
}