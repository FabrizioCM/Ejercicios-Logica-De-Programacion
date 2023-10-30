package oeg.generation.salpd9;
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	public static void main(String[]args) {
		
		HashMap<String, String> diccionarioNaturaleza =new HashMap<>(); // Creación de un HashMap que asigna nombres de artistas a títulos de canciones.

		 	diccionarioNaturaleza.put("árbol", "tree");
	        diccionarioNaturaleza.put("río", "river");
	        diccionarioNaturaleza.put("montaña", "mountain");
	        diccionarioNaturaleza.put("flor", "flower");
	        diccionarioNaturaleza.put("sol", "sun");
	        diccionarioNaturaleza.put("luna", "moon");
	        diccionarioNaturaleza.put("agua", "water");
	        diccionarioNaturaleza.put("playa", "beach");
	        diccionarioNaturaleza.put("animal", "animal");
	        diccionarioNaturaleza.put("cielo", "sky");
	        diccionarioNaturaleza.put("bosque", "forest");
	        diccionarioNaturaleza.put("estrella", "star");
	        diccionarioNaturaleza.put("pájaro", "bird");
	        diccionarioNaturaleza.put("piedra", "rock");
	        diccionarioNaturaleza.put("mariposa", "butterfly");
	        diccionarioNaturaleza.put("pradera", "meadow");
	        diccionarioNaturaleza.put("nube", "cloud");
	        diccionarioNaturaleza.put("nieve", "snow");
	        diccionarioNaturaleza.put("hoja", "leaf");
	        diccionarioNaturaleza.put("arena", "sand");

        //songs.forEach((song)-> System.out.println(song));
       // System.out.println(diccionarioNaturaleza.get("árbol")); // Imprime el título de la canción de "The Weeknd" utilizando su nombre como clave.
       // System.out.println(diccionarioNaturaleza); // Imprime todo el HashMap.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra para revisarla en el diccionario");
        String PalabraEspañol = sc.nextLine().toLowerCase();
        
        
        if(diccionarioNaturaleza.containsKey(PalabraEspañol)) {
        	String PalabraIngles = (diccionarioNaturaleza.get(PalabraEspañol));
        	System.out.println("La traduccion es la siguiente: " + PalabraIngles);	
        }else {
        	System.out.println("Lo sentimos esa palabra aun no se encuentra en el diccionario de la Naturaleza, pero estaremos tratando de mejorarlo");	
        }
        
        sc.close();
	}
}
