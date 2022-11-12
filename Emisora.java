public class Emisora {
    private String frecuencia;
    private float canal;

    public Emisora() {
        this.frecuencia = "FM";
        this.canal = 106.5f; 
    }

    public Emisora(String frecuencia, float canal) {
        this.frecuencia = frecuencia;
        this.canal = canal;
    }

    public String getFrecuencia() {
        return this.frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public float getCanal() {
        return this.canal;
    }

    public void setCanal(float canal) {
        this.canal = canal;
    }

    public Emisora frecuencia(String frecuencia) {
        setFrecuencia(frecuencia);
        return this;
    }

    public Emisora canal(float canal) {
        setCanal(canal);
        return this;
    }

    @Override
    public String toString() {
        return
            "\nfrecuencia: " + getFrecuencia() +
            "\ncanal: " + getCanal()
            ;
    }

}