/**
 * 
 */
package died.lab02.problema02;

import java.util.ArrayList;

import died.lab02.problema03.Comisionable;

/**
 * @author Cote
 *
 */
public class Cadete {
	
	private ArrayList<Comisionable> comisionables;
	
	public Cadete() {
		comisionables = new ArrayList<Comisionable>();
	}

	public void agregarPedido(Comisionable comisionable) {
		comisionables.add(comisionable);
	}
	
	public float comisiones() {
		float comisionTotal=0f;
		for(Comisionable comisionable:comisionables) {
			if(comisionable.getFechaDeEntrega() != null) {
				comisionTotal = comisionTotal + comisionable.comision();
			}	
		}
		return comisionTotal;
	}

}
