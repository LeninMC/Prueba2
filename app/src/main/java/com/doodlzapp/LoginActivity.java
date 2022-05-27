package com.doodlzapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText txtUsuario;
    private EditText txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtPassword = findViewById(R.id.txtPassword);



    }

    public void onClicAceptar(View view) {

        String user = txtUsuario.getText().toString();
        String password = txtPassword.getText().toString();
        //nombre.toUpperCase(Locale.ROOT);
        if (!user.matches("") && !password.matches("") ) {
            if ((user.matches("Lenin") && password.matches("Lenin")) ||
                    (user.matches("Bryan") && password.matches("Bryan"))){
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("key_user",user);

                startActivity(intent);
            }else {
                Toast.makeText(this, "Usuarios o contraseña incorrectos ", Toast.LENGTH_LONG).show();
            }

        } else {
            Toast.makeText(this, "Usuario y contraseña son obligatorios", Toast.LENGTH_LONG).show();
        }
    }
}