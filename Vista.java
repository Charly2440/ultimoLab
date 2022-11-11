import java.util.ArrayList;

public class Vista {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        System.out.println(sistema.pronosticoClima());
        Radio radio = new Radio();
        radio.rellenarPlaylists();
        ArrayList<Playlist> playlists = radio.getPlaylists();  
        for (Playlist playlist : playlists) {
            System.out.println(playlist.getNombre());
        }  
    }
}
