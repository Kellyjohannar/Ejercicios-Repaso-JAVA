package Ejercicios;

//Comprobar palíndromo para cadenas.
public class Ejercicio19 {
    public static void main(String[] args) {
        String palabra = "hola";
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }
        
        if (palabra.equals(invertida)) {
            System.out.println("La palabra " + palabra + " es palìndromo");
        } else {
            System.out.println("La palabra " + palabra + " no es palìndromo");
        }
    }
}