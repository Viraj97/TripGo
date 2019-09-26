package com.example.devruwanrathnayake.trip_plan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.core.view.View;

public class Login_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("Login Form");
    }



    public void btn_signupForm(android.view.View view) {
        startActivity(new Intent(getApplicationContext(),Signup_form.class));
    }

}
