package com.macadamian.smartpantry.ui.activities;

import android.os.Bundle;
import android.app.Activity;

import com.macadamian.smartpantry.R;

public class Shop extends Activity {
    String products[] = {"Milk", "Cereal", "Bread" , "Chips", "Chicken", "Apples", "Ham", "Fish"};
    int aisles[] = {1,2,2,2,3,4,3,5};
    String sections[] = {"Dairy, Grains, Grains, Grains, Meat, Produce, Meat, Seafood"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
    }

}
