import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Radio {
    private Telefono telefono;
    private Emisora emisora;
    private ArrayList<Playlist> playlists;
    private boolean estado;
    private int volumen;
    private ArrayList<Emisora> emisoras;
    private int playlist;

    public boolean isEstado() {
        return this.estado;
    }

    public int getPlaylist() {
        return this.playlist;
    }

    public void setPlaylist(int playlist) {
        this.playlist = playlist;
    }


    public Radio() {
        telefono = new Telefono();
        telefono.rellenarContactos();
        emisora = new Emisora();
        playlists = new ArrayList<Playlist>();
        estado = true;
        volumen = 10;
        emisoras = new ArrayList<Emisora>();
    }

    public Radio(Telefono telefono, Emisora emisora, ArrayList<Playlist> playlists, boolean estado, int volumen, ArrayList<Emisora> emisoras) {
        this.telefono = telefono;
        this.emisora = emisora;
        this.playlists = playlists;
        this.estado = estado;
        this.volumen = volumen;
        this.emisoras = emisoras;
    }

    public void rellenarPlaylists(){
        String path = "spotify_dataset_2.csv";
        String line = "";
        ArrayList<Cancion> canciones =  new ArrayList<Cancion>();
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){

                String[] a = line.split(",");
                canciones.add(new Cancion(a[4], a[6], a[8], a[17])); 

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Playlist playlist1 = new Playlist();
        Playlist playlist2 = new Playlist();
        Playlist playlist3 = new Playlist();

        for (int i = 0; i < 10; i++) {
            playlist1.getCanciones().add(canciones.get(i));
            playlist1.setNombre("Playlist 1");
        }
        playlists.add(playlist1);

        for (int i = 10; i < 20; i++) {
            playlist2.getCanciones().add(canciones.get(i));
            playlist2.setNombre("Playlist 2");
        }
        playlists.add(playlist2);

        for (int i = 20; i < 30; i++) {
            playlist3.getCanciones().add(canciones.get(i));
            playlist3.setNombre("Playlist 3");
        }
        playlists.add(playlist3);

    }

    public Telefono getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Emisora getEmisora() {
        return this.emisora;
    }

    public void setEmisora(Emisora emisora) {
        this.emisora = emisora;
    }

    public ArrayList<Playlist> getPlaylists() {
        return this.playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlist) {
        this.playlists = playlist;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public ArrayList<Emisora> getEmisoras() {
        return this.emisoras;
    }

    public void setEmisoras(ArrayList<Emisora> emisoras) {
        this.emisoras = emisoras;
    }

    public Radio telefono(Telefono telefono) {
        setTelefono(telefono);
        return this;
    }

    public Radio emisora(Emisora emisora) {
        setEmisora(emisora);
        return this;
    }

    public Radio playlist(ArrayList<Playlist> playlist) {
        setPlaylists(playlist);
        return this;
    }

    public Radio estado(Boolean estado) {
        setEstado(estado);
        return this;
    }

    public Radio volumen(int volumen) {
        setVolumen(volumen);
        return this;
    }

    public Radio emisoras(ArrayList<Emisora> emisoras) {
        setEmisoras(emisoras);
        return this;
    }

    @Override
    public String toString() {
        String emisoraString = "";
        for (Emisora emisora : emisoras) {
            emisoraString = emisoraString + emisora.toString();
        }
        return
            "\ntelefono: \n" + telefono.toString() +
            "\nemisora: " + emisora.toString() +
            "\nplaylist: " + getPlaylists() +
            "\nestado: " + getEstado() +
            "\nvolumen: " + getVolumen() +
            "\nemisoras: \n" + emisoraString
            ;
    }

}