import java.util.Random;

public class Sistema implements productividad, modoRadio, modoReproduccion, modoTelefono  {
    private Radio radio;

    public Sistema(){
        radio = new Radio();
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
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int cambiarVolumen(boolean arriba) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String cambiarFrecuencia(String frecuencia) {
        // TODO Auto-generated method stub
        return "";
    }

    @Override
    public float cambiarEmisoras(boolean arriba) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void guardarEmisoras() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cargarEmisoras() {
        // TODO Auto-generated method stub
        
    }

    //Interfaz modoReproduccion
    @Override
    public String seleccionarPlaylist(int decision) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String cambiarCancion(boolean arriba) {
        // TODO Auto-generated method stub
        return null;
    }

    //Interfaz modoTelefono
    @Override
    public void conectado() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String mostrarConstactos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String llamarContactos(int desicion) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String finalizarLlamadaEspera() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String cambiarLlamadaEspera() {
        // TODO Auto-generated method stub
        return null;
    }
}
