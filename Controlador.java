import java.util.List;

/**
 * Clase Controlador que maneja las acciones y la interacción con los dispositivos.
 */
public class Controlador {

    private List<Dispositivo> dispositivos;
    private Dispositivo dispositivoSeleccionado;

    /**
     * Constructor principal de la clase Controlador.
     *
     * @param dispositivos Lista de dispositivos disponibles.
     */
    public Controlador(List<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
        this.dispositivoSeleccionado = null;  // Inicialmente, ningún dispositivo está seleccionado
    }

    /**
     * Selecciona un dispositivo para controlar.
     *
     * @param dispositivo El dispositivo a seleccionar.
     */
    public void seleccionarDispositivo(Dispositivo dispositivo) {
        this.dispositivoSeleccionado = dispositivo;
    }

    /**
     * Enciende el dispositivo seleccionado.
     */
    public void encenderDispositivo() {
        if (dispositivoSeleccionado != null) {
            dispositivoSeleccionado.encender();
        } else {
            System.out.println("No hay ningún dispositivo seleccionado para encender.");
        }
    }

    /**
     * Apaga el dispositivo seleccionado.
     */
    public void apagarDispositivo() {
        if (dispositivoSeleccionado != null) {
            dispositivoSeleccionado.apagar();
        } else {
            System.out.println("No hay ningún dispositivo seleccionado para apagar.");
        }
    }

    /**
     * Sube el volumen del dispositivo seleccionado.
     */
    public void subirVolumen() {
        if (dispositivoSeleccionado != null) {
            dispositivoSeleccionado.subirVolumen();
        } else {
            System.out.println("No hay ningún dispositivo seleccionado para subir el volumen.");
        }
    }

    /**
     * Baja el volumen del dispositivo seleccionado.
     */
    public void bajarVolumen() {
        if (dispositivoSeleccionado != null) {
            dispositivoSeleccionado.bajarVolumen();
        } else {
            System.out.println("No hay ningún dispositivo seleccionado para bajar el volumen.");
        }
    }

    /**
     * Aumenta el brillo del dispositivo seleccionado.
     */
    public void aumentarBrillo() {
        if (dispositivoSeleccionado != null) {
            dispositivoSeleccionado.aumentarBrillo();
        } else {
            System.out.println("No hay ningún dispositivo seleccionado para aumentar el brillo.");
        }
    }

    /**
     * Disminuye el brillo del dispositivo seleccionado.
     */
    public void disminuirBrillo() {
        if (dispositivoSeleccionado != null) {
            dispositivoSeleccionado.disminuirBrillo();
        } else {
            System.out.println("No hay ningún dispositivo seleccionado para disminuir el brillo.");
        }
    }

    /**
     * Muestra la información del dispositivo seleccionado.
     *
     * @return Una cadena con la información del dispositivo seleccionado.
     */
    public String mostrarInformacionDispositivo() {
        if (dispositivoSeleccionado != null) {
            return dispositivoSeleccionado.mostrarInformacion();
        } else {
            return "No hay ningún dispositivo seleccionado.";
        }
    }

    /**
     * Controla los videos publicitarios del dispositivo seleccionado.
     */
    public void controlarVideos() {
        if (dispositivoSeleccionado != null) {
            // Aquí puedes agregar lógica para controlar los videos publicitarios.
            // Por simplicidad, solo se muestra un mensaje.
            System.out.println("Controlando videos publicitarios del dispositivo: " + dispositivoSeleccionado.getDescripcion());
        } else {
            System.out.println("No hay ningún dispositivo seleccionado para controlar videos.");
        }
    }

    /**
     * Muestra el estado del dispositivo seleccionado.
     *
     * @return Una descripción del estado del dispositivo seleccionado.
     */
    public String mostrarEstadoDispositivo() {
        if (dispositivoSeleccionado != null) {
            return "Dispositivo: " + dispositivoSeleccionado.getDescripcion() + 
                   "\nEncendido: " + (dispositivoSeleccionado.isEncendido() ? "Sí" : "No") +
                   "\nVolumen: " + dispositivoSeleccionado.getNivelVolumen() + "%" +
                   "\nBrillo: " + dispositivoSeleccionado.getNivelBrillo() + "%" +
                   "\nInformación en pantalla: " + dispositivoSeleccionado.getInformacionPantalla();
        } else {
            return "No hay ningún dispositivo seleccionado.";
        }
    }

    /**
     * Devuelve el dispositivo más caro de la lista.
     *
     * @return El dispositivo con el precio más alto.
     */
    public Dispositivo dispositivoMasCaro() {
        return dispositivos.stream().max(Dispositivo::compareTo).orElse(null);
    }

    /**
     * Devuelve el dispositivo más barato de la lista.
     *
     * @return El dispositivo con el precio más bajo.
     */
    public Dispositivo dispositivoMasBarato() {
        return dispositivos.stream().min(Dispositivo::compareTo).orElse(null);
    }
}
