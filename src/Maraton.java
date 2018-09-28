import java.util.Random;

public class Maraton {
	private Corredor[] cupo = new Corredor[12000];
	
	public Maraton(){
		int max=11999,min=100;
		Random rand = new Random();
		for (int i = 0; i < rand.nextInt((max - min) + 1) + min; i++) {
			Corredor aux = new Corredor();
			asignarPosicion(aux);
			System.out.println(aux);
		}
	}
	
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
