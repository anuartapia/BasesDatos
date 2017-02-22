/**
 * Created by etapia on 21/02/17.
 */
public class Chofer extends Persona {
    private int num_licencia;

    public Chofer(String nombre, int edad, char sexo, int num_licencia) {
        super(nombre, edad, sexo);
        this.num_licencia = num_licencia;
    }

    public int getNum_licencia() {
        return num_licencia;
    }

    public void setNum_licencia(int num_licencia) {
        this.num_licencia = num_licencia;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.num_licencia ;
    }
}
