import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Maraton {
	private int maxCorredores=12000;
	private Corredor[] cupo = new Corredor[maxCorredores];
	
	public Maraton(){
		int max=11999,min=100;
		Random rand = new Random();
		for (int i = 0; i < rand.nextInt((max - min) + 1) + min; i++) {
			Corredor aux = new Corredor();
			asignarPosicion(aux);
			//System.out.println(aux);
		}
	}
	
	public void asignarPosicion(Corredor corredor) {
		int posicion = funcionHash(corredor.getDNI());
		int iniPos = posicion; boolean move = false;
		while (this.cupo[posicion]!=null){
			if (posicion < 12000)
				posicion++;
			else
				posicion=0;
			move = true;
		}
		if ((move && posicion != iniPos)||(!move)) {
			this.cupo[posicion] = corredor;
			System.out.println("Se ha cargado el corredor #"+posicion);
		}
		else {
			System.out.println("Error de sobrecarga");
		}
	}
	
	public void revocarPos(Corredor corredor) {
		int posicion = funcionHash(corredor.getDNI());
		int iniPos = posicion; boolean move = false;
		if (this.cupo[posicion]!=null) {		
			while (this.cupo[posicion]!=null && corredor.getDNI()!=this.cupo[posicion].getDNI() && ((move && posicion != iniPos)||(!move))) {
				if (posicion < 12000)
					posicion++;
				else
					posicion=0;
				move = true;
			}
			if (this.cupo[posicion]!=null && corredor.getDNI()==this.cupo[posicion].getDNI() && ((move && posicion != iniPos)||(!move))) {
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
	
	public void listarColisiones() {
		for (int i=0;i<maxCorredores;i++) {
			if (this.cupo[i]!=null) {
				if (funcionHash(cupo[i].getDNI())!=i)
					System.out.println("Corredor ###"+i+" "+ funcionHash(cupo[i].getDNI()));
			}
		}
	}
	
	public void listTimeLowHigh() {
		SortedSet<Corredor> set = new TreeSet<>(
		        Comparator.comparing(Corredor::getTime));
		for (int i=0;i<maxCorredores;i++) {
			if (this.cupo[i]!=null) {
				set.add(this.cupo[i]);
			}
		}
		set.forEach(System.out::println);
	}
}
