/**
 * Clase que implementa excepcion para cuando no se pueda guardar a otro Taxi
 *
 * @author Jessi, Anuar
 */
public class ExcesoTaxiException extends Exception{

    public ExcesoTaxiException(String message){
        super(message);
    }

}

