import java.util.ArrayList;
import java.util.List;

public class EjecutorArreglos {
    public static void main(String[] args) {
        Pelicula [ ] listaPeliculas = new Pelicula[5];
        Pelicula p1 = new Pelicula("Día de la Independencia", Genero.ACCION, "Mel Gilson", 1997, 2.5);
        Pelicula p2 = new Pelicula("Titanic", Genero.DRAMA, "Spilver", 1995, 3.2);
        Pelicula p3 = new Pelicula("El señor de los anillos", Genero.FICCION, "Peter Jackson", 2003,3.5);
        Pelicula p4 = new Pelicula("Salvando al solado Ryan", Genero.BELICA, "Steven Spielber", 1998,1.9);
        Pelicula p5 = new Pelicula("Advenger Infinity War", Genero.FICCION, "Joe Russo", 2018,3.9);
        listaPeliculas[0] = p1;
        listaPeliculas[1] = p2;
        listaPeliculas[2] = p3;
        listaPeliculas[3] = p4;
        listaPeliculas[4] = p5;
        p1.marcarVisto();
        p2.marcarVisto();
        p3.marcarVisto();
        p5.marcarVisto();
        Serie [ ] listaSerie = new Serie[5];
        Serie s1 = new Serie("Juego de la llaves", 1, Genero.ADULTO, "Fernando Lefrija", 0.40);
        Serie s2 = new Serie("Hermanos de sangre", 3, Genero.BELICA, "Tom Hanks", 0.45);
        Serie s3 = new Serie("La historia de Dios", 1, Genero.DOCUMENTAL, "Forgam Freman", 0.44);
        Serie s4 = new Serie("Spartacus", 1, Genero.ACCION, "Hurt Michael", 0.55);
        Serie s5 = new Serie("Troya: La caída de una ciudad", 1, Genero.EPICO, "Owen Harros", 0.43);
        s1.marcarVisto();
        s2.marcarVisto();
        listaSerie[0] = s1;
        listaSerie[1] = s2;
        listaSerie[2] = s3;
        listaSerie[3] = s4;
        listaSerie[4] = s5;
        
        System.out.println("Películas preferidas por el público "); 
        for(int i=0; i< listaPeliculas.length; i++) { 
            System.out.println( listaPeliculas[i]); 
        }
        System.out.println("Series preferidas por el público "); 
        for(int i=0; i< listaSerie.length; i++) { 
            System.out.println( listaSerie[i]); 
        }
    }
}