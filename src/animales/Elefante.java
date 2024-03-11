package animales;

public class Elefante extends Animal {

	private int edad;

	
	public Elefante(String nombre, int edad, int peso) {
		
		super(nombre,peso);
		setEdad(edad);
	}

	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad>=0) {
			this.edad = edad;
		}
		else this.edad=0;
	}
	
	
	public void setPeso(int peso) {
		if(peso>=100) {
			super.setPeso(peso);
		}
		else super.setPeso(100);
	}
	
	


	@Override
	public String toString() {
		return "Elefante [" + getNombre() + " (" + edad + ") (" + getPeso() + "kg)]";
	}



	@Override
	public int esperanzaDeVida()  {
		return 100;
	}
	
	
	
	
	
}
