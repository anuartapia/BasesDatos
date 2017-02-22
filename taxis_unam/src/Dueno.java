/**
 * Created by etapia on 21/02/17.
 */
public class Dueno extends Persona {
    private String rfc;

    public Dueno(String nombre, int edad, char sexo, String rfc) {
        super(nombre, edad, sexo);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
