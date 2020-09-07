package com.example.riceshopassignmentnew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity<DatabaseReference> extends AppCompatActivity {
    private EditText InputEmail, InputPassword;
    private Button btnLogin;
    private TextView mTextRegister;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        InputEmail = (EditText) findViewById(R.id.EmailAddress);
        InputPassword = (EditText) findViewById(R.id.Password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        mTextRegister = (TextView) findViewById(R.id.register);

        firebaseAuth = FirebaseAuth.getInstance();

        mTextRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = InputEmail.getText().toString();
                String password = InputPassword.getText().toString();
                firebaseAuth.signInWithEmailAndPassword(email,password)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                Intent intent = new Intent(LoginActivity.this,HomePageActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });
            }
        });
    }

    private void validate(String email,String password) {
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (!task.isSuccessful()) {
                    Toast.makeText(LoginActivity.this, "This email is't registered", Toast.LENGTH_SHORT).show();
                } else {
                    checkifEmailVirified();
                }
            }
        });
    }

    private void checkifEmailVirified() {
        FirebaseUser user = firebaseAuth.getCurrentUser();
        assert user != null;
        if (user.isEmailVerified()) {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, HomePageActivity.class));
        } else {
            Toast.makeText(this, "check your email", Toast.LENGTH_SHORT).show();
        }
    }
}
