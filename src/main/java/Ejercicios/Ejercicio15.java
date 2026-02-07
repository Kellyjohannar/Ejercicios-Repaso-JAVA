package Ejercicios;

//Eliminar duplicados de un array (sin usar Set).
public class Ejercicio15 {
    
    public static void main (String[]args){
        
        // int[] numeros = {1, 2, 3, 3, 2, 1, 7, 8, 9, 9};
      
        
        
        int[] original = {1, 2, 2, 3, 4, 4, 5};
int[] sinDuplicados = new int[original.length];
int contador = 0;

for (int i = 0; i < original.length; i++) {
    boolean existe = false;

    for (int j = 0; j < contador; j++) {
        if (original[i] == sinDuplicados[j]) {
            existe = true;
        }
    }

    if (!existe) {
        sinDuplicados[contador] = original[i];
        contador++;
    }
}

// Mostrar resultado
for (int i = 0; i < contador; i++) {
    System.out.print(sinDuplicados[i] + " ");
}

        
        
    }
    
}