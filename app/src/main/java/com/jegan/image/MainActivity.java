package com.jegan.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imgB1;
    TextView tv1;
    String s;

    CheckBox cb1,cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgB1=(ImageButton)findViewById(R.id.imageButton);
        tv1=(TextView)findViewById(R.id.txtView);

        cb1=(CheckBox)findViewById(R.id.checkBox);
        imgB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s="jegan";
                tv1.setText(s);

                Boolean test=cb1.isChecked();

                Toast.makeText(MainActivity.this,"Hello "+test,Toast.LENGTH_LONG).show();

            }
        });

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+cb1.isChecked(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
