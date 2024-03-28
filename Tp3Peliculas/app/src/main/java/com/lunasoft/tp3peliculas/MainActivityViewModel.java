package com.lunasoft.tp3peliculas;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private MutableLiveData<List<Pelicula>> listaPeliculas;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        listaPeliculas = new MutableLiveData<>();
        inicializarListaPeliculas();
    }

    public LiveData<List<Pelicula>> getListaPeliculas() {
        return listaPeliculas;
    }

    private void inicializarListaPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>();

        List<String> actoresArrival = Arrays.asList("Amy Adams", "Jeremy Renner", "Forest Whitaker");
        peliculas.add(new Pelicula("Arrival", actoresArrival,
                "Cuando naves extraterrestres comienzan a llegar a la Tierra, los altos mandos militares piden ayuda a una experta lingüista (Amy Adams) para intentar averiguar si los alienígenas vienen en son de paz o suponen una amenaza. Poco a poco la mujer intentará aprender a comunicarse con los extraños invasores, poseedores de un lenguaje propio, para dar con la verdadera y misteriosa razón de la visita extraterrestre... Adaptación del relato corto 'The Story of Your Life' del escritor Ted Chiang, ganador de los reconocidos premios de ciencia ficción Hugo y Nebula.",
                "Denis Villeneuve", R.drawable.arrival));

        List<String> actoresDeadPoetsSociety = Arrays.asList("Robin Williams", "Ethan Hawke", "Robert Sean Leonard");
        peliculas.add(new Pelicula("Dead Poets Society", actoresDeadPoetsSociety,
                "En un elitista y estricto colegio privado de Nueva Inglaterra, un grupo de alumnos descubrirá la poesía, el significado del 'carpe diem' -aprovechar el momento- y la importancia vital de luchar por alcanzar los sueños, gracias al Sr. Keating, un excéntrico profesor que despierta sus mentes por medio de métodos poco convencionales.",
                "Peter Weir", R.drawable.deadpoets));

        List<String> actoresNerve = Arrays.asList("Dave Franco", "Emma Roberts", "Emily Meade", "Machine Gun Kelly", "Miles Heizer");
        peliculas.add(new Pelicula("Nerve", actoresNerve,
                "Vee Delmonico (Emma Roberts) es una joven y tímida estudiante de secundaria que decide apuntarse a Nerve, un provocativo juego online de 'verdad o acción' en el que la audiencia observa todo, vota y además comenta. Al principio logra mucho éxito y disfruta la situación, sobre todo gracias a los premios que ofrece el juego. Así, empieza a competir junto a un misterioso extraño (Dave Franco), que será su compañero de equipo. Pero, a medida que sube niveles, Nerve evoluciona y Vee se verá envuelta en un juego cada vez más peligroso.",
                "Henry Joost", R.drawable.nerve));

        List<String> actoresReadyPlayerOne = Arrays.asList("Tye Sheridan", "Olivia Cooke", "Mark Rylance", "Ben Mendelsohn", "Simon Pegg");
        peliculas.add(new Pelicula("Ready Player One", actoresReadyPlayerOne,
                "Año 2045. Wade Watts es un adolescente al que le gusta evadirse del cada vez más sombrío mundo real a través de una popular utopía virtual a escala global llamada 'Oasis'. Un día, su excéntrico y multimillonario creador muere, pero antes ofrece su fortuna y el destino de su empresa al ganador de una elaborada búsqueda del tesoro a través de los rincones más inhóspitos de su creación. Será el punto de partida para que Wade se enfrente a jugadores, poderosos enemigos corporativos y otros competidores despiadados, dispuestos a hacer lo que sea, tanto dentro de 'Oasis' como del mundo real, para hacerse con el premio.",
                "Steven Spielberg", R.drawable.readyplayer1));


        listaPeliculas.setValue(peliculas);
    }
}
