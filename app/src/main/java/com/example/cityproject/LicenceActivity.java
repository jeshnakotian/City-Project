package com.example.cityproject;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LicenceActivity extends AppCompatActivity {

    private EditText emailEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licence); // Replace with your layout file name

        // Initialize UI elements
        emailEditText = findViewById(R.id.email);
        updateButton = findViewById(R.id.submit);

        // Set click listener for the update button
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateLicence(); // Method to handle update action
            }
        });
    }

    private void updateLicence() {
        // Retrieve the text entered in the email EditText
        String email = emailEditText.getText().toString().trim();

        // Perform validation if needed
        if (email.isEmpty()) {
            Toast.makeText(this, "Pleaase enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        // Example action: Display a toast message
        Toast.makeText(this, "Update requested for email: " + email, Toast.LENGTH_SHORT).show();
    }
}
