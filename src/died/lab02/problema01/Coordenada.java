/**
 * 
 */
package died.lab02.problema01;

/**
 * @author Cote
 *
 */
public class Coordenada {
	
	private double latitud,longitud;
	
	public Coordenada() {

	}

	public Coordenada(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Coordenada [latitud=" + latitud + ", longitud=" + longitud + "]";
	}

	public boolean equals(Coordenada coordenada) {
		if ( (coordenada.getLatitud() == this.getLatitud()) && (coordenada.getLongitud() == this.getLongitud()) )
			return true;
	return false;
	}
	

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

}
