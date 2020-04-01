/**
 * 
 */
package died.lab02.problema02;

import java.util.ArrayList;

/**
 * @author Cote
 *
 */
public class PedidoPremium extends Pedido {
	
	private final float PORCENTAJE_ENVIO_5 = 1.20f;
	private final float PORCENTAJE_ENVIO_10 = 1.30f;
	private final float PORCENTAJE_CADETE = 0.15f;
	private final float CADETE_EXCESO=50;
	private final int CAPACIDAD_MEDIA = 5;
	private final int CAPACIDAD_MAXIMA = 10;
	
	public PedidoPremium() {
		this.productos= new ArrayList<Producto>();
		this.fechaDeEntrega = null;
	}

	@Override
	public boolean agregarProducto(Producto producto) {
		productos.add(producto);
		return true;		
	}

	@Override
	public float precio() {
		float precio = 0f;
		for(Producto producto : this.productos) {
			precio = precio + producto.getPrecio();
		}
		if(productos.size() <= CAPACIDAD_MEDIA)
			return precio*PORCENTAJE_ENVIO_5;
		else
			return precio*PORCENTAJE_ENVIO_10;
	}

	@Override
	public float comision() {
		if(productos.size() > CAPACIDAD_MAXIMA)
			return (precio()*PORCENTAJE_CADETE)+CADETE_EXCESO;
		else
			return precio()*PORCENTAJE_CADETE;
	}

}
