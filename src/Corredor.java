
public class Corredor {
	private int DNI;
	private String nombre;
	private String sexo;
	private String edad;
	private String categoria;
	private int time;
	
	
	public Corredor(int dNI, String nombre, String sexo, String edad, String categoria, int time) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.categoria = categoria;
		this.time = time;
	}



	public int getDNI() {
		return DNI;
	}
	
	
	
	
}
