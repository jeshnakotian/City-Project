package com.example.cityproject;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotActivity extends AppCompatActivity {

    private EditText emailEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        // Initialize UI elements
        emailEditText = findViewById(R.id.email);
        submitButton = findViewById(R.id.submit);

        // Set click listener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendPasswordResetEmail(); // Method to handle submit action
            }
        });
    }

    private void sendPasswordResetEmail() {
        // Retrieve the email entered in the email EditText
        String email = emailEditText.getText().toString().trim();

        // Perform validation if needed
        if (email.isEmpty()) {
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        // Example action: Display a toast message
        Toast.makeText(this, "Password reset email sent to: " + email, Toast.LENGTH_SHORT).show();

        // Here you can implement your logic to send the password reset email
        // For demonstration purposes, we just show a toast message
    }
}

