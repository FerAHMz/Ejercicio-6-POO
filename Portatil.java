/**
 * Representa un dispositivo de tipo Portatil (computadora portátil).
 */
public class Portatil extends Dispositivo {

    private String ram;
    private String tamanoDisco;
    private String tipoDisco;
    private String velocidadCPU;
    private String velocidadGPU;
    private int visaCuotas;

    /**
     * Constructor de la clase Portatil.
     *
     * @param descripcion   Descripción del dispositivo.
     * @param precio        Precio del dispositivo.
     * @param marca         Marca del dispositivo.
     * @param modelo        Modelo del dispositivo.
     * @param ram           Memoria RAM del portátil.
     * @param tamanoDisco   Tamaño de disco del portátil.
     * @param tipoDisco     Tipo de disco del portátil (HDD o SSD).
     * @param velocidadCPU  Velocidad del CPU del portátil.
     * @param velocidadGPU  Velocidad del GPU del portátil.
     * @param visaCuotas    Número de visa cuotas disponibles.
     */
    public Portatil(String descripcion, double precio, String marca, String modelo, String ram, String tamanoDisco,
                    String tipoDisco, String velocidadCPU, String velocidadGPU, int visaCuotas) {
        super(descripcion, precio, marca, modelo, 5);
        this.ram = ram;
        this.tamanoDisco = tamanoDisco;
        this.tipoDisco = tipoDisco;
        this.velocidadCPU = velocidadCPU;
        this.velocidadGPU = velocidadGPU;
        this.visaCuotas = visaCuotas;
    }

    @Override
    public void subirVolumen() {
        int volumenActual = getNivelVolumen();
        setNivelVolumen(Math.min(100, volumenActual + 10));  // Incrementa en intervalos de 10%
    }

    @Override
    public void bajarVolumen() {
        int volumenActual = getNivelVolumen();
        setNivelVolumen(Math.max(0, volumenActual - 10));  // Decrementa en intervalos de 10%
    }

    @Override
    public void aumentarBrillo() {
        int brilloActual = getNivelBrillo();
        setNivelBrillo(Math.min(100, brilloActual + 5));  // Incrementa en intervalos de 5%
    }

    @Override
    public void disminuirBrillo() {
        int brilloActual = getNivelBrillo();
        setNivelBrillo(Math.max(0, brilloActual - 5));  // Decrementa en intervalos de 5%
    }

    // Getters y Setters

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getTamanoDisco() {
        return tamanoDisco;
    }

    public void setTamanoDisco(String tamanoDisco) {
        this.tamanoDisco = tamanoDisco;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public String getVelocidadCPU() {
        return velocidadCPU;
    }

    public void setVelocidadCPU(String velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
    }

    public String getVelocidadGPU() {
        return velocidadGPU;
    }

    public void setVelocidadGPU(String velocidadGPU) {
        this.velocidadGPU = velocidadGPU;
    }

    public int getVisaCuotas() {
        return visaCuotas;
    }

    public void setVisaCuotas(int visaCuotas) {
        this.visaCuotas = visaCuotas;
    }
}
