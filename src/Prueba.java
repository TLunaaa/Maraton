
public class Prueba {

	public static void main(String[] args) {
		Maraton maraton = new Maraton();
		Corredor corredor1 = new Corredor(39435667,"Tomas","Masculino",22,"Junior");
		Corredor corredor2 = new Corredor(39274042,"Cacho","Masculino",22,"Junior");
		maraton.asignarPosicion(corredor1);
		maraton.asignarPosicion(corredor2);
	}

}
