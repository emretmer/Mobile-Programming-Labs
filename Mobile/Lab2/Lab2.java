package com.example.lab21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    RadioButton rb_1;
    RadioButton rb_2;
    RadioButton rb_3;
    RadioButton rb_4;
    ConstraintLayout myLayout;
    ImageView myImage2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb_1 = findViewById(R.id.Yaz);
        rb_2 = findViewById(R.id.Kış);
        rb_3 = findViewById(R.id.Sonbahar);
        rb_4 = findViewById(R.id.Ilkbahar);
        myLayout = findViewById(R.id.cLayout);
        myImage2 = findViewById(R.id.imageView4);


    }

    public void secim(View view) {
        RadioButton rbTmp = (RadioButton) view;
        if (rbTmp.getId() == rb_1.getId()){
            Glide.with(this)
                    .load("https://i2.milimaj.com/i/milliyet/75/1200x675/61760cb245d2a0a1041a9751.jpg")
                    .into(myImage2);
        }
        else if (rbTmp.getId() == rb_2.getId()){
            Glide.with(this)
                    .load("https://ichef.bbci.co.uk/news/640/cpsprodpb/152E8/production/_110106768_0.p07wnf3h.jpg")
                    .into(myImage2);
        }
        else if (rbTmp.getId() == rb_3.getId()){
            Glide.with(this)
                    .load("https://img.piri.net/resim/upload/2021/09/22/10/53/0b9d25155f315a0573220b01a2d0caad_fall_2.jpeg")
                    .into(myImage2);
        }
        else if (rbTmp.getId() == rb_4.getId()){
            Glide.with(this)
                    .load("https://organikbibebe.com/wp-content/uploads/2018/10/ilkbahar-Mevsimi-Sebze-Meyve-ve-Baliklari.png")
                    .into(myImage2);
        }
    }
}

