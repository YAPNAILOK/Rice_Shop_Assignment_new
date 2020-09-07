package com.example.riceshopassignmentnew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {
    private EditText InputUsername, InputEmail, InputPassword, InputConfirmPassword;
    private Button btnSignup;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        InputUsername = (EditText) findViewById(R.id.Username);
        InputEmail = (EditText) findViewById(R.id.EmailAddress);
        InputPassword = (EditText) findViewById(R.id.Password);
        InputConfirmPassword = (EditText) findViewById(R.id.ConfirmPassword);
        btnSignup = (Button) findViewById(R.id.btn_signup);

        firebaseAuth = FirebaseAuth.getInstance();

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = InputEmail.getText().toString();
                String password = InputPassword.getText().toString();
                firebaseAuth.createUserWithEmailAndPassword(email,password)
                        .addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                Intent intent = new Intent(SignupActivity.this,HomePageActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });
            }
        });
    }
}