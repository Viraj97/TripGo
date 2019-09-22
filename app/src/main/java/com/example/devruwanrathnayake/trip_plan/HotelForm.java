package com.example.devruwanrathnayake.trip_plan;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class HotelForm extends AppCompatActivity {
    DatabaseReference databaseReference;
    form form;
    EditText HotelName, customerName, email, tp, rooms,type, in, out;
    Button btnSave;

    private void clearControls() {
        customerName.setText("");
        email.setText("");
        tp.setText("");
        type.setText("");
        rooms.setText("");
        in.setText("");
        out.setText("");
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_form);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        customerName = findViewById(R.id.txtName);
        tp = findViewById(R.id.txtMob);
        email = findViewById(R.id.txtEmail);
        rooms = findViewById(R.id.txthow);
        type = findViewById(R.id.txttype);
        in = findViewById(R.id.txtcheckin);
        out = findViewById(R.id.txtcheckout);
        btnSave = findViewById(R.id.btnSend);
        form = new form();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }


        });

        final Button send = (Button) findViewById(R.id.btnSend);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myformat ="MM/DD/YY";
                databaseReference = FirebaseDatabase.getInstance().getReference().child("Hotel");
                SimpleDateFormat sdf = new SimpleDateFormat(myformat, Locale.US);
                try {

                    form.setCustomerName(customerName.getText().toString().trim());
                    form.setTp(tp.getText().toString().trim());
                    form.setEmail(email.getText().toString().trim());
                    form.setRooms(rooms.getText().toString().trim());
                    form.setRoomtype(type.getText().toString().trim());
                    form.setIn(type.getText().toString().trim());
                    form.setOut(type.getText().toString().trim());

                    databaseReference.push().setValue(form);
                    Toast.makeText(getApplicationContext(), "Your Booking added Successfully", Toast.LENGTH_SHORT).show();
                }
                finally {
                    clearControls();
                }
            }
        });
    }
}