package animales;

public class Murcielago extends Animal {

	private int embergadura;
	
	
	public Murcielago(String nombre,int peso,int embergadura) {
		
		super(nombre,peso);
		this.embergadura = embergadura;
	}

	
	public int getEmbergadura() {
		return embergadura;
	}
	public void setEmbergadura(int embergadura) {
		this.embergadura = embergadura;
	}
	public void setPeso(int peso) {
		if(peso<1) {
			super.setPeso(1);
		}
		else super.setPeso(peso);
	}
	
	

	
	@Override
	public String toString() {
		return "Murcielago [(" + embergadura + "m) - " + getNombre() 
				+ " - (" + getPeso() + "kg)]";
	}
	
	
	
	
}
