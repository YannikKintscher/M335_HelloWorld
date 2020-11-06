package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class TextInputToView extends AppCompatActivity {

    private static final String text = "Dein Text: ";

    private TextInputEditText textInputField;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_to_view);

        Button senden = findViewById(R.id.button2);
        senden.setOnClickListener(v -> sendTextFromInputToView());

        Button loeschen = findViewById(R.id.button3);
        loeschen.setOnClickListener(v -> clearAll());
    }

    @SuppressLint("SetTextI18n")
    private void sendTextFromInputToView() {
        textInputField = findViewById(R.id.textInputField);
        textView = findViewById(R.id.textView3);
        textView.setText(text + textInputField.getText());
    }

    @SuppressLint("SetTextI18n")
    private void clearAll() {
        textInputField.setText("");
        textView.setText(text);
    }
}