import java.util.Random;

public class Sistema implements productividad, modoRadio, modoReproduccion, modoTelefono  {
    private Radio radio;

    public Sistema(){
        radio = new Radio();
        radio.rellenarPlaylists();
    }   

    //Interfaz productividad
    @Override
    public String pronosticoClima() {
        Random rand = new Random();
        String temperatura = Integer.toString(rand.nextInt(5, 28));
        int caso = rand.nextInt(1, 5);
        String pronostico = "";
        String recomendacion = "";

        if(caso ==1){
            pronostico = "soleado";
            recomendacion = "salir a caminar por el parque";
        }
        else if (caso == 2){
            pronostico = "nublado";
            recomendacion = "jugar un partido sin tener mucho sol en la cara";
        }
        else if (caso == 3){
            pronostico = "lluvioso";
            recomendacion = "evitar manejar a lugares muy lejanos"; 
        }
        else if (caso == 4){
            pronostico = "parcialmente lluvioso";
            recomendacion = "quedarse en casa viendo películas";
        }

        return "Buenos días usuario, el pronóstico de hoy es un día: " + pronostico + ", con una temperatura mínima de: " + temperatura + "°C. Parece recomendable: " + recomendacion + ".";
    }


    //Interfaz modoRadio
    @Override
    public boolean estadoRadio() {
        return radio.getEstado();
    }

    @Override
    public int cambiarVolumen(boolean arriba) {
        if (estadoRadio()){
            if (arriba){
                radio.setVolumen(radio.getVolumen()+1);
                return radio.getVolumen();
            }
            
            else {
                radio.setVolumen(radio.getVolumen()-1);
                return radio.getVolumen();
            }
        }
        return radio.getVolumen();
    }

    @Override
    public String cambiarFrecuencia(String frecuencia) {
        radio.getEmisora().setFrecuencia(frecuencia);
        return radio.getEmisora().getFrecuencia();
    }

    @Override
    public float cambiarEmisoras(boolean arriba) {
        if (estadoRadio()){
            if (arriba){
                radio.getEmisora().setCanal(radio.getEmisora().getCanal()+0.5f);
                return radio.getEmisora().getCanal();
            }
            
            else {
                radio.getEmisora().setCanal(radio.getEmisora().getCanal()-0.5f);
                return radio.getEmisora().getCanal();
            }
        }
        return radio.getEmisora().getCanal();
    }

    @Override
    public void guardarEmisoras() {
        radio.getEmisoras().add(radio.getEmisora());
    }

    @Override
    public String mostrarEmisoras() {
        String emisoras = "";
        for (Emisora emisora : radio.getEmisoras()) {
            emisoras = emisoras + emisora.toString();
        }
        return emisoras;
    }

    @Override
    public String cargarEmisoras(int i) {
        return radio.getEmisoras().get(i).toString();
    }

    //Interfaz modoReproduccion
    @Override
    public String seleccionarPlaylist(int decision) {
        radio.setPlaylist(decision);
        return radio.getPlaylists().get(decision).toString();
    }

    @Override
    public String mostrarPlaylists() {
        String playlists = "";
        for (Playlist playlist : radio.getPlaylists()) {
            playlists = playlists + playlist.toString();
        }
        return playlists;
    }

    @Override
    public String cambiarCancion(boolean arriba) {
        Playlist playlistActual = radio.getPlaylists().get(radio.getPlaylist());
        if (arriba){
            return playlistActual.getCanciones().get(playlistActual.getCancionActual()+1).toString();
        }
        else{
            return playlistActual.getCanciones().get(playlistActual.getCancionActual()-1).toString();
        }
        
    }

    //Interfaz modoTelefono
    @Override
    public void conectado() {
        radio.getTelefono().setConectado(true);
    }

    @Override
    public boolean estadoConeccion() {
        return radio.getTelefono().getConectado();
    }

    @Override
    public String mostrarConstactos() {
        String contactos = "";
        for (Contacto contacto : radio.getTelefono().getContactos()) {
            contactos = contactos + contacto.toString();
        }
        return contactos;
    }

    @Override
    public String llamarContactos(int desicion) {
       return radio.getTelefono().getContactos().get(desicion).toString();
    }

    @Override
    public String finalizarLlamadaEspera() {
        radio.getTelefono().setEstadoLlamada("Finalizado");
        return "Llamada finalizada";
    }

    @Override
    public String cambiarLlamadaEspera() {
        radio.getTelefono().setEstadoLlamada("En espera");
        return "Llamada en espera";
    }
}
