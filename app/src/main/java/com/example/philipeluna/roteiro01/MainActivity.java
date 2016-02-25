package com.example.philipeluna.roteiro01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTexto = (TextView) findViewById(R.id.texto);
        Bundle bundle = getIntent().getExtras();
        Log.i("nome", bundle != null ? "tem negocio" : "vazio");
        String nome = bundle.getString("nome");
        String sobrenome = bundle.getString("sobrenome");
        mTexto.setText("Olá."+nome+"Seja bem vindo!");
    }
}
