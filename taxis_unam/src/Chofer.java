import java.util.Scanner;

/**
 * Modela un Chofer
 *
 * @author Jessi, Anuar
 */
public class Chofer extends Persona {
    private String num_licencia;

    public Chofer(String nombre, int edad, char sexo, String num_licencia) {
        super(nombre, edad, sexo);
        this.num_licencia = num_licencia;
    }

    public Chofer() {
        super();
        input = new Scanner(System.in);
        System.out.println("Ingresa número de licencia.");
        this.num_licencia = input.nextLine();
    }

    public void edita() {
        super.edita();
        input = new Scanner(System.in);
        System.out.println("Ingresa número de licencia.");
        this.num_licencia = input.nextLine();
    }

    public String getNum_licencia() {
        return num_licencia;
    }

    public void setNum_licencia(String num_licencia) {
        this.num_licencia = num_licencia;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.num_licencia;
    }
}
