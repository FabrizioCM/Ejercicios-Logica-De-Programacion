package oeg.generation.salpd10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {

        HashMap<String, String> diccionarioNaturaleza = new HashMap<>(); // Creación de un HashMap que asigna nombres de artistas a títulos de canciones.

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

      
        //Utilizo las llaves del diccionario y las almaceno en un nuevo array list
        List<String> palabrasEspañol = new ArrayList<>(diccionarioNaturaleza.keySet());

        //utilizo shuffle para mezclar y imprimo
        Collections.shuffle(palabrasEspañol);
        System.out.println(palabrasEspañol.toString());
        
        
        /*for (Map.Entry<Integer, String> entry : datos.entrySet()) {
        System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue()
    	} //Recorre todo el MAP ¿?
        for (Map.Entry<String, String> entry : diccionarioNaturaleza.entrySet()) {
        	System.out.println("Primer Palabra: " + entry.getKey());
        	System.out.println(" Segunda palabra: " + entry.getValue() );*/
        	
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        
        
        for (int i = 0; i < 5; i++) {
            String palabraEspañol = palabrasEspañol.get(i);
            String traduccionCorrecta = diccionarioNaturaleza.get(palabraEspañol);

            System.out.print("Traduce la palabra '" + palabraEspañol + "' al inglés: ");
            String respuestaUsuario = scanner.nextLine().toLowerCase();

            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Respuesta Correcta!");
                respuestasCorrectas++;
            } else {
                System.out.println("Respuesta Incorrecta. La traducción correcta es: " + traduccionCorrecta);
                respuestasIncorrectas++;
            }
        }

        System.out.println("La cantidad de respuestas correctas es: " + respuestasCorrectas);
        System.out.println("La cantidad de respuestas incorrectas es: " + respuestasIncorrectas);
        scanner.close();
    }
}