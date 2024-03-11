package animales;

public abstract class Animal {

	private String nombre;
	private int peso;
	
	
	public Animal(String nombre,int peso) {
		
		setNombre(nombre);
		setPeso(peso);
	}
	
	public abstract int esperanzaDeVida();
	public abstract float horasSuenio(int mes);

	
	
	
	
	
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
		this.peso = peso;
	}




	@Override
	public String toString() {
		
		return "Animal ["+nombre+"]";
	}
	
	
	
}
