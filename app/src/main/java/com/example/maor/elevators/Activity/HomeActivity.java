package com.example.maor.elevators.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maor.elevators.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button newElevatorButton = (Button) findViewById(R.id.add_new_elevator);
        newElevatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NewElevatorActivity.class));
            }
        });

        Button listOfElevatorButton = (Button) findViewById(R.id.list_of_elevators);
        listOfElevatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ListOfElevatorsActivity.class));
            }
        });




    }

}