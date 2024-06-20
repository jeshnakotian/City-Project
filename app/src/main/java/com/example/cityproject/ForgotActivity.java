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

public class ForgotActivity extends AppCompatActivity {

    private TextInputEditText emailEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot); // Set the content view to your XML layout

        // Initialize views
        emailEditText = findViewById(R.id.email); // Reference to TextInputEditText with id "email"
        submitButton = findViewById(R.id.submit); // Reference to Button with id "submit"

        // Set click listener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle submit button click
                String email = emailEditText.getText().toString().trim();

                if (!email.isEmpty()) {
                    // Simulate password reset functionality (replace with actual logic)
                    simulatePasswordReset(email);
                } else {
                    Toast.makeText(ForgotActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void simulatePasswordReset(String email) {
        // Replace this method with actual logic to send password reset email
        // For demonstration, just show a toast message
        Toast.makeText(this, "Password reset email sent to " + email, Toast.LENGTH_SHORT).show();
    }
}
