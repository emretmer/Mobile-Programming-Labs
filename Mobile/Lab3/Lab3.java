package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.time.Instant;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Switch mySw;
    ConstraintLayout myLayout;
    Spinner mySpinner;
    ImageView myImage;
    ArrayList <String> elemanlar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySw = findViewById(R.id.switch1);
        myLayout = findViewById(R.id.cLayout);
        mySpinner = findViewById(R.id.spinner);
        myImage = findViewById(R.id.imageView);

        elemanlar = new ArrayList<>();
        elemanlar.add("leonardo");
        elemanlar.add("raphael");
        elemanlar.add("michelangelo");
        elemanlar.add("donatello");
        String imgUrl = "https://picsum.photos/200/300";


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, elemanlar);

        mySpinner.setAdapter(arrayAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, elemanlar.get(i), Toast.LENGTH_LONG).show();

                if (elemanlar.get(i).equals("leonardo")) {
                    Picasso.with(MainActivity.this).load(imgUrl).placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(myImage);
                    String imgUrl = " ";

                }
                else if (elemanlar.get(i).equals("raphael")) {
                    Picasso.with(MainActivity.this).load(imgUrl).placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(myImage);
                    String imgUrl = " ";

                }
                else if (elemanlar.get(i).equals("michelangelo")) {
                    Picasso.with(MainActivity.this).load(imgUrl).placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(myImage);
                    String imgUrl = " ";

                }
                else if (elemanlar.get(i).equals("donatello")) {
                    Picasso.with(MainActivity.this).load(imgUrl).placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(myImage);
                    String imgUrl = " ";

                }
                String imgUrl = "https://picsum.photos/200/300";
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    public void gecemetodu(View view) {
        Switch tmp = (Switch) view;
        if (tmp.isChecked()) {
            myLayout.setBackgroundColor(Color.BLACK);
        }
        else {
            myLayout.setBackgroundColor(Color.WHITE);
        }

    }
}