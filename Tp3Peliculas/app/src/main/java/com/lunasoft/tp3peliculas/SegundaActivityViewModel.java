package com.lunasoft.tp3peliculas;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class SegundaActivityViewModel extends AndroidViewModel {

    private MutableLiveData<Pelicula> peliculaM;
    public SegundaActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Pelicula> getPeliculaM() {
        if (peliculaM == null){
            peliculaM = new MutableLiveData<>();
        }
        return peliculaM;
    }
    public void recuperarPelicula(Intent intent){

        Pelicula pelicula = (Pelicula)intent.getSerializableExtra("pelicula");

        if (pelicula != null){
            pelicula.setActoresCadena(getActoresString(pelicula.getActores()));
            peliculaM.setValue(pelicula);
        }
    }

    private String getActoresString(List<String> actores) {
        StringBuilder builder = new StringBuilder();
        for (String actor : actores) {
            builder.append(actor).append(", ");
        }

        if (builder.length() > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }
        return builder.toString();
    }
}
