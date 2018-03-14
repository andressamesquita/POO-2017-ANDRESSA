package com.example.andressaribeiro.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.andressaribeiro.myapplication.model.Aluno;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private Button button;

    private Aluno aluno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        Intent intent = getIntent();
        long alunoId = intent.getLongExtra("alunoId", -1);


        if (alunoId == -1){
            aluno = new Aluno();
        }else {
            preencherAluno(aluno);
        }

    }

    private void setupViews(){
        nome = findViewById(R.id.nome);
        button = findViewById(R.id.bt_btnPressionado);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SalvarNome(view);
                Intent intent = new Intent(MainActivity.this, Tela2Activity.class);
                startActivity(intent);

            }
        });
    }

    private void preencherAluno(Aluno aluno) {
        nome.setText(aluno.getNome());
    }

    public void salvarAluno(View view) {

        String nomeAluno = nome.getText().toString();

        aluno.setNome(nomeAluno);

        Toast.makeText(this,"Nome salvo", Toast.LENGTH_SHORT).show();
        finish();
    }


    public long SalvarNome(View view) {
        SharedPreferences preferences = getSharedPreferences("arquivo.file", MODE_PRIVATE);
        long id = preferences.getLong("alunoId", -1);
        return id;

    }
}
