
public class Corredor {
	private int DNI;
	private String nombre;
	private String sexo;
	private int edad;
	private String categoria;
	private int time;
	
	
	public Corredor(int dNI, String nombre, String sexo, int edad, String categoria) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.categoria = categoria;
	}

	public int getDNI() {
		return DNI;
	}
	
	
	
	
}