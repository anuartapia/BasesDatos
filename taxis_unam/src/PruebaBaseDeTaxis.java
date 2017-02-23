import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que otorga una interfaz de linea de comandos para probar
 * los métodos de la clase BaseDeTaxis
 *
 * @author Jessi, Anuar
 */
public class PruebaBaseDeTaxis {
    public static void main(String[] args) {
        Dueno c;
        boolean bandera;
        int opcion = 0;
        Scanner input = new Scanner(System.in);
        BaseDeTaxis base = new BaseDeTaxis();
        do {
            bandera = true;
            String menu = "Ingresa la opción deseada\n"
                    + ("1-Agregar chofer\n" + "2-Ver chofer\n" + "3-Editar chofer\n" + "4-Borrar chofer\n")
                    + ("5-Agregar dueno\n" + "6-Ver dueno\n" + "7-Editar dueno\n" + "8-Borrar dueno\n")
                    + ("9-Agregar taxi\n" + "10-Ver taxi\n" + "11-Editar taxi\n" + "12-Borrar taxi\n")
                    + ("13-Salir\n");
            System.out.println(menu);
            try {
                opcion = input.nextInt();
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Ingresa un número como opción");
            }
            if (opcion > 0 && opcion <= 13) {
                switch (opcion) {
                    case 1: // Agregar chofer
                        try {
                            Chofer chofer = new Chofer();
                            base.agregaChofer(chofer);
                            System.out.println("Chofer guardado correctamente.");
                        } catch (ExcesoChoferException e) {
                            System.out.println("Ya no hay lugar disponible para un nuevo chofer.");
                        }
                        break;
                    case 2: // Ver chofer
                        System.out.println(base.toStringChoferes());
                        break;
                    case 3: // Editar chofer
                        System.out.println("Elije el número del chofer que deseas editar");
                        bandera = true;
                        do {
                            try {
                                System.out.println(base.toStringChoferes());
                                opcion = input.nextInt();
                                base.getChofer(opcion).edita();
                                bandera = false;
                                System.out.println("Chofer editado correctamente");
                            } catch (ExcesoChoferException e) {
                                System.out.println(e.getMessage());
                                bandera = false;
                            } catch (InputMismatchException i) {
                                System.out.println("Ingresa un número como opción");
                                input.next();
                                bandera = true;
                            }
                        } while (bandera);
                        bandera = true;
                        break;
                    case 4: // Borrar chofer
                        System.out.println("Elije el número del chofer que deseas borrar");
                        bandera = true;
                        do {
                            try {
                                System.out.println(base.toStringChoferes());
                                opcion = input.nextInt();
                                base.eliminaChofer(opcion);
                                bandera = false;
                            } catch (ExcesoChoferException e) {
                                System.out.println(e.getMessage());
                                bandera = false;
                            } catch (InputMismatchException i) {
                                System.out.println("Ingresa un número como opción");
                                input.next();
                                bandera = true;
                            }
                        } while (bandera);
                        bandera = true;
                        break;

                    case 5: // Agregar dueno
                        try {
                            Dueno dueno = new Dueno();
                            base.agregaDueno(dueno);
                            System.out.println("Dueno guardado correctamente.");
                        } catch (ExcesoDuenoException e) {
                            System.out.println("Ya no hay lugar disponible para un nuevo dueno.");
                        }
                        break;
                    case 6: // Ver dueno
                        System.out.println(base.toStringDuenos());
                        break;
                    case 7: // Editar dueno
                        System.out.println("Elije el número del dueno que deseas editar");
                        bandera = true;
                        do {
                            try {
                                System.out.println(base.toStringDuenos());
                                opcion = input.nextInt();
                                base.getDueno(opcion).edita();
                                bandera = false;
                                System.out.println("Dueno editado correctamente");
                            } catch (ExcesoDuenoException e) {
                                System.out.println(e.getMessage());
                                bandera = false;
                            } catch (InputMismatchException i) {
                                System.out.println("Ingresa un número como opción");
                                input.next();
                                bandera = true;
                            }
                        } while (bandera);
                        bandera = true;
                        break;
                    case 8: // Borrar dueno
                        System.out.println("Elije el número del dueno que deseas borrar");
                        bandera = true;
                        do {
                            try {
                                System.out.println(base.toStringDuenos());
                                opcion = input.nextInt();
                                base.eliminaDueno(opcion);
                                bandera = false;
                            } catch (ExcesoDuenoException e) {
                                System.out.println(e.getMessage());
                                bandera = false;
                            } catch (InputMismatchException i) {
                                System.out.println("Ingresa un número como opción");
                                input.next();
                                bandera = true;
                            }
                        } while (bandera);
                        bandera = true;
                        break;

                    case 9: // Agregar taxi
                        try {
                            Taxi taxi = new Taxi();
                            base.agregaTaxi(taxi);
                            System.out.println("Taxi guardado correctamente.");
                        } catch (ExcesoTaxiException e) {
                            System.out.println("Ya no hay lugar disponible para un nuevo taxi.");
                        }
                        break;
                    case 10: // Ver taxi
                        System.out.println(base.toStringTaxis());
                        break;
                    case 11: // Editar taxi
                        System.out.println("Elije el número del taxi que deseas editar");
                        bandera = true;
                        do {
                            try {
                                System.out.println(base.toStringTaxis());
                                opcion = input.nextInt();
                                base.getTaxi(opcion).edita();
                                bandera = false;
                                System.out.println("Taxi editado correctamente");
                            } catch (ExcesoTaxiException e) {
                                System.out.println(e.getMessage());
                                bandera = false;
                            } catch (InputMismatchException i) {
                                System.out.println("Ingresa un número como opción");
                                input.next();
                                bandera = true;
                            }
                        } while (bandera);
                        bandera = true;
                        break;
                    case 12: // Borrar taxi
                        System.out.println("Elije el número del taxi que deseas borrar");
                        bandera = true;
                        do {
                            try {
                                System.out.println(base.toStringTaxis());
                                opcion = input.nextInt();
                                base.eliminaTaxi(opcion);
                                bandera = false;
                            } catch (ExcesoTaxiException e) {
                                System.out.println(e.getMessage());
                                bandera = false;
                            } catch (InputMismatchException i) {
                                System.out.println("Ingresa un número como opción");
                                input.next();
                                bandera = true;
                            }
                        } while (bandera);
                        bandera = true;
                        break;
                    case 13:
                        System.out.println("Guardando datos de choferes, dueños y taxis....");
                        base.guardaChoferes();
                        base.guardaDuenos();
                        base.guardaTaxis();
                        bandera = false;
                        System.out.println("Datos guardados");
                        System.out.println("Saliendo del sistema...\nHasta pronto.");
                        break;
                    default:
                        break;
                }
            }
        } while (bandera);

    }
}
