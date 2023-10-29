import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal que simula el sistema de control de dispositivos de la tienda ElectroTech.
 */
public class Principal {

    private static final String RUTA_CSV = "ProductosElectronicos.csv";
    private static List<Dispositivo> dispositivos = new ArrayList<>();
    private static Controlador controlador;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que se ejecuta al iniciar el programa.
     *
     * @param args Argumentos de línea de comando.
     */
    public static void main(String[] args) {
        cargarDesdeCSV();
        controlador = new Controlador(dispositivos);

        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea que queda pendiente

            switch (opcion) {
                case 1:
                    controlador.seleccionarDispositivo(seleccionarDispositivo());
                    controlador.encenderDispositivo();
                    break;
                case 2:
                    controlador.seleccionarDispositivo(seleccionarDispositivo());
                    controlador.apagarDispositivo();
                    break;
                case 3:
                    controlador.seleccionarDispositivo(seleccionarDispositivo());
                    controlador.subirVolumen();
                    break;
                case 4:
                    controlador.seleccionarDispositivo(seleccionarDispositivo());
                    controlador.bajarVolumen();
                    break;
                case 5:
                    controlador.seleccionarDispositivo(seleccionarDispositivo());
                    controlador.aumentarBrillo();
                    break;
                case 6:
                    controlador.seleccionarDispositivo(seleccionarDispositivo());
                    controlador.disminuirBrillo();
                    break;
                case 7:
                    controlador.seleccionarDispositivo(seleccionarDispositivo());
                    System.out.println(controlador.mostrarInformacionDispositivo());
                    break;
                case 8:
                    controlador.seleccionarDispositivo(seleccionarDispositivo());
                    System.out.println(controlador.mostrarEstadoDispositivo());
                    break;
                case 9:
                    controlador.controlarVideos();
                    break;
                case 10:
                    controlador.seleccionarDispositivo(seleccionarDispositivo());
                    break;
                case 11:
                    System.out.println("Acciones permitidas:");
                    // Aquí se pueden listar las acciones permitidas para el dispositivo, esto puede variar según la implementación.
                    break;
                case 12:
                    System.out.println(controlador.dispositivoMasCaro().getDescripcion());
                    break;
                case 13:
                    System.out.println(controlador.dispositivoMasBarato().getDescripcion());
                    break;
                case 14:
                    cargarDesdeCSV();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    /**
     * Muestra el menú de opciones al usuario.
     */
    private static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Encender dispositivo");
        System.out.println("2. Apagar dispositivo");
        System.out.println("3. Subir volumen");
        System.out.println("4. Bajar volumen");
        System.out.println("5. Aumentar brillo");
        System.out.println("6. Disminuir brillo");
        System.out.println("7. Mostrar información del dispositivo");
        System.out.println("8. Mostrar estado actual del dispositivo");
        System.out.println("9. Controlar videos publicitarios");
        System.out.println("10. Seleccionar dispositivo a controlar");
        System.out.println("11. Mostrar acciones permitidas para el dispositivo");
        System.out.println("12. Visualizar dispositivo más caro");
        System.out.println("13. Visualizar dispositivo más barato");
        System.out.println("14. Cargar datos de dispositivos desde CSV");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
    }

    /**
     * Permite al usuario seleccionar un dispositivo de la lista.
     *
     * @return Dispositivo seleccionado por el usuario.
     */
    private static Dispositivo seleccionarDispositivo() {
        System.out.println("Seleccione un dispositivo:");
        for (int i = 0; i < dispositivos.size(); i++) {
            System.out.println((i + 1) + ". " + dispositivos.get(i).getDescripcion());
        }
        System.out.print("Ingrese el número del dispositivo: ");
        int indice = scanner.nextInt() - 1;
        return dispositivos.get(indice);
    }

    /**
     * Carga los dispositivos desde un archivo CSV.
     */
    private static void cargarDesdeCSV() {
        
    }
}
