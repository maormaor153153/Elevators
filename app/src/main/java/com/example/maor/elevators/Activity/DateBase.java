package com.example.maor.elevators.Activity;

import com.google.firebase.database.DatabaseReference;

/**
 * Created by Maor on 18/12/2017.
 */

public class DateBase {

    private static DatabaseReference mDatabase ;
    private static DatabaseReference allElevatorsData;

    public static DatabaseReference dateget()
    {
        return mDatabase;
    }

    public static DatabaseReference getAllElevatorsData()
    {
        return allElevatorsData;
    }





}
