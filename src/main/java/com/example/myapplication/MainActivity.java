package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);

        Button login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Username: " + username.getText() + "\n" +
                                "Password: " + password.getText(),
                        Toast.LENGTH_SHORT).show();
                username.setError(null);
                if (!Validation.isValidCredentials(username.getText().toString())){
                    username.setError("Klaida! pasitikrinkite duomenys");
                    username.requestFocus();
                }else { //jeigu prisijungimo duomenys teisingi
                    Intent goToSearchActivity = new Intent(MainActivity.this, SearchActivity.class);
                    startActivity(goToSearchActivity);
                }
            }
        });
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register:
                setContentView(R.layout.register);
                break;
            case R.id.back_from_register:
                setContentView(R.layout.activity_main);
                break;
            default:
                break;

        }
    }
}
