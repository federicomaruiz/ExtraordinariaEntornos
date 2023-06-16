/**
 * 
 */
package ejercicio2;

import java.util.Scanner;


/**
 * @author federicoruiz
 * 16 jun 2023 11:00:58
 */
public class Main {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			
			OrdinariaENDE_FMR object = new OrdinariaENDE_FMR();
			
			Scanner input = new Scanner(System.in);
	        System.out.print("Ingresa una palabra o frase: ");
	        String palabra = input.nextLine().toLowerCase().replaceAll("\\s+", "");
	        palabra = object.quitarAcentos(palabra);
	        boolean palindromo = object.esPalindromo(palabra);
	        

	        if (palindromo) {
	            System.out.println("'" + palabra + "' es un palíndromo.");
	        } else {
	            System.out.println("'" + palabra + "' no es un palíndromo.");
	        }
	    }

	}


