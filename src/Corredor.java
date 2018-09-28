import java.util.Random;

public class Corredor {
	private int DNI = -1;
	private String nombre;
	private String sexo;
	private int edad;
	private String categoria;  //categegoria 5KM,10KM,20KM
	private int time=-1;
	
	
	public Corredor() {
		int max=45000000,min=14000000;
		Random rand = new Random();
		this.DNI = rand.nextInt((max - min) + 1) + min;
		this.nombre = nombreRandom();
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
	
	
	public String getCategoria() {
		return categoria;
	}

	public String getTime() {
		String tiempo;
		int horas,minutos,segundos;
		double hour = ((double)this.time)/3600;
		double minutes;
		double seconds;
		horas = (int)hour;
		minutes=((hour - horas)*60);
		minutos = (int)minutes;
		seconds = (minutes-minutos)*60;
		segundos = (int)seconds;
		tiempo = horas+":"+minutos+":"+segundos;
		return tiempo;
	}

	public int getDNI() {
		return DNI;
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

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Corredor [DNI=" + DNI + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", categoria="
				+ categoria + "]";
	}
	
	
}
