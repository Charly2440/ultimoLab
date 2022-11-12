public class Contacto{
    private String nombre;
    private String numero;

    public Contacto() {
        nombre ="";
        numero ="";
    }

    public Contacto(String nombre, String estado, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Contacto nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Contacto numero(String numero) {
        setNumero(numero);
        return this;
    }

    @Override
    public String toString() {
        return
            "\nnombre: " + getNombre() +
            "\nnumero: " + getNumero()
            ;
    }
    
}