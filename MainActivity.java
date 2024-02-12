package com.example.prectical4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final EditText editText = findViewById(R.id.edit);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button submitButton = findViewById(R.id.submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from the EditText
                String enteredText = editText.getText().toString();

                // Display the text in a toast
                Toast.makeText(getApplicationContext(), "Text entered: " + enteredText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

