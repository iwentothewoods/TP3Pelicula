package com.lunasoft.tp3peliculas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import java.util.List;

public class SegundaActivity extends AppCompatActivity {

    private SegundaActivityViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaActivityViewModel.class);

        mv.getPeliculaM().observe(this, new Observer<Pelicula>() {
            @Override
            public void onChanged(Pelicula pelicula) {
                TextView nombre = findViewById(R.id.tvNombre);
                TextView actores = findViewById(R.id.tvActores);
                TextView sinopsis = findViewById(R.id.tvDetalles);
                TextView director = findViewById(R.id.tvDirector);
                ImageView foto = findViewById(R.id.ivImg);

                nombre.setText(pelicula.getNombre());
                actores.setText("Actores: " + pelicula.getActoresCadena());
                sinopsis.setText(pelicula.getSinopsis());
                director.setText("Director: " + pelicula.getDirector());
                foto.setImageResource(pelicula.getFoto());
            }
        });

        mv.recuperarPelicula(getIntent());

        Button boton = findViewById(R.id.btVolver);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
