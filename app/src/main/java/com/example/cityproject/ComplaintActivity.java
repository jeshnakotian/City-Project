package com.example.cityproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ComplaintActivity extends AppCompatActivity {

    private EditText emailEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

        // Initialize UI elements
        emailEditText = findViewById(R.id.email);
        updateButton = findViewById(R.id.submit);

        // Set click listener for the update button
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateComplaint(); // Method to handle update action
            }
        });
    }

    private void updateComplaint() {
        // Retrieve the text entered in the email EditText
        String email = emailEditText.getText().toString().trim();

        // Perform validation if needed
        if (email.isEmpty()) {
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        // Example action: Display a toast message
        Toast.makeText(this, "Updating complaint with email: " + email, Toast.LENGTH_SHORT).show();

        // Here you can implement your logic to update the complaint or perform other actions
        // For demonstration purposes, we just show a toast message
    }
}
