import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Telefono {
    private ArrayList<Contacto> contactos;
    private boolean conectado;
    private String estadoLlamada;

    public Telefono() {
        contactos = new ArrayList<Contacto>();
    }

    public Telefono(ArrayList<Contacto> contactos, boolean conectado) {
        this.contactos = contactos;
        this.conectado = conectado;
    }

    public void rellenarContactos(){
        String path = "contactoss.csv";
        String line = "";
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                String[] a = line.split(",");
                System.out.println(line);
                contactos.add(new Contacto(a[0], "", a[1]));         
            }
        } catch (IOException e) { 
            e.printStackTrace();
    }
    }

    public String getEstadoLlamada() {
        return this.estadoLlamada;
    }

    public void setEstadoLlamada(String estadoLlamada) {
        this.estadoLlamada = estadoLlamada;
    }

    public ArrayList<Contacto> getContactos() {
        return this.contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public boolean isConectado() {
        return this.conectado;
    }

    public boolean getConectado() {
        return this.conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public Telefono contactos(ArrayList<Contacto> contactos) {
        setContactos(contactos);
        return this;
    }

    public Telefono conectado(boolean conectado) {
        setConectado(conectado);
        return this;
    }

    @Override
    public String toString() {
        return
            "\ncontactos='" + getContactos() +
            "\nconectado='" + isConectado()
        ;
    }

}
