import java.util.Scanner;

/**
 * Modela un Taxi
 *
 * @author Jessi, Anuar
 */
public class Taxi {
    private String modelo;
    private String marca;
    private int ano;
    private int cilindros;
    private int puertas;
    private boolean refaccion;
    private String placa;
    protected Scanner input;

    public Taxi(String modelo, String marca, int ano, int cilindros, int puertas, boolean refaccion, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cilindros = cilindros;
        this.puertas = puertas;
        this.refaccion = refaccion;
        this.placa = placa;
    }

    public Taxi() {
        input = new Scanner(System.in);
        System.out.println("Ingresa modelo.");
        this.modelo = input.nextLine();
        System.out.println("Ingresa marca.");
        this.marca = input.nextLine();
        System.out.println("Ingresa año.");
        this.ano = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa cilindros.");
        this.cilindros = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa puertas.");
        this.puertas = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa refacción.");
        this.refaccion = (input.nextLine()).equals("1") ? true : false;
        System.out.println("Ingresa placa.");
        this.placa = input.nextLine();
    }

    public void edita() {
        input = new Scanner(System.in);
        System.out.println("Ingresa modelo.");
        this.modelo = input.nextLine();
        System.out.println("Ingresa marca.");
        this.marca = input.nextLine();
        System.out.println("Ingresa año.");
        this.ano = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa cilindros.");
        this.cilindros = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa puertas.");
        this.puertas = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa refacción.");
        this.refaccion = (input.nextLine()).equals("1") ? true : false;
        System.out.println("Ingresa placa.");
        this.placa = input.nextLine();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isRefaccion() {
        return refaccion;
    }

    public void setRefaccion(boolean refaccion) {
        this.refaccion = refaccion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return modelo +
                "," + marca +
                "," + ano +
                "," + cilindros +
                "," + puertas +
                "," + refaccion +
                "," + placa;
    }
}
