/**
 * 
 */
package died.lab02.problema02;

import java.util.ArrayList;

/**
 * @author Cote
 *
 */
public class Cadete {
	
	private ArrayList<Pedido> pedidos;
	
	public Cadete() {
		pedidos = new ArrayList<Pedido>();
	}

	public void agregarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public float comisiones() {
		float comisionTotal=0f;
		for(Pedido pedido:pedidos) {
			if(pedido.getFechaDeEntrega() != null)
				comisionTotal = comisionTotal + pedido.comision();
		}
		return comisionTotal;
	}

}
