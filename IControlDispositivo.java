/**
 * Interfaz que define las operaciones básicas que todos los dispositivos deben implementar.
 * Estas operaciones incluyen encendido, apagado, control de volumen y brillo, entre otras.
 */
public interface IControlDispositivo {

    /**
     * Enciende el dispositivo.
     */
    void encender();

    /**
     * Apaga el dispositivo.
     */
    void apagar();

    /**
     * Aumenta el volumen del dispositivo.
     * La cantidad de aumento es específica de cada tipo de dispositivo.
     */
    void subirVolumen();

    /**
     * Reduce el volumen del dispositivo.
     * La cantidad de reducción es específica de cada tipo de dispositivo.
     */
    void bajarVolumen();

    /**
     * Aumenta el brillo del dispositivo.
     * La cantidad de aumento es específica de cada tipo de dispositivo.
     */
    void aumentarBrillo();

    /**
     * Disminuye el brillo del dispositivo.
     * La cantidad de disminución es específica de cada tipo de dispositivo.
     */
    void disminuirBrillo();
}
