/**
 * 
 */
package died.lab02.problema01;

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
		
		Camino camino = new Camino();
		ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
		
		System.out.println("Comparar pares de coordenadas");
		
		double latitudTemp = generadorLatitud();
		double longitudTemp = generadorLongitud();
		
		Coordenada coordenada1 = new Coordenada(latitudTemp,longitudTemp);
		Coordenada coordenada2 = new Coordenada(latitudTemp,longitudTemp);
		Coordenada coordenada3 = new Coordenada(generadorLatitud(),generadorLongitud());
		System.out.println(coordenada1.toString()+" - "+coordenada1.toString()+" = "+coordenada1.equals(coordenada1));
		System.out.println(coordenada1.toString()+" - "+coordenada2.toString()+" = "+coordenada1.equals(coordenada2));
		System.out.println(coordenada1.toString()+" - "+coordenada3.toString()+" = "+coordenada1.equals(coordenada3));
		
		System.out.println("\nLista de coordenadas creadas al azar");
		camino.agregar(generadorLatitud(), generadorLongitud());
		for(int i=0;i<15;i++) {
			
			double latitud,longitud;
			
			latitud = generadorLatitud();
			longitud = generadorLongitud();
			
			Coordenada coordenada = new Coordenada(latitud,longitud);
			System.out.println(coordenada.toString());
			coordenadas.add(coordenada);
			camino.agregar(coordenada);
		}
		
		camino.agregar(500, 500);
		
		System.out.println("\nLista de coordenadas de primer camino con coordenada despues de moverse 500m de latitud y longitud");
		
		for(Coordenada coordenada : camino.getCoordenadas()) {
			System.out.println(coordenada.toString());
		}
		
		System.out.println("\nLista de coordenadas de primer camino entre (45,-90) y (90,-45)");
		Coordenada no = new Coordenada(45,-90);
		Coordenada se = new Coordenada(-45,90);
		for(Coordenada coordenada : camino.buscar(no,se)) {
			System.out.println(coordenada.toString());
		}
		
		System.out.println("\nLista de coordenadas de primer camino en (0,0) y 5.000 km de radio");
		Coordenada centro = new Coordenada (0,0);
		for(Coordenada coordenada : camino.buscar(centro, 5000000)) {
			System.out.println(coordenada.toString());
		}
		
	}
	
	public static double generadorLatitud() {
		if(Math.random()< 0.5d)
			return -Math.random()*90;
		else
			return Math.random()*90;
	}
	
	public static double generadorLongitud() {
		if(Math.random()< 0.5d)
			return -Math.random()*180;
		else
			return Math.random()*180;
	}

}
