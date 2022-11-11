import java.util.ArrayList;

public class Telefono {
    private ArrayList<Contacto> contactos;
    private boolean conectado;


    public Telefono() {
    }

    public Telefono(ArrayList<Contacto> contactos, boolean conectado) {
        this.contactos = contactos;
        this.conectado = conectado;
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
