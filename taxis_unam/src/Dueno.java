import java.util.Scanner;

/**
 * Created by etapia on 21/02/17.
 */
public class Dueno extends Persona {
    private String rfc;

    public Dueno(String nombre, int edad, char sexo, String rfc) {
        super(nombre, edad, sexo);
        this.rfc = rfc;
    }

    public Dueno() {
        super();
        input = new Scanner(System.in);
        System.out.println("Ingresa rfc.");
        this.rfc = input.nextLine();
        /*
        input = new Scanner(System.in);
        boolean bandera = true;
        do {
            try {
                System.out.println("Ingresa idDoctor.");
                this.idDoctor = input.nextInt();
                bandera = false;
            } catch (InputMismatchException e) {
                input.next();
                bandera = true;
            }
        } while (bandera);
        */
    }

    public void edita() {
        super.edita();
        input = new Scanner(System.in);
        System.out.println("Ingresa rfc.");
        this.rfc = input.nextLine();
        /*
        input = new Scanner(System.in);
        boolean bandera = true;
        do {
            try {
                System.out.println("Ingresa idDoctor.");
                this.idDoctor = input.nextInt();
                bandera = false;
            } catch (InputMismatchException e) {
                input.next();
                bandera = true;
            }
        } while (bandera);
        */
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.rfc;
    }
}
