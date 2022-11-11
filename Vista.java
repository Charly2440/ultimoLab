import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Vista {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        /*System.out.println(sistema.pronosticoClima());
        Radio radio = new Radio();
        radio.rellenarPlaylists();*/
        Scanner scan = new Scanner(System.in);
        System.out.println("\n===================================================================");
		System.out.println("|          Bienvenido a la Radio de Mercedes tipo C               |");
		System.out.println("|     Navega en nuestro sistema mientras disfrutas de tu viaje    |");
		System.out.println("===================================================================");
        System.out.println("===================================================================");
		System.out.println("|             Ingrese la opcion que desea ejecutar                |");
        System.out.println("|                                                                 |");
		System.out.println("| 1.  Estado del radio (Encendido o Apagado)                      |");
        System.out.println("| 2.  Subir o Bajar volumen                                       |");
        System.out.println("| 3.  Cambiar Frecuencia (AM/FM)                                  |");
        System.out.println("| 4.  Cambiar Emisoras                                            |");
        System.out.println("| 5.  Guardar Emisoras Favoritas                                  |");
        System.out.println("| 6.  Cargar Emisoras Favoritas                                   |");
        System.out.println("| 7.  Seleccionar una PlayList                                    |");
        System.out.println("| 8.  Cambiar cacion                                              |");
        System.out.println("| 9.  Estado del telefono (Conectado o Desconectado)              |");
        System.out.println("| 10. Mostrar Contactos                                           |");
        System.out.println("| 11. Llamar Contacto                                             |");
        System.out.println("| 12. Finalizar Llamada                                           |");
        System.out.println("| 13. Poner Llamada en espera                                     |");
        System.out.println("| 14. Pronostico del clima                                        |");
		System.out.println("===================================================================");
        int opcion = 1;
        System.out.println("Ingrese la opcion que desea: ");
        opcion = scan.nextInt();
        scan.nextLine();
        while(opcion < 15 && opcion >=1){
            switch(opcion){
                case 1: {
                    System.out.println(sistema.pronosticoClima());
                    break;
                }
            }

        }





        }
    }



