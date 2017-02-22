import java.util.Scanner;

/**
 * Created by etapia on 21/02/17.
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
