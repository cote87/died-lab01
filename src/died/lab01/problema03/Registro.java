package died.lab01.problema03;

import died.lab01.problema02.Temperatura;

public class Registro {
	private String ciudad;
	private Temperatura[] historico;
	private static final int CAP_MAX = 30;
	private short capacidadActual;
	
	public Registro() {
		super();
		this.ciudad = "-";
		this.historico = new Temperatura[CAP_MAX];
		this.capacidadActual=0;
	}

	public Registro(String ciudad) {
		super();
		this.ciudad = ciudad;
		this.historico = new Temperatura[CAP_MAX];
		this.capacidadActual=0;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN : "+this.ciudad);
		int i =1;
		for(Temperatura temperatura : this.historico) {
			if(temperatura == null) break;
			System.out.println(i+" "+ temperatura.toString());
			i++;
		}		
	}
	
	public boolean agregar(Temperatura t) {
		if(this.capacidadActual < CAP_MAX) {
			historico[capacidadActual]=t;
			this.capacidadActual++;
			return true;
		}
		return false;
	}
	
	public double mediaAsCelcius() {
		double temperaturaTotal=0d;
		for(Temperatura temperatura:this.historico) {
			temperaturaTotal = temperaturaTotal + temperatura.asCelcius();
		}
		return temperaturaTotal / (double) this.historico.length;
	}
	
	public double mediaAsFahrenheit() {
		double temperaturaTotal=0d;
		for(Temperatura temperatura:this.historico) {
			temperaturaTotal = temperaturaTotal + temperatura.asFahrenheit();
		}
		return temperaturaTotal / (double) this.historico.length;
	}
	
	public Temperatura maximo() {
		if(this.capacidadActual !=0){
			return this.maximo(this.historico[0],1);
		}
		else {
			return null;
		}
		
	}
	
	private Temperatura maximo(Temperatura t,int proximo) {
		
		if(proximo < CAP_MAX) {
			return maximo(this.mayor( t, this.historico[proximo] ), proximo+1 );
		}
		else {
			return t;
		}
	}
	
	private Temperatura mayor(Temperatura t , Temperatura t2) {
		if(t.asCelcius() < t2.asCelcius() ) {
			return t2;
		}
		else {
			return t;
		}
	}
}
