

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
		String[] parts = expres.split("");

		for (int x=0;x<expres.length();x++) {
			if (parts[x].equals("-")) {
			  
			  int primero= parts[x-1].codePointAt(0);
			  int ultimo= parts[x+1].codePointAt(0);
			  int diferencia = ultimo - primero;
				 parts =  new String[diferencia+1];
			  for (int i=0;i<diferencia+1;i++) {
				  
				  parts[i] =(char)(primero+i)+"";
				  System.out.println(parts[i]);
				  System.out.println(diferencia+1);
			  }

			}
			  
		}
		
	
			
		for(int i=0;i<texto.length();i++) 
		{
			for(int a=0;a<parts.length;a++) {
				
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
		if (entrada=false) {
			break;
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
