
public class Maraton {
	private Corredor[] cupo = new Corredor[12000];
	
	public void asignarPosicion(Corredor corredor) {
		int posicion = funcionHash(corredor.getDNI());
		this.cupo[posicion] = corredor;
		System.out.println(posicion);
	}
	
	public int funcionHash(int dni){
		//Metodo Resto de Division o Modulo
		int res;
		res = Math.floorMod(dni, 11987);
		return res;
	}
}
