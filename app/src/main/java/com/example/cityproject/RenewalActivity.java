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

public class RenewalActivity extends AppCompatActivity {

    private TextInputEditText expireDateEditText;
    private TextInputEditText renewalStatusEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renewal); // Set the content view to your XML layout

        // Initialize views
        expireDateEditText = findViewById(R.id.expiredate); // Reference to TextInputEditText with id "expiredate"
        renewalStatusEditText = findViewById(R.id.renewalstatus); // Reference to TextInputEditText with id "renewalstatus"
        updateButton = findViewById(R.id.submit); // Reference to Button with id "submit"

        // Set click listener for the update button
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle update button click
                String expireDate = expireDateEditText.getText().toString().trim();
                String renewalStatus = renewalStatusEditText.getText().toString().trim();

                if (!expireDate.isEmpty() && !renewalStatus.isEmpty()) {
                    // Perform your update logic here (e.g., update renewal status based on expire date)
                    // For demonstration, just show a toast message
                    Toast.makeText(RenewalActivity.this, "Renewal status updated for expire date: " + expireDate
                            + " and status: " + renewalStatus, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RenewalActivity.this, "Please enter expire date and renewal status", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
