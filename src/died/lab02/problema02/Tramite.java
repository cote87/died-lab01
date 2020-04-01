/**
 * 
 */
package died.lab02.problema02;

import java.time.LocalDate;

import died.lab02.problema03.Comisionable;

/**
 * @author Cote
 *
 */
public class Tramite implements Comisionable {

	private String descripcion, domicilio;
	private LocalDate horaProgramada,horaRealizado;
	private final float PRECIO = 50;
	private final float COMISION_CADETE = 20;
	
	public Tramite(String descripcion, String domicilio, LocalDate horaProgramada) {
		this.descripcion = descripcion;
		this.domicilio = domicilio;
		this.horaProgramada = horaProgramada;
		this.horaRealizado = null;
	}
	
	@Override
	public float comision() {
		return COMISION_CADETE;
	}

	public float precio() {
		return PRECIO;
	}
	
	public void setFechaDeEntrega() {
		horaRealizado = LocalDate.now();
	}

	@Override
	public LocalDate getFechaDeEntrega() {
		// TODO Auto-generated method stub
		return horaRealizado;
	}

}
