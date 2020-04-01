/**
 * 
 */
package died.lab02.problema02;

import java.util.ArrayList;

/**
 * @author Cote
 *
 */
public class PedidoBasico extends Pedido {
	private final float PORCENTAJE_ENVIO_EXPRESS= 1.2f;
	private final float PORCENTAJE_ENVIO=1.05f;
	private final float PORCENTAJE_CADETE=0.1f;
	private final int CAPACIDAD_MAXIMA = 5;
	public boolean isExpress() {
		return isExpress;
	}

	public void setExpress(boolean isExpress) {
		this.isExpress = isExpress;
	}

	private boolean isExpress;
	
	public PedidoBasico() {
		this.isExpress = false;
		this.productos =  new ArrayList<Producto>();
		this.fechaDeEntrega = null;
	}

	@Override
	public boolean agregarProducto(Producto producto) {
		if(this.productos.size() <= CAPACIDAD_MAXIMA) {
			this.productos.add(producto);
			return true;
		}
		return false;			
	}

	@Override
	public float precio() {
		float precio = 0f;
		
		for(Producto producto : this.productos) {
			precio = precio + producto.getPrecio();
		}
		
		if(isExpress)
			precio = precio * PORCENTAJE_ENVIO * PORCENTAJE_ENVIO_EXPRESS;
		else
			precio = precio * PORCENTAJE_ENVIO;
		
		return precio;
		
	}

	@Override
	public float comision() {
		return (precio()*PORCENTAJE_CADETE);
	}
}
