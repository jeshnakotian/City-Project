package com.example.cityproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class ComplaintActivity extends AppCompatActivity {

    private TextInputEditText emailEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint); // Replace with your XML layout name

        // Initialize views
        emailEditText = findViewById(R.id.email); // Replace with your TextInputEditText id
        updateButton = findViewById(R.id.submit); // Replace with your Button id

        // Set click listener for the button
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click here
                String email = emailEditText.getText().toString().trim();

                if (!email.isEmpty()) {
                    // Perform your update logic here (e.g., send data to server, update database)
                    // For demonstration, just show a toast message
                    Toast.makeText(ComplaintActivity.this, "Email entered: " + email, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ComplaintActivity.this, "Please enter an email", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
