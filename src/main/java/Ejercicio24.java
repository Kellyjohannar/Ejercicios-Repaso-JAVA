//Generador de contraseñas aleatorias con minúsculas, mayúsculas y números.
import java.util.Random;

public class Ejercicio24 {
    public static String generarPassword(int longitud) {
        String passwordResultado = "";

        if (longitud > 0) {
            String minusculas = "abcdefghijklmnopqrstuvwxyz";
            String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numeros = "0123456789";
            
            String caracteres = minusculas + mayusculas + numeros;
            
            char[] passwordArray = new char[longitud];
            Random random = new Random();

            for (int i = 0; i < longitud; i++) {
                int indiceAleatorio = random.nextInt(caracteres.length());
                
                passwordArray[i] = caracteres.charAt(indiceAleatorio);
            }

            passwordResultado = new String(passwordArray);
        }

        return passwordResultado;
    }

    public static void main(String[] args) {
        int longitudPassword = 10;
        String nuevaPassword = generarPassword(longitudPassword);
        
        System.out.println("Contraseña generada: " + nuevaPassword);
    }
}