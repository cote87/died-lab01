/**
 * 
 */
package died.lab01.problema01;

/**
 * @author Cote
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Punto p1 = new Punto(1f,1f);
		Punto p2 = new Punto(2f,2f);		
		Recta recta = new Recta(p1,p2);
		System.out.println(recta.pendiente());
		Punto p3 = new Punto(3f,3f);
		Recta recta2 = new Recta(p2,p3);
		if(recta.equals(recta2))
			System.out.println("R1 y R2 son iguales");
		else
			System.out.println("R1 y R2 son distintas");
	}

}
