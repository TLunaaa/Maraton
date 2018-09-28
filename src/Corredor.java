import java.util.Random;

public class Corredor  implements Comparable{
	private int DNI = -1;
	private String nombre;
	private String sexo;
	private int edad;
	private String categoria;  //categoria 5KM,10KM,20KM
	private int time;
	
	
	public Corredor() {
		int max=45000000,min=14000000;
		Random rand = new Random();
		this.DNI = rand.nextInt((max - min) + 1) + min;
		this.nombre = nombreRandom();
		this.time=rand.nextInt((300) + 1);
		if(rand.nextInt(2) == 0) {
			this.sexo = "Masculino";
		}else
			this.sexo = "Femenino";
		this.edad = rand.nextInt(60);
		switch(rand.nextInt(3)) {
			case 0:this.categoria = "5km"; break;
			case 1:this.categoria = "10km"; break;
			case 2:this.categoria = "20km"; break;
		}	
	}
	
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
	
		
	public int getTime() {
		return time;
	}

	private String nombreRandom(){
		int max=122,min=48;
		String nombre = "";
		Random rand = new Random();
		for (int i = 0; i < 7; i++) {
			int num = rand.nextInt((max - min) + 1) + min;
			nombre +="" +(char)num;
		}
		return nombre;
	}

	

	@Override
	public String toString() {
		return "[DNI=" + DNI + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", categoria="
				+ categoria + ", time=" + time + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		Corredor otro =(Corredor) arg0;
		int aux;
		if (this.getTime()==otro.getTime()) aux = 0; else
		{	if (this.getTime()>otro.getTime()) aux = 1; else aux = -1;	}
		return aux;
	}
	
	
}
