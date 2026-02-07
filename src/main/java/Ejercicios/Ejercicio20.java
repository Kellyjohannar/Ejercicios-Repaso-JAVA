package Ejercicios;

//Frecuencia de elementos en un array.
public class Ejercicio20 {
    public static void main(String[] args) {
        int[] elementos = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        for (int i = 0; i < elementos.length; i++) {
            
            boolean visto = false;
            for (int j = 0; j < i && !visto; j++) {
                if (elementos[i] == elementos[j]) {
                    visto = true;
                }
            }

            if (!visto) {
                int contador = 0;
                for (int j = 0; j < elementos.length; j++) {
                    if (elementos[i] == elementos[j]) {
                        contador++;
                    }
                }
                
                System.out.println("Elemento: " + elementos[i] + " | Cantidad: " + contador);
            }
        }
    }
}
