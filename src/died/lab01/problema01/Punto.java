/**
 * 
 */
package died.lab01.problema01;

/**
 * @author Cote
 *
 */
public class Punto {

	/**
	 * @param args
	 */
	private float x,y;

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public Punto(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Punto))
			return false;
		Punto other = (Punto) obj;
		if (Float.floatToIntBits(x) != Float.floatToIntBits(other.x))
			return false;
		if (Float.floatToIntBits(y) != Float.floatToIntBits(other.y))
			return false;
		return true;
	}



}
