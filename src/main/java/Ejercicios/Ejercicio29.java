package Ejercicios;

// Comprobar fecha válida (día, mes, año).
import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día en número");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes en número");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el día en número");
        int ano = scanner.nextInt();

        boolean esValida = false;

        if (ano > 0 && (mes >= 1 && mes <= 12)) {

            int diasMaximos = 0;

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                diasMaximos = 31;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasMaximos = 30;
            } else {
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    diasMaximos = 29;
                } else {
                    diasMaximos = 28;
                }
            }

            if (dia >= 1 && dia <= diasMaximos) {
                esValida = true;
            }
        }

        if (esValida) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + ano + " es válida.");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + ano + " no es válida.");
        }
    }
}
