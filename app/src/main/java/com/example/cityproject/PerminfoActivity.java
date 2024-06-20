package com.example.cityproject;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PerminfoActivity extends AppCompatActivity {

    private EditText itemEditText, descriptionEditText, validFromEditText, validToEditText, nameEditText, numberEditText, addressEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perminfo);

        // Initialize UI elements
        itemEditText = findViewById(R.id.item);
        descriptionEditText = findViewById(R.id.description);
        validFromEditText = findViewById(R.id.validfrom);
        validToEditText = findViewById(R.id.validto);
        nameEditText = findViewById(R.id.name);
        numberEditText = findViewById(R.id.number);
        addressEditText = findViewById(R.id.address);
        submitButton = findViewById(R.id.submit);

        // Set click listener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitPermissions(); // Method to handle submit action
            }
        });
    }

    private void submitPermissions() {
        // Retrieve the text entered in the EditText fields
        String item = itemEditText.getText().toString().trim();
        String description = descriptionEditText.getText().toString().trim();
        String validFrom = validFromEditText.getText().toString().trim();
        String validTo = validToEditText.getText().toString().trim();

    }
}


