/**
 * 
 */
package died.lab01.problema01;

/**
 * @author Cote
 *
 */
public class Recta {

	/**
	 * @param args
	 */
	private Punto p1,p2;

	public Recta(Punto p1, Punto p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	public Recta() {
		super();
		this.p1 = new Punto(0f,0f);
		this.p2 = new Punto(1f,1f);
	}

	public float pendiente() {
		return ( this.p1.getY() - this.p2.getY() ) / ( this.p1.getX()-this.p2.getX() );
	}
	
	public boolean paralelas(Recta recta) {
		return ( this.pendiente() == recta.pendiente());
	}
	
	public boolean equals(Object otraRecta) {
		//Verifica si es la misma instancia
		if (this == otraRecta)
			return true;
		//Verifica si es instancia de Recta
		if (!(otraRecta instanceof Recta))
			return false;
		//Verifica si representa la misma recta
		Recta segundaRecta = (Recta) otraRecta;
		
		//Obtengo una tercera recta formada por un punto de ambas
		//Verifico que los dos puntos usados para la tercer recta no sean iguales
		Recta terceraRecta;
		if(segundaRecta.p1 == this.p1)
			terceraRecta= new Recta(segundaRecta.p1,this.p2);
		else
			terceraRecta= new Recta(segundaRecta.p1,this.p1);
		//Si la pendiente de la tercera recta es igual a las otras dos pendientes quiere decir que es la misma recta
		if((terceraRecta.pendiente() == this.pendiente())&&(segundaRecta.pendiente()==this.pendiente()))	
			return true;
		else																								
			return false;
	}
}
