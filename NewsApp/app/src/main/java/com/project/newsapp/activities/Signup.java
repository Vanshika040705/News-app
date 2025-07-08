package com.project.newsapp.activities;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.project.newsapp.R;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Signup extends AppCompatActivity {
    private EditText emailInput, passwordInput, confirmPasswordInput;
    private Button signupButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        emailInput = findViewById(R.id.signup_email);
        passwordInput = findViewById(R.id.signup_password);
        confirmPasswordInput = findViewById(R.id.signup_confirm);
        signupButton = findViewById(R.id.signup_button);
        loginButton = findViewById(R.id.login_button); // Button to navigate to login

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();
                String confirmPassword = confirmPasswordInput.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(Signup.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.equals(confirmPassword)) {
                    new SignupTask().execute(email, password);
                } else {
                    Toast.makeText(Signup.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                }
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to login screen if the user wants to login
                Intent intent = new Intent(Signup.this, Login.class); // Assuming you have a Login activity
                startActivity(intent);
                finish();
            }
        });
    }

    private class SignupTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            String email = params[0];
            String password = params[1];

            try {
//                URL url = new URL("http://10.0.2.2/server/signup.php");
                URL url = new URL("http://192.168.29.135:80/server/signup.php");


                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);

                OutputStream os = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));

                String postData = URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8") + "&" +
                        URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");

                writer.write(postData);
                writer.flush();
                writer.close();
                os.close();

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                return response.toString();

            } catch (Exception e) {
                e.printStackTrace();
                return "Exception: " + e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(Signup.this, result, Toast.LENGTH_SHORT).show();

            if (result.contains("Signup successful")) {
                // Redirect to the login screen or main activity upon successful signup
                Intent intent = new Intent(Signup.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }
}