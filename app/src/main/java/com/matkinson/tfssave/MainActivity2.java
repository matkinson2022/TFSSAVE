package com.matkinson.tfssave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView textView5,textView6,textView7,textView8,textView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            String nom = (String) extras.get("MessageName");
            textView5.setText(nom);
            String first = (String) extras.get("MessageFirstName");
            textView6.setText(first);
            String phone = (String) extras.get("MessagePhone");
            textView7.setText(phone);
            String email = (String) extras.get("MessageEmail");
            textView8.setText(email);
            String type = (String) extras.get("Message1");
            textView9.setText(type);

        }


    }
}