/**
 * 
 */
package died.lab02.problema02;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Cote
 *
 */
public abstract class Pedido {
	
	protected ArrayList<Producto> productos;
	protected LocalDate fechaDeEntrega;
	
	public LocalDate getFechaDeEntrega() {
		return fechaDeEntrega;
	}
	public void setFechaDeEntrega(LocalDate fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}
	public Pedido() {
	}
	public abstract boolean agregarProducto(Producto producto);
	
	public abstract float precio();
	
	public abstract float comision();
	
}
