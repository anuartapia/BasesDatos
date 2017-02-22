/**
 * ArchivoDueno.java Clase encargada de leer/escribir objetos de la clase
 * Dueno
 *
 * @author Eduardo Castro
 * @version Noviembre 2016
 * @see ManipulaArchivo
 */
public class ArchivoDueno extends ManipulaArchivo {
    public ArchivoDueno() {
        // coustrimos un file llamado duenos, para poder editar
        super("duenos.txt");
    }

    /**
     * Prepara un arreglo de Dueno para que pueda ser guardado
     *
     * @param dueno
     *            los duenos que se desean guardar
     */
    public void escribeDueno(Dueno dueno[]) {
        String lineaDueno = "";
        for (Dueno d : dueno) {
            lineaDueno += d + "\n";
        }
        super.escribeArchivo(lineaDueno);
    }

    /**
     * Convierte un arreglo de String a un arreglo de duenos
     * @return arreglo de Dueno con los datos del archivo
     * @throws ArchivoLecturaNoCreadoException
     */
    public Dueno[] leeDuenos() throws ArchivoLecturaNoCreadoException {
        String lineas[] = super.leeArchivo();
        Dueno duenos[] = new Dueno[lineas.length];
        for (int i = 0; i < duenos.length; i++) {
            if (!lineas[i].equals("null")) {
                duenos[i] = this.parseaDueno(lineas[i]);
            }
        }
        return duenos;
    }

    /**
     * Recibe una cadena y parsea los datos para crear el objeto Dueno
     * @param cadenaDueno la cadena a parsear
     * @return el objeto con los datos de la cadena
     */
    private Dueno parseaDueno(String cadenaDueno) {
        String linea[] = cadenaDueno.trim().split(",");
        String nombre = linea[0];
        int edad = Integer.parseInt(linea[1]);
        char sexo = linea[2].charAt(0);
        String rfc = linea[3];
        return new Dueno(nombre, edad, sexo, rfc);
    }

}
