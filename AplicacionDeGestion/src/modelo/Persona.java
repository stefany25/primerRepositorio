package modelo;

public class Persona {
	private String nombre;
	private int edad;
	private String direccion;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;

	}

	public Persona() {
	}

	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * Contructor que recibe tren parametros
	 * @param nombre
	 * @param edad
	 * @param direccion
	 */
	public Persona(String nombre, int edad, String direccion) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;

	}

	private void calculo() {

	}
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param direccion
	 * @return
	 */
	public String comprobarDireccion(String nombre, int edad, String direccion) {

		return edad+" "+nombre+" "+direccion;

	}

	@Override

	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";

	}
}
