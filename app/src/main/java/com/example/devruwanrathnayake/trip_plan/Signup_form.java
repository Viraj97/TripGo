package com.example.devruwanrathnayake.trip_plan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class Signup_form extends AppCompatActivity {

    EditText txtFullname, txtUsername,txtEmail, txtPassword, txtConfirmPassword;
    Button btn_register;
    ProgressBar progressBar;
    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        getSupportActionBar().setTitle("Signup Form");

        txtFullname = (EditText)findViewById(R.id.txtName);
        txtUsername = (EditText)findViewById(R.id.txtUserName);
        txtEmail = (EditText)findViewById(R.id.txtEmail);
        txtPassword = (EditText)findViewById(R.id.txtpassword);
        txtConfirmPassword = (EditText)findViewById(R.id.txtConfirmPassword);

        database =  FirebaseDatabase.getInstance();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fullname = txtFullname.getText().toString().trim();
                String username = txtUsername.getText().toString().trim();
                String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();
                String confirmpassword = txtConfirmPassword.getText().toString().trim();

                if(TextUtils.isEmpty(fullname)){
                    Toast.makeText(Signup_form.this, "Please Enter Fullname", Toast.LENGTH_SHORT);
                    return;
                }

                if(TextUtils.isEmpty(username)){
                    Toast.makeText(Signup_form.this, "Please Enter Username", Toast.LENGTH_SHORT);
                    return;
                }

                if(TextUtils.isEmpty(email)){
                    Toast.makeText(Signup_form.this, "Please Enter Email", Toast.LENGTH_SHORT);
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    Toast.makeText(Signup_form.this, "Please Enter Password", Toast.LENGTH_SHORT);
                    return;
                }


                if(TextUtils.isEmpty(confirmpassword)){
                    Toast.makeText(Signup_form.this, "Please Enter Password", Toast.LENGTH_SHORT);
                    return;
                }

                if(password.length()<6){
                    Toast.makeText(Signup_form.this,"Password too short", Toast.LENGTH_SHORT);
                }

                progressBar.setVisibility(View.VISIBLE);

                if(password.equals(confirmpassword)){

                }













            }
        });

    }
}
