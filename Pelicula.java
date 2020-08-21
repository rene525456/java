public class Pelicula extends Cartometraje{
    
    private int año;
    
    public Pelicula() {
    }

    public Pelicula(String titulo, Genero genero, String creador, int año, double duracion) {
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setCreador(creador);
        this.setAño(año);
        this.setDuracion(duracion);
    }

    public Pelicula(String titulo, String creador) {
        this.setTitulo(titulo);
        this.setCreador(creador);
        visto = false;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "\nPelícula: " + titulo 
        + "\nAño: " + año 
        + "\nGenero: " +genero 
        + "\nDuración:" + duracion;
    }

    
}