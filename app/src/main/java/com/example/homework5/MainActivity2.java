package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getIncomingInfo();
    }
    private void getIncomingInfo() {
        if (getIntent().hasExtra("data")) {
            String name = getIntent().getStringExtra("data");
            if (name.equals("Nursultan")) {
                setInfo(name + " " + "Erkinbaev"+"\n"+" gender: male");
            }
            if (name.equals("Pavel")) {
                setInfo(name + " " + "Marusov "+"\n"+"gender: male");
            }
            if (name.equals("Кубат")) {
                setInfo(name + " " + "Abdullaev"+"\n"+" gender: male");
            }
            if (!(name.equals("Nursultan") || name.equals("Pavel") || !name.equals("Kubat"))) {
                setInfo("Data error");
            }
        }
    }

    public void setInfo(String str){
        TextView textView = findViewById(R.id.text_view);
        textView.setText(str);

    }

}
