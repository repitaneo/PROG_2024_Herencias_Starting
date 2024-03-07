package animales;

public class Animal {

	private String nombre;
	private int peso;
	
	
	public Animal(String nombre,int peso) {
		
		setNombre(nombre);
		setPeso(peso);
	}
	
	
	
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		if(peso>0) { 
			this.peso = peso;
		}
		else this.peso = 1;
	}




	@Override
	public String toString() {
		
		return "Animal ["+nombre+"]";
	}
	
	
	
}
