package com.macadamian.smartpantry.ui.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.macadamian.smartpantry.R;

public class Shop extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Button button1 = (Button)findViewById(R.id.deli);

        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        System.out.print("yolo");
                    }
                }
        );
    }
}
