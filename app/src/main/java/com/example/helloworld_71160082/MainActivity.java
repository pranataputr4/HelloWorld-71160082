package com.example.helloworld_71160082;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btLogin;
    TextView eEmail, ePassword;
    String email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = (Button) findViewById(R.id.btnLogin);
        eEmail = (TextView) findViewById(R.id.edEmail);
        ePassword = (TextView) findViewById(R.id.edPassword);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = eEmail.getText().toString();
                pass = ePassword.getText().toString();

                Bundle b = new Bundle();
                b.putString("u", email);
                b.putString("p", pass);

                Intent in = new Intent(MainActivity.this, WelcomeBro.class);
                in.putExtras(b);
                startActivity(in);
            }
        });
    }
}
