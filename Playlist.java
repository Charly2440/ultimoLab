import java.util.ArrayList;

public class Playlist {
    private String nombre;
    private ArrayList<Cancion> canciones;
    private int cancionActual;

    public Playlist() {
        canciones = new ArrayList<Cancion>();;
        cancionActual = 0;
    }

    public int getCancionActual() {
        return this.cancionActual;
    }

    public void setCancionActual(int cancionActual) {
        this.cancionActual = cancionActual;
    }

    public Playlist(String nombre, ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return this.canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public Playlist nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Playlist canciones(ArrayList<Cancion> canciones) {
        setCanciones(canciones);
        return this;
    }

    @Override
    public String toString() {
        String songs = "";
        for (Cancion cancion : canciones) {
            songs = songs + cancion.getNombre();
        }
        return
            "\nnombre: " + getNombre() +
            "\ncanciones: \n" + songs
            ;
    }

}
