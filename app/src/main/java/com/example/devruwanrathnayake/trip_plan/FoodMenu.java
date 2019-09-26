package com.example.devruwanrathnayake.trip_plan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.database.core.view.View;

public class FoodMenu extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6;

    String choices = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

    }

    public void add_to_list(View view){
      if(view == findViewById(R.id.button1)){

      }

    }
}
