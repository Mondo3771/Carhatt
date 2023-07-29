package com.example.carhatt.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.carhatt.R;
import com.example.carhatt.interfaces.RequestHandler;
import com.example.carhatt.models.PHPHandler;

import org.json.JSONException;

public class sign_UP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void doSignUp(View v){
        EditText edt = findViewById(R.id.edttxtName);
        String name, cell, email, password, ID_num, confPWD;
        name  = edt.getText().toString();
        edt = findViewById(R.id.edttxtCell);
        cell = edt.getText().toString();
        edt = findViewById(R.id.edttxtEmail);
        email = edt.getText().toString();
        edt = findViewById(R.id.edttxtPWD);
        password = edt.getText().toString();
        edt = findViewById(R.id.edttxtIDnum);
        ID_num = edt.getText().toString();
        edt = findViewById(R.id.edtConfirmPWD);
        confPWD = edt.getText().toString();



        PHPHandler phpHandler = new PHPHandler(); System.out.println("sdsd");
        phpHandler.SignUp(this,email, ID_num, cell, name, password, confPWD, new RequestHandler() {
            @Override
            public void ProcessResponse(String response) throws JSONException {

                Toast.makeText(getApplicationContext(),response, Toast.LENGTH_SHORT).show();
                if(response.equals("Registration successful")){
                    Intent intent = new Intent(getApplicationContext(),userHome.class);
                    startActivity(intent);
                }
            }
        });



    }
}