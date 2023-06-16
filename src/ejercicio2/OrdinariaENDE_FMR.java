/**
 * 
 */
package ejercicio2;


import java.text.Normalizer;
import java.util.Scanner;

public class OrdinariaENDE_FMR {

    public boolean esPalindromo(String palabra) {
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) == palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public String quitarAcentos(String palabra) {
        String palabraSinAcentos = Normalizer.normalize(palabra, Normalizer.Form.NFD);
        palabraSinAcentos = palabraSinAcentos.replaceAll("\\p{M}", "");
        return palabraSinAcentos;
    }

}