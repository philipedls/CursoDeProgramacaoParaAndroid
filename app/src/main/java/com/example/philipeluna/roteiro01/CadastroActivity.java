package com.example.philipeluna.roteiro01;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText mNome;
    private EditText mSobrenome;
    private EditText mUsuario;
    private EditText mSenha;
    private EditText mConfirmacaoDaSenha;
    private Button mBotaoCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        mNome = (EditText) findViewById(R.id.nome);
        mSobrenome = (EditText) findViewById(R.id.sobremone);
        mUsuario = (EditText) findViewById(R.id.usuario);
        mSenha = (EditText) findViewById(R.id.senha);
        mConfirmacaoDaSenha = (EditText) findViewById(R.id.confirmar_senha);
        mBotaoCadastrar = (Button) findViewById(R.id.botao);

        mBotaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(CadastroActivity.this, MainActivity.class);
                cadastrar();

            }
        });
    }

    private void cadastrar() {

        String nome = mNome.getText().toString();
        String sobrenome = mSobrenome.getText().toString();
        String usuario = mUsuario.getText().toString();
        String senha = mSenha.getText().toString();
        String confirmacaoSenha = mConfirmacaoDaSenha.getText().toString();


        View focus = null;
        if (TextUtils.isEmpty(nome)) {
            mNome.setError("Campo vazio");
            focus = mNome;
            focus.requestFocus();
        }
        if (TextUtils.isEmpty(sobrenome)) {
            mSobrenome.setError("Campo vazio");
            focus = mSobrenome;
            focus.requestFocus();

        }
        if (TextUtils.isEmpty(usuario)) {
            mUsuario.setError("Campo vazio");
            focus = mUsuario;
            focus.requestFocus();

        }
        if (TextUtils.isEmpty(senha)) {
            mSenha.setError("Campo vazio");
            focus = mSenha;
            focus.requestFocus();

        }
        if (TextUtils.isEmpty(confirmacaoSenha)) {
            mConfirmacaoDaSenha.setError("Campo vazio");
            focus = mConfirmacaoDaSenha;
            focus.requestFocus();

        } else {
            Bundle bundle = new Bundle();
            Intent i = new Intent(CadastroActivity.this, MainActivity.class);
            Log.i("nome",nome);
            bundle.putString("nome", nome);
            bundle.putString("sobrenome", sobrenome);
            bundle.putString("usuario", usuario);
            bundle.putString("senha", senha);
            i.putExtras(bundle); // Método que guarda um Bundle dentro da Intent
            startActivity(i);
            finish();//finaliza a primiera activity
        }


    }

}
