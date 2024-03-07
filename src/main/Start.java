package main;

import animales.*;


public class Start {

	public static void main(String[] args) {

		Elefante dumbo = new Elefante("Dumbo",80,6);
		Murcielago batman = new Murcielago("Batman",80,1);
		Humano marcos = new Humano("Marcos",71,true);

		Animal animales[] = new Animal[3];
		animales[0] = batman;
		animales[1] = dumbo;
		animales[2] = marcos;
		
		for(int i=0;i<3;i++) {
			
			System.out.println(animales[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
