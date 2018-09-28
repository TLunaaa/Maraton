
public class Maraton {
	private Corredor[] cupo = new Corredor[12000];
	
	public void asignarPosicion(Corredor corredor) {
		corredor.getDNI();
	}
	
	public int funcionHash(int dni){
		int res;
		res = Math.floorMod(dni, 119993);
		return 0;
	}
}
