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


	@Override
	public int esperanzaDeVida() {
		
		return 20;
	}


	@Override
	public float horasSuenio(int mes) {
		switch(mes) {
		
			case 12, 1, 2: 	return 4.8f;
			case 3,4,5: 	return 9.16f;
			case 6,7,8: 	return 18.06f;
			default: 		return 5.97f;
		}
	}
	
	
	
	
}
