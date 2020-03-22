package died.lab01.problema02;

public class Temperatura {
	private double grados;
	private Escala escala;
	
	public Temperatura() {
		super();
		escala = Escala.CELCIUS;
		grados = 0;
	}
	
	public Temperatura(double grados, Escala escala) {
		super();
		this.grados = grados;
		this.escala = escala;
	}

	public String toString() {
		String mensaje = grados+" ";
		if(escala == Escala.CELCIUS)
			return mensaje+"ºC";
		else
			return mensaje+"ºF";
	}
	
	public double asCelcius() {		
		if(this.escala == Escala.CELCIUS)
			return grados;
		else
			return (grados-32d)*(5d/9d);
	}
	
	public double asFahrenheit() {
		if(this.escala == Escala.FAHRENHEIT)
			return grados;
		else
			return grados*(9d/5d)+32d;
	}
	
	public double aumentar(Temperatura temperatura) {
		if(temperatura.grados > 0.0) {
			if(this.escala == temperatura.escala) {
				this.grados = this.grados + temperatura.grados;
			}
			else {
				if(this.escala == Escala.CELCIUS) {
					this.grados = this.grados + temperatura.asCelcius(); 
				}
				else {
					this.grados = this.grados + temperatura.asFahrenheit();
				}
			}
		}
		return this.grados;
	}
	
	public double disminuir(Temperatura temperatura) {
		if(temperatura.grados > 0.0) {
			if(this.escala == temperatura.escala) {
				this.grados = this.grados - temperatura.grados;
			}
			else {
				if(this.escala == Escala.CELCIUS) {
					this.grados = this.grados - temperatura.asCelcius(); 
				}
				else {
					this.grados = this.grados - temperatura.asFahrenheit();
				}
			}
		}
		return this.grados;
	}
	

}
