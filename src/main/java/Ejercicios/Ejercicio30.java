
package Ejercicios;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] listaNombres = new String[100];
        int contadorNombres = 0;
        int opcionSeleccionada = 0;

        while (opcionSeleccionada != 4) {

            System.out.println("Menu de gestion de nombres");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Mostrar nombres");
            System.out.println("3. Vaciar lista");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcionSeleccionada = scanner.nextInt();
            scanner.nextLine();

            switch (opcionSeleccionada) {
                case 1:
                    if (contadorNombres < listaNombres.length) {
                        System.out.print("Ingrese el nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        listaNombres[contadorNombres] = nuevoNombre;
                        contadorNombres = contadorNombres + 1;
                    } else {
                        System.out.println("La lista esta llena");
                    }
                    break;

                case 2:
                    if (contadorNombres == 0) {
                        System.out.println("La lista esta vacia");
                    } else {
                        int indiceScursal = 0;
                        while (indiceScursal < contadorNombres) {
                            System.out.println((indiceScursal + 1) + ". " + listaNombres[indiceScursal]);
                            indiceScursal = indiceScursal + 1;
                        }
                    }
                    break;

                case 3:
                    contadorNombres = 0;
                    System.out.println("Lista vaciada correctamente");
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
