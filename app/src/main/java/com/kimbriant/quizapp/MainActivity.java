package com.kimbriant.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    EditText textEditName;
    EditText notificationNumber;
    TextView textView;
    String mainActivity;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        textEditName = findViewById(R.id.responseEditTextName);
        textView = findViewById(R.id.textBox);
        notificationNumber = findViewById(R.id.notificationNumber);
        mainActivity = "MainActivity";
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello mom!");
                Log.i("textButton", "Hi dad!" + textEditName.getText());
            }
        });
        textEditName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String textEditInput = textEditName.getText().toString();
                if(!hasFocus && textEditInput.equals("TJ")) {
                    System.out.println("Lost focus of textEditName");
                    textView.setText("TJ Rocks!");
                    textEditName.setText("");
                    textEditName.setHint("That's a gooooood name.");
                }
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Wassup");
                String currentTextEditInput = textEditName.getText().toString();
                String hi = "hi";
                textView.setText(hi + " " + currentTextEditInput);
                String wassup = "Log wassup!";
                Log.i(mainActivity, wassup);
                Log.i(mainActivity, currentTextEditInput);
                textEditName.clearFocus();
            }
        });
    }


}
