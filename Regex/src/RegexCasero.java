

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
		
		
		for(int i=0;i<texto.length();i++) 
		{
			char c = texto.charAt(i);
			if(c!='a') {
				entrada = false;
				break;
			}
			else if(c=='a') 
			{
				entrada = true;

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
