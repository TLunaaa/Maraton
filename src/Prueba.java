
public class Prueba {

	public static void main(String[] args) {
		Maraton maraton = new Maraton();

		Corredor corredor1 = new Corredor(39435667,"Tomas","Masculino",22,"10km");
		Corredor corredor2 = new Corredor(39274042,"Nico","Masculino",22,"5km");
		Corredor corredor3 = new Corredor(39223434,"Tu mama","Masculino",22,"20km");
		maraton.asignarPosicion(corredor1);
		maraton.asignarPosicion(corredor2);
		maraton.asignarPosicion(corredor3);
		maraton.revocarPos(corredor2);
		//maraton.listarColisiones();
		//maraton.listarCorredores();
		maraton.listTimeLowHigh();
	}

}
