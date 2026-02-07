//Función que invierta arrays y devuelva uno nuevo.
public class Ejercicio22 {

    public static int[] invertirArray(int[] arrayOriginal) {
        int[] arrayInvertido = null;

        if (arrayOriginal != null) {
            int longitud = arrayOriginal.length;
            arrayInvertido = new int[longitud];

            for (int i = longitud - 1; i >= 0; i--) {
                arrayInvertido[(longitud - 1) - i] = arrayOriginal[i];
            }
        }

        return arrayInvertido;
    }

    public static void main(String[] args) {
        int[] entrada = {1, 2, 3, 4, 5};
        int[] resultado = invertirArray(entrada);

        if (resultado != null) {
            for (int num : resultado) {
                System.out.print(num + " ");
            }
        }
    }
}
