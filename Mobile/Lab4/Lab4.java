package com.example.lab421;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText myText;
    EditText myText2;
    EditText myText3;
    TextView myLabel;
    TextView myLabel2;
    TextView myLabel3;
    Button myButton;
    Button myButton2;
    Button myButton3;
    SharedPreferences preferences = getSharedPreferences("Kulllanici_Ayar",MODE_PRIVATE);
    SharedPreferences.Editor editor = preferences.edit();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = findViewById(R.id.editText);
        myText2 = findViewById(R.id.editText2);
        myText3 = findViewById(R.id.editText3);
        myLabel = findViewById(R.id.textView);
        myLabel2 = findViewById(R.id.textView2);
        myLabel3 = findViewById(R.id.textView3);
        myButton = findViewById(R.id.button);
        myButton2 = findViewById(R.id.button2);
        myButton3 = findViewById(R.id.button3);


        editor.putString("kul_ad","emretmer");
        editor.putString("kul_pw","123321");
        editor.putString("kul_mail","mail@gg");
        editor.apply();
    }
    public void yaz(View view) {
        editor.putString("kul_ad",myText.getText().toString());
        editor.putString("kul_pw",myText2.getText().toString());
        editor.putString("kul_mail",myText3.getText().toString());
    }

    public void temizle(View view) {
        myText.setText("");
        myText2.setText("");
        myText3.setText("");
    }

    public void oku(View view) {
        myLabel.setText("");
    }

}