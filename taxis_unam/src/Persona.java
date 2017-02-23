
/**
 * Persona.java
 * Clase encargada de modelar una persona
 * @author Eduardo Castro
 * @version Noviembre 2016
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Modela una Persona
 *
 * @author Jessi, Anuar
 */
public class Persona {
	// atributos de la clase padre
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected String domicilio;
	protected String correo;
    protected String telefono;
    // protected String foto;
    protected Scanner input;

    /**
     * Constructor por parametros
     *
     * @param nombre
     * @param edad
     * @param sexo
     */
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Constructor por omision
	 */
	public Persona() {
		pideDatos();
	}

	/**
	 * Metodo que pide datos para inicializar la clase
	 */
	private void pideDatos() {
		input = new Scanner(System.in);
		boolean bandera = true;
		System.out.println("Ingresa nombre.");
		this.nombre = input.nextLine();
		do {
			try {
				System.out.println("Ingresa edad.");
				this.edad = input.nextInt();
				bandera = false;
			} catch (InputMismatchException e) {
				input.next();
				bandera = true;
			}
		} while (bandera);

		do {
			System.out.println("Ingresa sexo\n" + "Masculino - M\n" + "Femenino - F");
			this.sexo = input.next().toUpperCase().charAt(0);
		} while (this.sexo != ' ' && this.sexo != 'F' && this.sexo != 'M');
	}

	public void edita() {
		this.pideDatos();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return this.nombre + "," + this.edad + "," + this.sexo;
	}

	public static void main(String[] args) {
		Persona m = new Persona();
		System.out.println(m);
	}

}
