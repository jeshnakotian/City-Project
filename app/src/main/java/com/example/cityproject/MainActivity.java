package com.example.cityproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, numberEditText, usernameEditText, passwordEditText, confirmPasswordEditText;
    private Button submitButton;
    private TextView createAccountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        nameEditText = findViewById(R.id.name);
        numberEditText = findViewById(R.id.number);
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        confirmPasswordEditText = findViewById(R.id.confirmpassword);
        submitButton = findViewById(R.id.submit);
        createAccountTextView = findViewById(R.id.createaccount);

        // Set onClickListener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle submit button click
                String name = nameEditText.getText().toString().trim();
                String number = numberEditText.getText().toString().trim();
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                String confirmPassword = confirmPasswordEditText.getText().toString().trim();

                // You can add your validation logic here

                // After validation, you can proceed with the sign-up process
            }
        });

        // Set onClickListener for the create account textview
        createAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle create account textview click
                // Redirect to the login activity or perform any other action
            }
        });
    }
}
