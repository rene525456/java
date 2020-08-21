public class Serie extends Cartometraje{
    private int numeroTemporadas = 1;
    
    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.setTitulo(titulo);
        this.setCreador(creador);
    }

    public Serie(String titulo, int numeroTemporadas, Genero genero, String creador, double duracion) {
        this.setTitulo(titulo);
        this.setNumeroTemporadas(numeroTemporadas);
        this.setGenero(genero);
        this.setCreador(creador);
        this.setDuracion(duracion);
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        return "\nSerie: " + titulo 
        + "\nNúmero de Temporadas: " + numeroTemporadas 
        + "\nGenero: " +genero 
        + "\nDuración:" + duracion;
    }
}