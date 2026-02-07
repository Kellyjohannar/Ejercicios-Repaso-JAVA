
import java.util.Scanner;

//Calculadora modular (sumar, restar, multiplicar, dividir).

public class Ejercicio25 {
    public static double calcular(double num1, double num2, String operacion) {
        double resultado = 0.0;
        
        boolean operacionValida = true;

        if (operacion.equals("+")) {
            return num1 + num2;
            
        } else if (operacion.equals("-")) {
            return num1 - num2;
            
        } else if (operacion.equals("*")) {
            return num1 * num2;
            
        } else if (operacion.equals("/")) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir por cero.");
                operacionValida = false;
            }
            
        } else {
            System.out.println("Error: No se puede realizar esta operación.");
            operacionValida = false;
        }

        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Que operación quieres realizar? (+, -, *, /");
        String operacion = scanner.next();

        System.out.println("Ingrese el primer número");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número");
        int num2 = scanner.nextInt();
        
        double respuesta = calcular(num1, num2, operacion);
        
        System.out.println("Resultado: " + respuesta);
    }
}
