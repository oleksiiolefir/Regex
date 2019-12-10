

import java.util.Scanner;

public class RegexCasero {

	public void validarPorExpresion() {
		String texto ="";
		String expres = "";
		boolean entrada = false;
		Scanner reader = new Scanner(System.in);
		//Mostrar las experesiones regulares que tenemos.
		//[a,z] solo la 'a' y la 'z'
		
		
		
		System.out.println("Introduzca texto ");
		texto = reader.next();
		System.out.println("Introduzca la expresion regular");
		expres = reader.next();
		
		String[] parts = expres.split(",");
	
			
		for(int i=0;i<texto.length();i++) 
		{
			for(int a=0;a<=parts.length;a++) {
				
			char c = texto.charAt(i);
			char r = parts[a].charAt(0);
			
			if(c!=r) {
				
				entrada = false;
				}
			else if(c==r){
				entrada = true;
				break;
				}
			}
		
		}
		if(entrada == true) {
			System.out.println("El texto es correcto");
		}
		else {
			System.out.println("El texto es incorrecto");
		}
		
	}
}
