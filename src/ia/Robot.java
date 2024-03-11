package ia;

import animales.Animal;

public class Robot {

	private String nombre;
	private String marcaAceite;
	private int vatios;
	
	
	public Robot(String nombre, String marcaAceite, int vatios) {
		this.nombre = nombre;
		this.marcaAceite = marcaAceite;
		this.vatios = vatios;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarcaAceite() {
		return marcaAceite;
	}
	public void setMarcaAceite(String marcaAceite) {
		this.marcaAceite = marcaAceite;
	}
	public int getVatios() {
		return vatios;
	}
	public void setVatios(int vatios) {
		this.vatios = vatios;
	}


	@Override
	public String toString() {
		return "Robot [" + nombre + " - " + marcaAceite + " - " + vatios + "]";
	}
	
	
	
	
	
	
	
}
