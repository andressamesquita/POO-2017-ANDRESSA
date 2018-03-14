package com.example.andressaribeiro.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.andressaribeiro.myapplication.model.Bimestre;

public class Tela2Activity extends AppCompatActivity {

    private EditText nota1;
    private EditText nota2;
    private Button btnCalculaMedia;
    private Bimestre bimestre;
    private TextView media;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        setupViews();
        Intent intent = getIntent();
        long alunoId = intent.getLongExtra("alunoId", -1);


        if (alunoId == -1){
            bimestre = new Bimestre();
        }else {
            preencherBimestre(bimestre);
        }

    }

    private void setupViews(){

        nota1 = findViewById(R.id.et_nota1);
        nota2 = findViewById(R.id.et_nota2);
        media = findViewById(R.id.media);
        btnCalculaMedia = findViewById(R.id.btn_calcula_media);
        btnCalculaMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela2Activity.this, Tela3Activity.class);
                startActivity(intent);
                salvarNotas(view);
            }
        });
    }


    private void preencherBimestre(Bimestre bimestre) {

        nota1.setText((int) bimestre.getNota1());
        nota2.setText((int) bimestre.getNota2());
        media.setText((int) bimestre.getMedia());

    }

    public void salvarNotas(View view) {

        int Vnota1 = Integer.parseInt(nota1.getText().toString());
        int Vnota2 = Integer.parseInt(nota2.getText().toString());
        double Media = Double.valueOf(media.getText().toString());

        bimestre.setNota1(Vnota1);
        bimestre.setNota2(Vnota2);
        bimestre.setMedia(Media);

    }


}
