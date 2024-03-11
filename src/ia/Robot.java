package ia;

import animales.Animal;
import luchadores.Peleador;

public class Robot implements Peleador {

	
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


	@Override
	public int ataque() {
		return 100;
	}


	@Override
	public int defensa() {
		return 10000;
	}


	@Override
	public int puntosVida() {
		return 10000;
	}


	@Override
	public void danio(int pupa) {
	}
	
	
	
	
	
	
	
}
