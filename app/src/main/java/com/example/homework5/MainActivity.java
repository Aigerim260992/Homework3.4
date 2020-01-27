package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener{

  RecyclerView recyclerView;
  MainAdapter adapter;
  EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new MainAdapter();
        adapter.listener = this;
        recyclerView.setAdapter(adapter);
        editText = findViewById(R.id.edit_text);
    }

    public void enterText(View view) {
        String abc = editText.getText().toString();
        adapter.addText(abc);
    }

    public void showInfo(String s){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class );
        intent.putExtra("data", s);
        startActivity(intent);
    }
    @Override
    public void onCLick(String st) {
        showInfo(st);

    }
}
