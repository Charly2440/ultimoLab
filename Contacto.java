public class Contacto{
    private String nombre;
    private String estado;
    private long numero;

    public Contacto() {
    }

    public Contacto(String nombre, String estado, long numero) {
        this.nombre = nombre;
        this.estado = estado;
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Contacto nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Contacto estado(String estado) {
        setEstado(estado);
        return this;
    }

    public Contacto numero(long numero) {
        setNumero(numero);
        return this;
    }

    @Override
    public String toString() {
        return
            "\nnombre: " + getNombre() +
            "\nestado: " + getEstado() + 
            "\nnumero: " + getNumero()
            ;
    }
    
}