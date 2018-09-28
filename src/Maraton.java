
public class Maraton {
	private int maxCorredores=12000;
	private Corredor[] cupo = new Corredor[maxCorredores];
	
	public void asignarPos(Corredor corredor) {
		int posicion = funcionHash(corredor.getDNI());
		int iniPos = posicion;
		while (this.cupo[posicion]!=null){
			if (posicion < 12000)
				posicion++;
			else
				posicion=0;
		}
		if (posicion != iniPos) {
			this.cupo[posicion] = corredor;
			System.out.println("Se ha cargado el corredor #"+posicion);
		}
		else {
			System.out.println("Error de sobrecarga");
		}
	}
	
	public void revocarPos(Corredor corredor) {
		int posicion = funcionHash(corredor.getDNI());
		int iniPos = posicion;
		if (this.cupo[posicion]!=null) {		
			while (this.cupo[posicion]!=null && corredor.getDNI()!=this.cupo[posicion].getDNI() && iniPos!=posicion+1) {
				if (posicion < 12000)
					posicion++;
				else
					posicion=0;
			}
			if (this.cupo[posicion]!=null && corredor.getDNI()!=this.cupo[posicion].getDNI() && iniPos!=posicion) {
				this.cupo[posicion] = null;
				System.out.println("Se ha quitado el corredor #"+posicion);
			}
			else {
				System.out.println("No se ha podido quitar el corredor #"+posicion);
			}
		}
		else {
			System.out.println("Error: Corredor no encontrado: "+corredor.getDNI());
		}
	}
	
	public int funcionHash(int dni){
		//Metodo Resto de Division o Modulo
		int res;
		res = Math.floorMod(dni, 11987);
		return res;
	}
	
	public void listarCorredores() {
		for (int i=0;i<maxCorredores;i++) {
			if (this.cupo[i]!=null) {
				System.out.println("Corredor #"+i+" "+this.cupo[i]);
			}
		}
	}
}
