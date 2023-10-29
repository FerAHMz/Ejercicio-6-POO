/**
 * Clase base para dispositivos electrónicos en la tienda ElectroTech.
 */
public abstract class Dispositivo implements Comparable<Dispositivo>, IControlDispositivo {
    
    private String descripcion;
    private double precio;
    private String marca;
    private String modelo;
    private int numeroVideos;
    private boolean encendido;
    private int videoActual;
    private int nivelVolumen;
    private int nivelBrillo;
    private String informacionPantalla;

    /**
     * Constructor de la clase Dispositivo.
     *
     * @param descripcion       Descripción del dispositivo.
     * @param precio            Precio del dispositivo.
     * @param marca             Marca del dispositivo.
     * @param modelo            Modelo del dispositivo.
     * @param numeroVideos      Número de videos publicitarios.
     */
    public Dispositivo(String descripcion, double precio, String marca, String modelo, int numeroVideos) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroVideos = numeroVideos;
        this.encendido = false;
        this.videoActual = 1;
        this.nivelVolumen = 50;
        this.nivelBrillo = 50;
    }

    // Getters y Setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroVideos() {
        return numeroVideos;
    }

    public void setNumeroVideos(int numeroVideos) {
        this.numeroVideos = numeroVideos;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getVideoActual() {
        return videoActual;
    }

    public void setVideoActual(int videoActual) {
        this.videoActual = videoActual;
    }

    public int getNivelVolumen() {
        return nivelVolumen;
    }

    public void setNivelVolumen(int nivelVolumen) {
        this.nivelVolumen = nivelVolumen;
    }

    public int getNivelBrillo() {
        return nivelBrillo;
    }

    public void setNivelBrillo(int nivelBrillo) {
        this.nivelBrillo = nivelBrillo;
    }

    public String getInformacionPantalla() {
        return informacionPantalla;
    }

    public void setInformacionPantalla(String informacionPantalla) {
        this.informacionPantalla = informacionPantalla;
    }

    // Métodos de la interfaz IControlDispositivo

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    // Estos métodos deben ser implementados de manera específica en las clases derivadas
    @Override
    public abstract void subirVolumen();

    @Override
    public abstract void bajarVolumen();

    @Override
    public abstract void aumentarBrillo();

    @Override
    public abstract void disminuirBrillo();

    /**
     * Muestra la información del dispositivo.
     * 
     * @return Una cadena con la información relevante del dispositivo.
     */
    public String mostrarInformacion() {
        return "Descripción: " + descripcion + 
               "\nPrecio: " + precio +
               "\nMarca: " + marca +
               "\nModelo: " + modelo +
               "\nNivel de Volumen: " + nivelVolumen +
               "\nNivel de Brillo: " + nivelBrillo;
    }

    /**
     * Método para la comparación de dispositivos por precio (para la interfaz Comparable).
     *
     * @param otroDispositivo El otro dispositivo con el cual comparar.
     * @return Un número negativo, cero, o un número positivo si este dispositivo es menor, igual, o mayor que el otro dispositivo respectivamente.
     */
    @Override
    public int compareTo(Dispositivo otroDispositivo) {
        return Double.compare(this.precio, otroDispositivo.precio);
    }
}
