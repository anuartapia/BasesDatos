/**
 * ArchivoChofer.java Clase encargada de leer/escribir objetos de la clase
 * Chofer
 *
 * @author Eduardo Castro
 * @version Noviembre 2016
 * @see ManipulaArchivo
 */
public class ArchivoChofer extends ManipulaArchivo {
    public ArchivoChofer() {
        // coustrimos un file llamado choferes, para poder editar
        super("choferes.txt");
    }

    /**
     * Prepara un arreglo de Chofer para que pueda ser guardado
     *
     * @param chofer
     *            los choferes que se desean guardar
     */
    public void escribeChofer(Chofer chofer[]) {
        String lineaChofer = "";
        for (Chofer d : chofer) {
            lineaChofer += d + "\n";
        }
        super.escribeArchivo(lineaChofer);
    }

    /**
     * Convierte un arreglo de String a un arreglo de choferes
     * @return arreglo de Chofer con los datos del archivo
     * @throws ArchivoLecturaNoCreadoException
     */
    public Chofer[] leeChoferes() throws ArchivoLecturaNoCreadoException {
        String lineas[] = super.leeArchivo();
        Chofer choferes[] = new Chofer[lineas.length];
        for (int i = 0; i < choferes.length; i++) {
            if (!lineas[i].equals("null")) {
                choferes[i] = this.parseaChofer(lineas[i]);
            }
        }
        return choferes;
    }

    /**
     * Recibe una cadena y parsea los datos para crear el objeto Chofer
     * @param cadenaChofer la cadena a parsear
     * @return el objeto con los datos de la cadena
     */
    private Chofer parseaChofer(String cadenaChofer) {
        String linea[] = cadenaChofer.trim().split(",");
        String nombre = linea[0];
        int edad = Integer.parseInt(linea[1]);
        char sexo = linea[2].charAt(0);
        String numLicencia = linea[3];
        return new Chofer(nombre, edad, sexo, numLicencia);
    }

}
