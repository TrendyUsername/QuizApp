package com.kimbriant.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    EditText textEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        textEdit = findViewById(R.id.responseEditText);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello mom!");
                Log.i("textButton", "Hi dad!" + textEdit.getText());
            }
        });
        textEdit.setText(textEdit.getText().toString() + " " + textEdit.getText().toString());
        textEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus) {
                    textEdit.setText("Ahhhhh");
                }
            }
        });
    }


}
