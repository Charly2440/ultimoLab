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
        
        while(opcion < 15 && opcion >=1){
            System.out.println("\nIngrese la opcion que desea: ");
            opcion = scan.nextInt();
            scan.nextLine();
            switch(opcion){
                case 1: {
                    if (sistema.estadoRadio()==true){
                        System.out.println("Radio encendido");
                    }
                    else {
                        System.out.println("Radio apagado");
                    }
                    
                    break;
                }
                case 2: {
                    int op = 0;
                    System.out.println("Desea Subir (1) o bajar (2) volumen?");
                    op = scan.nextInt();
                    scan.nextLine();
                    if (op == 1){
                        System.out.println("El volumen de la radio es: ");
                        System.out.println(sistema.cambiarVolumen(true));
                    }
                    if (op == 2){
                        System.out.println("El volumen de la radio es: ");
                        System.out.println(sistema.cambiarVolumen(false));
                    }
                    break;
                }
                case 3: {
                    int op = 0;
                    System.out.println("Desea AM (1) o FM (2)?");
                    op = scan.nextInt();
                    scan.nextLine();
                    if(op == 1){
                        System.out.println(sistema.cambiarFrecuencia("su radio esta en AM"));
                    }
                    if(op == 2){
                        System.out.println(sistema.cambiarFrecuencia("su radio esta en FM"));
                    }
                    break;
                }
                case 4: {
                    int op = 0;
                    System.out.println("Desea Subir (1) o bajar (2) Emisora?");
                    op = scan.nextInt();
                    scan.nextLine();
                    if (op == 1){
                        System.out.println("La emisora de la radio es: ");
                        System.out.println(sistema.cambiarEmisoras(true));
                    }
                    if (op == 2){
                        System.out.println("La emisora de la radio es: ");
                        System.out.println(sistema.cambiarEmisoras(false));
                    }
                    break;
                }
                case 5: {
                    sistema.guardarEmisoras();
                    break;
                }

                case 6: {
                    System.out.println(sistema.mostrarEmisoras());
                    int op = 0;
                    System.out.println("Ingrese la opcion que desea seleccionar");
                    op = scan.nextInt();
                    System.out.println(sistema.cargarEmisoras(op));
                    break;
                } 

                case 7: {
                    System.out.println(sistema.mostrarPlaylists());
                    int op = 0;
                    System.out.println("Desea PlayList 1 (0) PlayList 2 (1) o PlayList 3 (2)?");
                    op = scan.nextInt();
                    System.out.println(sistema.seleccionarPlaylist(op));
                    break;
                }

                case 8: {
                    int op = 0;
                    System.out.println("Desea subir (1) o bajar (2) Cancion?");
                    op = scan.nextInt();
                    scan.nextLine();
                    if (op == 1){
                        System.out.println("La cancion es: ");
                        System.out.println(sistema.cambiarCancion(true));
                    }
                    if (op == 2){
                        System.out.println("La cancion es: ");
                        System.out.println(sistema.cambiarCancion(false));
                    }
                    break;
                }
                case 9: {
                    if (sistema.estadoConeccion()==true){
                        System.out.println("Telefono conectado");
                    }
                    else {
                        System.out.println("Telefono desconectado");
                    }
                    break;
                }
                case 10: {
                    System.out.println(sistema.mostrarConstactos());
                    break;
                }

                case 11: {
                    System.out.println(sistema.mostrarConstactos());
                    int op = 0;
                    System.out.println("Ingrese la posicion de la persona que desea llamar");
                    op = scan.nextInt();
                    System.out.println(sistema.llamarContactos(op));
                    break;
                }

                case 12: {
                    System.out.println(sistema.finalizarLlamadaEspera());
                    break;
                }
                case 13: {
                    System.out.println(sistema.cambiarLlamadaEspera());
                    break;
                }
                case 14: {
                    System.out.println(sistema.pronosticoClima());
                    break;
                }

            }

        }

        }
    }

