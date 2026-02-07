// Contador de palabras en una frase.
public class Ejercicio18 {
    public static void main(String[] args) {
        String texto = "Esta frase sirve de prueba para contar las palabras";
        
        String[] palabras = texto.split("\\s+");
        
        System.out.println("La frase tiene " + palabras.length + " palabras.");
    }
}