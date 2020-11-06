package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class TextInputToView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_to_view);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(v -> sendTextFromInputToView());
    }

    private void sendTextFromInputToView() {
        TextInputEditText textInputField = findViewById(R.id.textInputField);
        TextView textView = findViewById(R.id.textView3);
        textView.setText(textInputField.getText());
    }
}