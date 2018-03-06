package com.example.andressaribeiro.myfirstapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.andressaribeiro.myfirstapp.model.Aluno;
import com.example.andressaribeiro.myfirstapp.model.Disciplina;

import io.objectbox.Box;

public class CadastroDisciplinaActivity extends AppCompatActivity {

    private EditText nomeDisciplina;
    private EditText nomeProfessor;
    private TextView periodoAvaliativo;


    private Disciplina disciplina;

    private Box<Disciplina>disciplinaBox;


    private Aluno alunoLogado;
    private Box<Aluno> alunoBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_disciplina);

        setupViews();

        alunoLogado = obterAlunoLogado();


        Intent intent = getIntent();
        long disciplinaId = intent.getLongExtra("disciplinaId", -1);

        alunoBox = ((App)getApplication()).getBoxStore().boxFor(Aluno.class);
        disciplinaBox = ((App)getApplication()).getBoxStore().boxFor(Disciplina.class);

        if (disciplinaId == -1){
            disciplina = new Disciplina();
        }else {
            disciplina = disciplinaBox.get(disciplinaId);
            preencherDisciplina(disciplina);
        }
    }

    private void preencherDisciplina(Disciplina disciplina) {

        nomeDisciplina.setText(disciplina.getNomeDisciplina());
        nomeProfessor.setText(disciplina.getProfessor());
        periodoAvaliativo.setText(disciplina.getPeriodo());

    }


    private void setupViews() {

        nomeDisciplina = findViewById(R.id.nome_disciplina);
        nomeProfessor = findViewById(R.id.professor);

        periodoAvaliativo = findViewById(R.id.periodo_avaliativo);

        final ToggleButton toggle = findViewById(R.id.toggle_btn);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if(isChecked){
                    toggle.setSelected(true);
                    periodoAvaliativo.setText("2 Avaliações");
                }else{
                    toggle.setSelected(true);
                    periodoAvaliativo.setText("4 Avaliações");
                }

            }
        });

    }

    public void salvarDisciplina(View view) {

        String nDisciplina = nomeDisciplina.getText().toString();
        String professor = nomeProfessor.getText().toString();
        String periodo = periodoAvaliativo.getText().toString();


        disciplina.setNomeDisciplina(nDisciplina);
        disciplina.setProfessor(professor);
        disciplina.setPeriodo(periodo);
        disciplina.getAlunoToOne().setTarget(alunoLogado); //setTarget faz a associação entre id e aluno

        disciplinaBox.put(disciplina);

        Toast.makeText(this,"Disciplina salva", Toast.LENGTH_SHORT).show();
        finish();
    }

    private Aluno obterAlunoLogado() {
        SharedPreferences preferences = getSharedPreferences("anotaai.file", MODE_PRIVATE);
        long id = preferences.getLong("alunoId", -1);
        return alunoBox.get(id);

    }

}
