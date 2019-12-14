import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		{
			RegexCasero reg = new RegexCasero();
		
				String texto ="";
				String expres = "";
				Scanner reader = new Scanner(System.in);
				//Mostrar las experesiones regulares que tenemos.
				//[a,z] solo la 'a' y la 'z'
				
				System.out.println("Expresiones regulares: \n  -Validar si esa letra se encuentra en el texto = , + letra + , + letra (hasta escribir todas las letras del texto))"
						+ "\n  -Validar que la letra existe en el texto = ; + letra"
						+ " \n  -Validar el minimo del texto = min + numero  "
						+ " \n  -Validar si las letras estan entre las letras que estan entre - = letra - letra  ");
				
				System.out.println("Introduzca texto ");
				texto = reader.nextLine().replaceAll(" ","");
				System.out.println("Introduzca la expresion regular");
				expres = reader.nextLine();
				reg.validarPorExpresion(texto, expres);
				reg.validarMinimo(texto, expres);
				reg.validarPorComa(texto, expres);
				reg.validarPorExpresionUnaLetra(texto, expres);
			
		}

	}

}