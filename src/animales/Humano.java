package animales;

public class Humano extends Animal {
	
	private boolean gafas;
	
	public Humano(String nombre, int peso, boolean gafas) {
		super(nombre, peso);
		this.gafas = gafas;
	}


	public boolean isGafas() {
		return gafas;
	}
	public void setGafas(boolean gafas) {
		this.gafas = gafas;
	}
	
	public void setPeso(int peso) {
		if(peso<5) {
			super.setPeso(5);
		}
		else super.setPeso(peso);
	}


	@Override
	public String toString() {
		return "Humano [" + gafas + " - " + getNombre() 
			+ " (" + getPeso() + "kg)]";
	}
	
	
	
	
	
}
