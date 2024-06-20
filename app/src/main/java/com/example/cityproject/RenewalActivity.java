package com.example.cityproject;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RenewalActivity extends AppCompatActivity {

    private EditText expireDateEditText, renewalStatusEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renewal);

        // Initialize UI elements
        expireDateEditText = findViewById(R.id.expiredate);
        renewalStatusEditText = findViewById(R.id.renewalstatus);
        updateButton = findViewById(R.id.submit);

        // Set click listener for the update button
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateRenewalStatus(); // Method to handle update action
            }
        });
    }

    private void updateRenewalStatus() {
        // Retrieve the text entered in the expire date EditText and renewal status EditText
        String expireDate = expireDateEditText.getText().toString().trim();
        String renewalStatus = renewalStatusEditText.getText().toString().trim();

        // Perform validation if needed
        if (expireDate.isEmpty() || renewalStatus.isEmpty()) {
            Toast.makeText(this, "Please enter both expire date and renewal status", Toast.LENGTH_SHORT).show();
            return;
        }

        // Example action: Display a toast message
        String message = "Updating renewal status for expire date: " + expireDate + ", with status: " + renewalStatus;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        // Here you can implement your logic to update the renewal status
        // For demonstration purposes, we just show a toast message
    }
}

