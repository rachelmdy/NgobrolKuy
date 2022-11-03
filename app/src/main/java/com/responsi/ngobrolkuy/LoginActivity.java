package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private TextView tvForget;
    private Button btnLogin, btnAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.login_etUsername);
        etPassword = findViewById(R.id.login_etPassword);
        tvForget = findViewById(R.id.login_tvForget);
        btnLogin = findViewById(R.id.login_btnLogin);
        btnAkun = findViewById(R.id.login_btnAkun);
        tvForget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RecoverPasswordActivity.class);
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                Intent i = new Intent(LoginActivity.this, ProfilePicActivity.class);
                i.putExtra("username", username);
                i.putExtra("password", password);
                startActivity(i);
            }
        });

        btnAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}