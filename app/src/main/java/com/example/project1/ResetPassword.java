package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResetPassword extends AppCompatActivity {

    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        textInputLayout = findViewById(R.id.textInputLayout);
        textInputEditText = findViewById(R.id.InputPassword);

        textInputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String passwordInput = s.toString(); // Use 's' instead of 'charSequence'

                if (passwordInput.length() >= 8) {
                    Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
                    Matcher matcher = pattern.matcher(passwordInput);
                    boolean passwordMatch = matcher.find();
                    if (passwordMatch) {
                        textInputLayout.setHelperText("Your Password is Strong");
                        textInputLayout.setError("");
                    } else {
                        textInputLayout.setError("Mix of letters (upper and lower case), number and symbols");
                    }
                } else {
                    textInputLayout.setHelperText("Password must be at least 8 characters long");
                    textInputLayout.setError("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
