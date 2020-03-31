/**
 * 
 */
package died.lab02.problema01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cote
 *
 */
public class Camino {
	
	private ArrayList<Coordenada> coordenadas;

	public Camino() {
		this.coordenadas = new ArrayList<Coordenada>();
	}

	public void agregar(Coordenada x) {
		this.coordenadas.add(x);
	}
	
	public void agregar(double lat, double lng) {
		this.coordenadas.add(new Coordenada(lat,lng));
	}
	
	public void agregar(int mtsLt,int mtsLn) {
		int size = coordenadas.size();
		if(size > 0) {
			double lat,lng;
			double rTierra = 6378.137;
			double pi = Math.PI;
			double latitud = coordenadas.get(size-1).getLatitud();
			double m = (1d / ((2d * pi / 360d) * rTierra)) / 1000d;  //1 meter in degree
			lat =  latitud + (mtsLt * m);
			lng = (mtsLn * m) / Math.cos(latitud * (pi / 180));
			agregar(lat,lng);	
		}
	}
	
	public List<Coordenada> buscar(Coordenada no,Coordenada se){
		
		ArrayList<Coordenada> nuevasCoordenadas = new ArrayList<Coordenada>();
		for(Coordenada coordenada:coordenadas) {
			if(between(coordenada.getLatitud(),se.getLatitud(),no.getLatitud()) && between(coordenada.getLongitud(),no.getLongitud(),se.getLongitud()))
				nuevasCoordenadas.add(coordenada);
		}
		return nuevasCoordenadas;
	}
	
	private boolean between(double pos , double desde, double hasta) {
		if((pos >= desde)&&(pos <= hasta))
			return true;
		return false;
	}
}
