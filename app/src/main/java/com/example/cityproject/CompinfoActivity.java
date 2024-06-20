package com.example.cityproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CompinfoActivity extends AppCompatActivity {

    private EditText itemEditText;
    private EditText complaintEditText;
    private EditText descriptionEditText;
    private EditText nameEditText;
    private EditText numberEditText;
    private EditText addressEditText;
    private EditText cityEditText;
    private EditText pincodeEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compinfo); // Replace with your layout file name

        // Initialize UI elements
        itemEditText = findViewById(R.id.item);
        complaintEditText = findViewById(R.id.complaint);
        descriptionEditText = findViewById(R.id.description);
        nameEditText = findViewById(R.id.name);
        numberEditText = findViewById(R.id.number);
        addressEditText = findViewById(R.id.address);
        cityEditText = findViewById(R.id.city);
        pincodeEditText = findViewById(R.id.pincode);
        submitButton = findViewById(R.id.submit);

    }
}
