package com.example.rejestracja;

import static com.example.rejestracja.R.id.button1;
import static com.example.rejestracja.R.id.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button b;
    public boolean validRegistration=true;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+'.'+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            b = findViewById(button1);

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText email = findViewById(R.id.editTextTextEmailAddress);
                    EditText password = findViewById(R.id.editTextTextPassword);
                    EditText confirmPassword = findViewById(R.id.editTextTextPassword2);


                    if(email.getText().toString().isEmpty()) {
                        Toast.makeText(getApplicationContext(),"enter email address",Toast.LENGTH_SHORT).show();
                    }else {
                        if (email.getText().toString().trim().contains("@")) {
                            Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
                            validRegistration = false;
                        }
                    }
                    if(password == confirmPassword){
                        Toast.makeText(getApplicationContext(),"passwords match",Toast.LENGTH_SHORT).show();
                    }
                    else if(password != confirmPassword){
                        Toast.makeText(getApplicationContext(), "passwords don't match", Toast.LENGTH_SHORT).show();
                        validRegistration=false;
                    }
                    if (validRegistration == true)
                    {
                        Toast.makeText(getApplicationContext(), "Witaj"+email,Toast.LENGTH_SHORT).show();
                    }
                }

                });
            }

    }
