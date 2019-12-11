package ru.mirea.razuvaev.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myEditText = (EditText) findViewById(R.id.editText);
        myEditText.setText("Тони Старк");
        Button button = findViewById(R.id.button13);
    }
}