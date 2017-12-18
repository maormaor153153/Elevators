package com.example.maor.elevators.Activity;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.maor.elevators.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
public class NewElevatorActivity extends AppCompatActivity {


    DatabaseReference mDatabase =  DateBase.dateget();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_elevator);
        createClockForCheck();

        mDatabase = FirebaseDatabase.getInstance().getReference("NewEle");
    }


    @Override
    protected void onResume() {
        super.onResume();


        final EditText numberElevator = (EditText) findViewById(R.id.number_elevators2);
        final EditText city = (EditText) findViewById(R.id.city2);
        final EditText streetNum = (EditText) findViewById(R.id.street_num2);
        final EditText liftStage = (EditText) findViewById(R.id.lift_stage2);

        final Button dateEnter = (Button) findViewById(R.id.date_enter2);
        final Button dateCheck = (Button) findViewById(R.id.date_check);

        final Button upload = (Button) findViewById(R.id.sender);





        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("number", "ele");
              //  mDatabase.setValue(numberElevator.getText().toString());
              //  mDatabase.setValue(city.getText().toString());

                DatabaseReference childRef = mDatabase.child("number Elevator");
                childRef.setValue(numberElevator.getText().toString());

                DatabaseReference childRef1 = mDatabase.child("city");
                childRef1.setValue(city.getText().toString());

                DatabaseReference childRef2 = mDatabase.child("street and number");
                childRef2.setValue(streetNum.getText().toString());

                DatabaseReference childRef3 = mDatabase.child("lift stage");
                childRef3.setValue(liftStage.getText().toString());


                //DatabaseReference childRef4 = mDatabase.child("date enter");
                //childRef4.setValue(dateEnter);





            }
        });




    }






    private void createClockForCheck() {
        Button dateCheck = (Button) findViewById(R.id.date_check);

        Button dateEnter = (Button) findViewById(R.id.date_enter2);

        final int d, m, y;
        Calendar calender = Calendar.getInstance();
        d = calender.get(Calendar.DAY_OF_MONTH);
        m = calender.get(Calendar.MONTH);
        y = calender.get(Calendar.YEAR);

        // m = m+1;
        dateCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(NewElevatorActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int y, int m, int d) {

                    }
                }, y, m, d);
                datePickerDialog.show();
            }
        });


        dateEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(NewElevatorActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int y, int m, int d) {

                    }
                }, y, m, d);
                datePickerDialog.show();
            }
        });

    }
}
