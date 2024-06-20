package com.example.cityproject;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PermissionActivity extends AppCompatActivity {

    private EditText itemEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);

        // Initialize UI elements
        itemEditText = findViewById(R.id.email);
        updateButton = findViewById(R.id.submit);

        // Set click listener for the update button
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updatePermission(); // Method to handle update action
            }
        });
    }

    private void updatePermission() {
        // Retrieve the text entered in the item EditText
        String item = itemEditText.getText().toString().trim();

        // Perform validation if needed
        if (item.isEmpty()) {
            Toast.makeText(this, "Please enter item", Toast.LENGTH_SHORT).show();
            return;
        }

        // Example action: Display a toast message
        Toast.makeText(this, "Updating permission for item: " + item, Toast.LENGTH_SHORT).show();

        // Here you can implement your logic to update the permission or perform other actions
        // For demonstration purposes, we just show a toast message
    }
}

