
import java.util.Scanner;

public class RegexCasero {

	public void validarPorExpresion(String texto, String expres) {
		try {
		boolean entrada = false;
		Scanner reader = new Scanner(System.in);
		//Mostrar las experesiones regulares que tenemos.
		//[a,z] solo la 'a' y la 'z'
		
		
		
		
		String[] parts1 = expres.split("");
		String[] parts  = expres.split("");
		for (int x=0;x<expres.length();x++) {
			if (parts1[x].equals("-")) {
			  
				
			  int primero= parts[x-1].codePointAt(0);
			  int ultimo= parts[x+1].codePointAt(0);
			  int diferencia = ultimo - primero;
			  parts =  new String[diferencia+1];
				 if ((primero >= 65  && primero <= 90) || (primero >= 97  && primero <= 122) ) {
					
					 if ((ultimo >= 65  && ultimo <= 90) || (ultimo >= 97  && ultimo <= 122)) {
						
						 for (int i=0;i<diferencia+1;i++) {
							  
							  parts[i] =(char)(primero+i)+"";
							  
						  }
						 
					 }
				 }
				 
				 for(int i=0;i<texto.length();i++) {
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
					if (entrada==false) {
						break;
					}
					}
				 if(entrada == true) {
						System.out.println("El texto es correcto4");
					}
					else {
						
						System.out.println("El texto es incorrecto");
					}

			}
			  
		}
		
	
			
		
		}
		catch(Exception e) {
		}
		
	}
	public void validarPorComa(String texto, String expres) {
		try {
			boolean entrada = false;		
			String[] parts = expres.split(",");
		
				
			for(int i=0;i<texto.length();i++) 
			{
				for(int a=1;a<=parts.length;a++) {
					
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
				System.out.println("El texto es correcto3");
			}
			else {
				System.out.println("El texto es incorrecto");
			}
		}catch(Exception e) {
		}
		
	}
	
	public void validarPorExpresionUnaLetra(String texto, String expres) {
		try {
			boolean entrada = false;		
			String[] parts = expres.split(";");
		
				
			for(int a=1;a<=parts.length;a++) 
			{ 
				for(int i=0;i<texto.length();i++) {
					
				char c = texto.charAt(i);
				char r = parts[a].charAt(0);			
				if(c!=r) {
					
					entrada = false;
					}
				else if(c==r){
					entrada = true;
					a=parts.length;
					break;
					}
				}
			
			}
			if(entrada == true) {
				System.out.println("El texto es correcto2");
			}
			else {
				System.out.println("El texto es incorrecto");
			}
		}catch(Exception e) {
		}
		
	}
	
	public void validarMinimo(String texto, String expres) { 
		try {
            boolean entrada = false;
            String[] parts = expres.split("min");
            
            if(texto.length()<=Integer.parseInt(parts[1])) {
                entrada = true;
            }
            else {
                entrada = false;
            }

            if(entrada == true) {
                System.out.println("El texto es correcto1");
            }
            else {
                System.out.println("El texto es incorrecto");
            }
        }catch(Exception e) {
        }

	}
	
}
