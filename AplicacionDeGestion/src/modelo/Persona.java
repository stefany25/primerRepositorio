package modelo;

public class Persona {
	private String nombre;
	private int edad;
	private String direccion;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;

	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre, int edad, String direccion) {

		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}

	private void calculo() {

	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
}
