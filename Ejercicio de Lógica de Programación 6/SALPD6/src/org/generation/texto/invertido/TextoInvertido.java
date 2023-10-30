/**
 * 
 */
package org.generation.texto.invertido;
import java.util.Scanner;

/**
 * 
 */
public class TextoInvertido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Declaro nuevo scanner
		System.out.println("Ingresa una palabra por favor: ");
		String PalabraInvertida = "";
		String PalabraNormal = sc.nextLine();
		
		
		
		if (PalabraNormal.length() == 0) {
			System.out.println("No has ingresado una palabra");
		}else {
			System.out.println("La palabra ingresada es: " + PalabraNormal);
			for (int n = PalabraNormal.length() - 1; n >= 0; n--) {
				PalabraInvertida += PalabraNormal.charAt(n);
				}
			System.out.println("Tu palabra Invertida es: " + PalabraInvertida);
		}
	
		sc.close();
	}
}
