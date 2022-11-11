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


    public Radio() {
        telefono = new Telefono();
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
        String path = "spotify_dataset.csv";
        String line = "";
        ArrayList<Cancion> canciones =  new ArrayList<Cancion>();
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){

                String[] a = line.split(",");
                //System.out.println(a.length);
                //canciones.add(new Cancion(a[4], a[6], a[9], a[20])); 

            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        //System.out.println(canciones.get(5).getNombre());
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

    public ArrayList<Playlist> getPlaylist() {
        return this.playlists;
    }

    public void setPlaylist(ArrayList<Playlist> playlist) {
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
        setPlaylist(playlist);
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
            "\nplaylist: " + getPlaylist() +
            "\nestado: " + getEstado() +
            "\nvolumen: " + getVolumen() +
            "\nemisoras: \n" + emisoraString
            ;
    }

}
