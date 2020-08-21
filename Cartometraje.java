public class Cartometraje implements Visualizable{
    public String titulo;
    public Genero genero;
    public double duracion;
    public boolean visto = false;
    public String creador;

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean marcarVisto() {
        visto = true;
        return visto;
    }

    @Override
    public boolean esVisto() {
        return visto;
    }

    @Override
    public double tiempoVisto() {
        
        return duracion;
    }
}