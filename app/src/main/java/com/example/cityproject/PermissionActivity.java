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

public class PermissionActivity extends AppCompatActivity {

    private TextInputEditText emailEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission); // Set the content view to your XML layout

        // Initialize views
        emailEditText = findViewById(R.id.email); // Reference to TextInputEditText with id "email"
        updateButton = findViewById(R.id.submit); // Reference to Button with id "submit"

        // Set click listener for the update button
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle update button click
                String email = emailEditText.getText().toString().trim();

                if (!email.isEmpty()) {
                    // Perform your update logic here (e.g., update permission status)
                    // For demonstration, just show a toast message
                    Toast.makeText(PermissionActivity.this, "Permission updated for email: " + email, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(PermissionActivity.this, "Please enter an email", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
