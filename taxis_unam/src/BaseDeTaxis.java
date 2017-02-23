/**
 * BaseDeTaxis.java
 * Clase encargada  de modelar el funcionamiento de registro de choferes y duenos y taxis de un BaseDeTaxis
 *
 * @author Jessi, Anuar
 */

public class BaseDeTaxis {
    private static final int MAX_VALUE_DUENOS = 10;
    private static final int MAX_VALUE_CHOFERES = 10;
    private static final int MAX_VALUE_TAXIS = 10;
    private Dueno duenos[];
    private Chofer choferes[];
    private Taxi taxis[];

    /**
     * Leeemos la información que hay guardada en los archivos y la cargamos
     */
    public BaseDeTaxis() {
        duenos = new Dueno[BaseDeTaxis.MAX_VALUE_DUENOS];
        choferes = new Chofer[BaseDeTaxis.MAX_VALUE_CHOFERES];
        taxis = new Taxi[BaseDeTaxis.MAX_VALUE_TAXIS];
        ArchivoDueno archivoDueno = new ArchivoDueno();
        ArchivoChofer archivoChofer = new ArchivoChofer();
        ArchivoTaxi archivoTaxi = new ArchivoTaxi();
        try {
            System.out.println("Leyendo datos....");
            duenos = archivoDueno.leeDuenos();
            choferes = archivoChofer.leeChoferes();
            taxis = archivoTaxi.leeTaxis();
            System.out.println("Datos leidos....");
        } catch (ArchivoLecturaNoCreadoException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * agrega un dueno al arreglo
     *
     * @param dueno
     * @throws ExcesoDuenoException
     */
    public void agregaDueno(Dueno dueno) throws ExcesoDuenoException {
        duenos[obtenerCantidadDueno()] = dueno;
    }

    /**
     * agrega un chofer al arreglo
     *
     * @param chofer
     * @throws ExcesoChoferException
     */
    public void agregaChofer(Chofer chofer) throws ExcesoChoferException {
        choferes[obtenerCantidadChofer()] = chofer;
    }

    /**
     * agrega un taxi al arreglo
     *
     * @param taxi
     * @throws ExcesoTaxiException
     */
    public void agregaTaxi(Taxi taxi) throws ExcesoTaxiException {
        taxis[obtenerCantidadTaxi()] = taxi;
    }

    /**
     * Escribe los duenos en un archivo
     */
    public void guardaDuenos() {
        ArchivoDueno archivoM = new ArchivoDueno();
        archivoM.escribeDueno(duenos);
    }

    /**
     * Escribe los choferes en un archivo
     */
    public void guardaChoferes() {
        ArchivoChofer archivoC = new ArchivoChofer();
        archivoC.escribeChofer(choferes);
    }

    /**
     * Escribe los taxis en un archivo
     */
    public void guardaTaxis() {
        ArchivoTaxi archivoM = new ArchivoTaxi();
        archivoM.escribeTaxi(taxis);
    }


    /**
     * ]Calcula los lugares ocupados por duenos
     *
     * @return
     */
    private int obtenerCantidadDueno() {
        int cantidad = 0;
        for (Dueno m : duenos) {
            if (m != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    /**
     * ]Calcula los lugares ocupados por choferes
     *
     * @return
     */
    private int obtenerCantidadChofer() {
        int cantidad = 0;
        for (Chofer m : choferes) {
            if (m != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    /**
     * ]Calcula los lugares ocupados por taxis
     *
     * @return
     */
    private int obtenerCantidadTaxi() {
        int cantidad = 0;
        for (Taxi m : taxis) {
            if (m != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    /**
     * Regresa información de los duenos guardados
     *
     * @return String con la información de los duenos
     */
    public String toStringDuenos() {
        String todosDuenos = "";
        for (int i = 0; i < obtenerCantidadDueno(); i++) {
            todosDuenos += Integer.toString(i) + " - " + duenos[i] + "\n";
        }
        return todosDuenos;
    }

    /**
     * Regresa información de los choferes guardados
     *
     * @return String con la información de los choferes
     */
    public String toStringChoferes() {
        String todosChoferes = "";
        for (int i = 0; i < obtenerCantidadChofer(); i++) {
            todosChoferes += Integer.toString(i) + " - " + choferes[i] + "\n";
        }
        return todosChoferes;
    }

    /**
     * Regresa información de los taxis guardados
     *
     * @return String con la información de los taxis
     */
    public String toStringTaxis() {
        String todosTaxis = "";
        for (int i = 0; i < obtenerCantidadTaxi(); i++) {
            todosTaxis += Integer.toString(i) + " - " + taxis[i] + "\n";
        }
        return todosTaxis;
    }

    public Dueno getDueno(int i) throws ExcesoDuenoException {
        if (i < 0 || i >= this.obtenerCantidadDueno()) {
            throw new ExcesoDuenoException("Dueno seleccionado incorrectamente");
        }
        return this.duenos[i];
    }

    public Chofer getChofer(int i) throws ExcesoChoferException {
        if (i < 0 || i >= this.obtenerCantidadChofer()) {
            throw new ExcesoChoferException("Chofer seleccionado incorrectamente");
        }
        return this.choferes[i];
    }

    public Taxi getTaxi(int i) throws ExcesoTaxiException {
        if (i < 0 || i >= this.obtenerCantidadTaxi()) {
            throw new ExcesoTaxiException("Taxi seleccionado incorrectamente");
        }
        return this.taxis[i];
    }

    /**
     * Elimina a un dueno del arreglo de duenos
     *
     * @param i indice del dueno a eliminar
     * @throws ExcesoDuenoException
     */
    public void eliminaDueno(int i) throws ExcesoDuenoException {
        if (i < 0 || i >= this.obtenerCantidadDueno()) {
            throw new ExcesoDuenoException("Dueno seleccionado incorrectamente");
        }
        this.duenos[i] = null;
        this.recorreDuenos(i);
    }

    /**
     * Elimina a un chofer del arreglo de choferes
     *
     * @param i indice del chofer a eliminar
     * @throws ExcesoChoferException
     */
    public void eliminaChofer(int i) throws ExcesoChoferException {
        if (i < 0 || i >= this.obtenerCantidadChofer()) {
            throw new ExcesoChoferException("Chofer seleccionado incorrectamente");
        }
        this.choferes[i] = null;
        this.recorreChoferes(i);
    }

    /**
     * Elimina a un taxi del arreglo de taxis
     *
     * @param i indice del taxi a eliminar
     * @throws ExcesoTaxiException
     */
    public void eliminaTaxi(int i) throws ExcesoTaxiException {
        if (i < 0 || i >= this.obtenerCantidadTaxi()) {
            throw new ExcesoTaxiException("Taxi seleccionado incorrectamente");
        }
        this.taxis[i] = null;
        this.recorreTaxis(i);
    }

    /**
     * Se encarga de recorrer los duenos en el arreglo para que no haya nulos en medio
     */
    private void recorreDuenos(int i) {
        int indiceUltimoM = this.obtenerCantidadDueno();
        if (i != indiceUltimoM) {
            this.duenos[i] = duenos[indiceUltimoM];
            duenos[indiceUltimoM] = null;
        }
    }

    /**
     * Se encarga de recorrer los choferes en el arreglo para que no haya nulos en medio
     */
    private void recorreChoferes(int i) {
        int indiceUltimoM = this.obtenerCantidadChofer();
        if (i != indiceUltimoM) {
            this.choferes[i] = choferes[indiceUltimoM];
            choferes[indiceUltimoM] = null;
        }
    }

    /**
     * Se encarga de recorrer los taxis en el arreglo para que no haya nulos en medio
     */
    private void recorreTaxis(int i) {
        int indiceUltimoM = this.obtenerCantidadTaxi();
        if (i != indiceUltimoM) {
            this.taxis[i] = taxis[indiceUltimoM];
            taxis[indiceUltimoM] = null;
        }
    }


    public Dueno[] getDuenos() {
        return duenos;
    }

    public void setDuenos(Dueno[] duenos) {
        this.duenos = duenos;
    }

    public Chofer[] getChoferes() {
        return choferes;
    }

    public void setChoferes(Chofer[] choferes) {
        this.choferes = choferes;
    }

    public Taxi[] getTaxis() {
        return taxis;
    }

    public void setTaxis(Taxi[] taxis) {
        this.taxis = taxis;
    }
}
