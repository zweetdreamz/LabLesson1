package ru.mirea.razuvaev.clickbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okButton = (Button) findViewById(R.id.okButton);
        Button cancelButton = (Button) findViewById(R.id.cancelButton);
        final TextView textView = (TextView) findViewById(R.id.textView);

        Button.OnClickListener buttonOkListener = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка ОК");
            }
        };

        Button.OnClickListener buttonCancelListener = new  Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка CANCEL");
            }
        };

        okButton.setOnClickListener(buttonOkListener);
        cancelButton.setOnClickListener(buttonCancelListener);
    }
}
