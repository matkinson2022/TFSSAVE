package com.matkinson.tfssave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private RadioButton radioButton;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2;
    private EditText editTextTextPersonName3;
    private EditText editTextPhone;
    private RadioGroup rdoGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        radioButton=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        editTextPhone=findViewById(R.id.editTextPhone);
        rdoGroup=findViewById(R.id.rdoGroup);



        button.setOnClickListener((v) -> {
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
          /*  rdoGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


                    @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    radioButton=findViewById(checkedId);
                    switch (radioButton.getId()){
                        case R.id.radioButton:
                            intent.putExtra("Message1","Staff");
                            break;
                        case R.id.radioButton2:
                            intent.putExtra("Message1","Visiteur");
                            break;
                        case R.id.radioButton3:
                            intent.putExtra("Message1","Eleve");
                            break;
                    }
                }
            }); */
            intent.putExtra("MessageName",editTextTextPersonName2.getText());
            intent.putExtra("MessageFirstName",editTextTextPersonName.getText());
            intent.putExtra("MessagePhone",editTextPhone.getText());
            intent.putExtra("MessageEmail",editTextTextPersonName3.getText());
            startActivity(intent);
        });
    }


}