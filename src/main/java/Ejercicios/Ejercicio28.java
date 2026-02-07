package Ejercicios;


import java.util.Random;
import java.util.Scanner;

// Simulación de dados (función tirarDado() que devuelve 1–6).
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cuántas veces quieres tirar el dado?");
        int tiradas = scanner.nextInt();
        
        for (int i = 0; i < tiradas; i++) {
            System.out.println("Tirada " + (i + 1) + ": " + tirarDado());
        }
    }
    
    public static int tirarDado() {
        Random generador = new Random();
        return generador.nextInt(6) + 1;
    }
}
