package died.lab01.problema03;

import java.util.Random;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

public class App {

	public static void main(String[] args) {
		
		Registro registro1 = new Registro("Santa Fe");
		Registro registro2 = new Registro("Santo Tome");
		
		Random random = new Random();
		Temperatura t;

		while(registro1.agregar(new Temperatura( (random.nextDouble() * 50d) , Escala.CELCIUS )));
		
		while(registro2.agregar(new Temperatura( ((random.nextDouble() * 85d) + 20d) , Escala.FAHRENHEIT ) ) );
		
		registro1.imprimir();
		System.out.println("Promedio en "+registro1.getCiudad()+" :"+registro1.mediaAsCelcius() +" C°"); 
		System.out.println("Maximo en "+registro1.getCiudad()+":"+registro1.maximo().asCelcius() +" C°"); 
		
		registro2.imprimir(); 
		System.out.println("Promedio en "+registro2.getCiudad()+" :"+registro2.mediaAsFahrenheit() +" F°"); 
		System.out.println("Maximo en "+registro2.getCiudad()+" :"+registro2.maximo().asFahrenheit() +"F°");
	}

}
