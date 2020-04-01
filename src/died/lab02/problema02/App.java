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
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		
		//Se generan 3 pedidos basicos y 3 pedidos premium
		for(int i=0;i<6;i++) {
			if(i<3) {
				pedidos.add(new PedidoBasico());
				if(i==1 && (pedidos.get(1) instanceof PedidoBasico)) 
					((PedidoBasico)(pedidos.get(1))).setExpress(true);;
			}
			else
				pedidos.add(new PedidoPremium());
		}
		
		
		//Genero 60 productos y los agrego a pedidos al azar
		System.out.println("PRODUCTOS GENERADOS");
		for(int i=0;i<60;i++) {
			Producto producto = new Producto("producto_"+i, (float) (Math.random()*100));
			if(Math.random() < 0.5) {
				if(Math.random() < 0.5)	pedidos.get(0).agregarProducto(producto);
				else{
					if(Math.random() < 0.5) pedidos.get(1).agregarProducto(producto);
					else
						pedidos.get(2).agregarProducto(producto);
				}
			}
			else{
				if(Math.random() < 0.5)	pedidos.get(3).agregarProducto(producto);
				else{
					if(Math.random() < 0.5) pedidos.get(4).agregarProducto(producto);
					else
						pedidos.get(5).agregarProducto(producto);
				}	
			}
			System.out.println(producto.toString());
		}
		
		//Se crea un cadete
		Cadete cadete = new Cadete();
		
		//Detalles de los pedidos
		System.out.println("\nDETALLES DE LOS PEDIDOS");
		for(Pedido pedido: pedidos) {
			if(pedido instanceof PedidoBasico) {
				System.out.println("\nTipo de pedido = Pedido Básico");
				System.out.println("Tipo express = " + ((PedidoBasico) pedido).isExpress());
			}
			if(pedido instanceof PedidoPremium) {
				System.out.println("\nTipo de pedido = Pedido Premium");
			}
			
			System.out.println("Precio total = "+pedido.precio());
			System.out.println("Comisión cadete = "+pedido.comision());
			
			for(Producto producto:pedido.productos) {
				System.out.println(producto.toString());
			}
			
			//Se agrega el pedido al cadete
			cadete.agregarPedido(pedido);
			
			//Se determina al azar si fue entregado el pedido
			if(Math.random()<0.5)
				pedido.setFechaDeEntrega(LocalDate.now());
			if(pedido.getFechaDeEntrega() != null)
				System.out.println("ENTREGADO!!!");
		}
		
		//Detalle del cobro del cadete
		System.out.println("\nComisión total del cadete = "+cadete.comisiones());
		
		
	}

}
