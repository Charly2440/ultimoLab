public class Vista {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        System.out.println(sistema.pronosticoClima());
        Radio radio = new Radio();
        radio.rellenarPlaylists();
    }
}
