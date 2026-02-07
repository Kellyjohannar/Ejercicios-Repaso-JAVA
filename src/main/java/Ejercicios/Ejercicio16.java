package Ejercicios;

//Suma de matrices 3×3.
public class Ejercicio16 {
    
    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] matrizSuma = new int[3][3];
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizSuma[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
