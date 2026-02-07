// Conversor decimal → binario sin usar métodos de Java.
public class Ejercicio26 {
    public static String convertirDecimalABinario(int numeroDecimal) {
        String resultadoBinario = "";

        if (numeroDecimal == 0) {
            resultadoBinario = "0";
        } else {
            int numero = numeroDecimal;

            while (numero > 0) {
                int resto = numero % 2;
                
                resultadoBinario = resto + resultadoBinario;

                numero = numero / 2;
            }
        }

        return resultadoBinario;
    }

    public static void main(String[] args) {
        int numeroEntrada = 45;

        String binario = convertirDecimalABinario(numeroEntrada);

        System.out.println("Resultado en binario: " + binario);
    }
}
