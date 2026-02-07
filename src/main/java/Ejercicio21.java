//Función esPrimo() y usarla para mostrar primos del 1 al 100.
public class Ejercicio21 {
    public static boolean esPrimo(int numero) {
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2 && esPrimo; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
        }

        return esPrimo;
    }

    public static void main(String[] args) {
        System.out.println("Números primos del 1 al 100:");

        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}