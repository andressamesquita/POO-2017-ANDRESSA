package com.example.andressaribeiro.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.andressaribeiro.myapplication.model.Aluno;
import com.example.andressaribeiro.myapplication.model.Bimestre;

public class Tela3Activity extends AppCompatActivity {

    private EditText peso1;
    private EditText peso2;
    private Button btnCancelar;
    private Button btnCalcular;
    private double media;
    private Aluno aluno;


    private Bimestre bimestre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        setupViews();
        Intent intent = getIntent();
        long alunoId = intent.getLongExtra("alunoId", -1);


        if (alunoId == -1){
            bimestre = new Bimestre();
        }else {
            preencherBimestre(bimestre);
        }


    }

    private void setupViews() {
        peso1 = findViewById(R.id.peso_nota1);
        peso2 = findViewById(R.id.peso_nota2);
        btnCancelar = findViewById(R.id.cancelar);
        btnCalcular = findViewById(R.id.calcular);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela3Activity.this, Tela2Activity.class);
                startActivity(intent);
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela3Activity.this, Tela2Activity.class);
                startActivity(intent);
                salvarPesos(view);

                media = bimestre.getMedia();

                if (media >= 7) {
                    Toast.makeText(Tela3Activity.this, "Parabens " + aluno.getNome() + " voce foi aprovado com media " +
                            bimestre.getMedia() + "!", Toast.LENGTH_SHORT).show();
                }else if(media<=7){
                    Toast.makeText(Tela3Activity.this, aluno.getNome() + " cuidado, voce ficou em prova final. Sua media foi " +
                            bimestre.getMedia() + "!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Tela3Activity.this, "Sinto muito "+aluno.getNome() + " voce ficou reprovado. Sua media foi " +
                            bimestre.getMedia() + "!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void preencherBimestre(Bimestre bimestre) {

        peso1.setText((int) bimestre.getPeso1());
        peso2.setText((int) bimestre.getPeso2());

    }

    public void salvarPesos(View view) {

        int Vpeso1 = Integer.parseInt(peso1.getText().toString());
        int Vpeso2 = Integer.parseInt(peso2.getText().toString());

        bimestre.setPeso1(Vpeso1);
        bimestre.setPeso2(Vpeso2);

    }
}
