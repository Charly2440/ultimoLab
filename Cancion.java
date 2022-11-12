public class Cancion {
    private String nombre;
    private String artista;
    private String genero;
    private String duracion;


    public Cancion() {
    }

    public Cancion(String nombre, String artista, String genero, String duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Cancion nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Cancion artista(String artista) {
        setArtista(artista);
        return this;
    }

    public Cancion genero(String genero) {
        setGenero(genero);
        return this;
    }

    public Cancion duracion(String duracion) {
        setDuracion(duracion);
        return this;
    }

    @Override
    public String toString() {
        return
            "\nnombre: " + getNombre() +
            "\nartista: " + getArtista() + 
            "\ngenero: " + getGenero() +
            "\nduracion: " + getDuracion() 
            ;
    }

}