package com.example.andressaribeiro.myfirstapp.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.andressaribeiro.myfirstapp.CadastroDisciplinaActivity;
import com.example.andressaribeiro.myfirstapp.R;
import com.example.andressaribeiro.myfirstapp.model.Aluno;
import com.example.andressaribeiro.myfirstapp.model.Disciplina;

import java.util.List;

import io.objectbox.Box;

/**
 * Created by Andressa Ribeiro on 27/02/2018.
 */

public class ListaDisciplinasRVAdapter extends RecyclerView.Adapter<ListaDisciplinasRVAdapter.ViewHolder> {

    private final Context context;
    private final List<Disciplina> disciplinas;
    private Box<Disciplina>disciplinaBox;


    public ListaDisciplinasRVAdapter(Context context, List<Disciplina> disciplinas, Box<Disciplina>disciplinaBox){

        this.context = context;
        this.disciplinas = disciplinas;
        this.disciplinaBox = disciplinaBox;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //infla o layout da linha
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_disciplina, parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Disciplina disciplina = this.disciplinas.get(position);

        holder.tvDisciplinaNome.setText(disciplina.getNomeDisciplina());
        holder.tvDisciplinaProfessor.setText(disciplina.getProfessor());

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Nota atual: "+ disciplina.getNotaAtual(), Snackbar.LENGTH_LONG).show();
            }
        });*/

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(final View view) {
                final PopupMenu menuPopup = new PopupMenu(context,view);
                MenuInflater inflater = menuPopup.getMenuInflater();

                inflater.inflate(R.menu.popup_menu_lista_disciplinas, menuPopup.getMenu());
                menuPopup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()){

                            case R.id.item_remover_disciplina :
                                disciplinas.remove(disciplina);//fazer com ALERT DIALOG depois
                                disciplinaBox.remove(disciplina);
                                ListaDisciplinasRVAdapter.this.notifyItemRemoved(position);
                                break;

                            case R.id.item_addConteudo_disciplina:
                                //Implementar
                                break;
                            case R.id.item_addnota_disciplina:
                                //Implementar
                                //adicionarNotaNoBoletim(view);
                                if(disciplina.getPeriodo()=="2 Avaliações"){


                                }else{

                                }
                                break;
                            case R.id.item_editar_disciplina:
                                editarDisciplina(view,disciplina,position);
                                break;
                        }

                        return false;
                    }


                });

                menuPopup.show();

                return true;// significa que o item é dono do click
            }
        });
    }


    @Override
    public int getItemCount() {
        return disciplinas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        protected TextView tvDisciplinaNome;
        protected TextView tvDisciplinaProfessor;

        public ViewHolder(View itemView) {
            super(itemView);

            tvDisciplinaNome = itemView.findViewById(R.id.tv_disciplina_nome);
            tvDisciplinaProfessor = itemView.findViewById(R.id.tv_disciplina_professor);
        }
    }

    private void editarDisciplina(View view, Disciplina disciplina, int position){

        //enviar o id da disciplina selecionada
        Intent intent = new Intent(context, CadastroDisciplinaActivity.class);
        intent.putExtra("discplinaId",disciplina.getId());

        //Iniciar o formulario
        context.startActivity(intent);

        //Avisar à intent que um item mudou
        notifyItemChanged(position);
    }



}
