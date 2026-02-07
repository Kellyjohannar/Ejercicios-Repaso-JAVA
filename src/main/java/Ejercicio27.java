// Validar email con condiciones básicas (contiene @, punto, longitud mínima…).
public class Ejercicio27 {
    public static boolean validarEmail(String email) {
        boolean esValido = false;

        if (email != null && !email.isEmpty()) {
            
            int longitud = email.length();
            int posicionArroba = email.indexOf('@');
            int posicionPunto = email.lastIndexOf('.');

            boolean longitudCorrecta = longitud >= 5;

            boolean arrobaValida = posicionArroba > 0 && posicionArroba < (longitud - 1);

            boolean puntoValido = posicionPunto > (posicionArroba + 1) && posicionPunto < (longitud - 1);
            

            if (longitudCorrecta && arrobaValida && puntoValido) {
                esValido = true;
            }
        }

        return esValido;
    }

    public static void main(String[] args) {
        String[] emails = {
            "usuario@dominio.com",
            "nombre.apellido@mail.es",
            "sinarroba.com",
            "@sinusuario.com",
            "usuario@.com",
            "usuario@dominio"
        };

        for (String email : emails) {
            boolean resultado = validarEmail(email);
            String estado = resultado ? "Válido" : "Inválido";
            
            System.out.println(email + ": " + estado);
        }
    }
}
