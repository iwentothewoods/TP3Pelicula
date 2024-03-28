package com.lunasoft.tp3peliculas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lunasoft.tp3peliculas.R;
import com.lunasoft.tp3peliculas.Pelicula;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolderPepe> {
    private List<Pelicula> listaDePeliculas;
    private Context context;
    private LayoutInflater li;

    public PeliculaAdapter(List<Pelicula> listaDePeliculas, Context context, LayoutInflater li) {
        this.listaDePeliculas = listaDePeliculas;
        this.context = context;
        this.li = li;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        listaDePeliculas.clear();
        listaDePeliculas.addAll(peliculas);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolderPepe onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = li.inflate(R.layout.item, parent, false);
        return new ViewHolderPepe(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPepe holder, int position) {
        Pelicula pelicula = listaDePeliculas.get(position);

        holder.nombre.setText(pelicula.getNombre());
        holder.sinopsis.setText(pelicula.getSinopsis());
        holder.foto.setImageResource(pelicula.getFoto());

        holder.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SegundaActivity.class);
                intent.putExtra("pelicula", pelicula);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaDePeliculas.size();
    }

    public class ViewHolderPepe extends RecyclerView.ViewHolder {

        TextView nombre, sinopsis;
        ImageView foto;
        Button boton;

        public ViewHolderPepe(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvTitulo);
            sinopsis = itemView.findViewById(R.id.tvSinopsis);
            foto = itemView.findViewById(R.id.ivFoto);
            boton = itemView.findViewById(R.id.btVerMas);
        }
    }
}