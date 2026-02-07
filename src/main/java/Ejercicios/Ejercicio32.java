package Ejercicios;

// Clase Coche con velocidad actual y métodos acelerar() y frenar().
public class Ejercicio32 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Kia");
        Coche coche2 = new Coche("Chevrolet");

        System.out.println(coche1.getNombre() + " velocidad inicial: " + coche1.getVelocidad());
        System.out.println(coche2.getNombre() + " velocidad inicial: " + coche2.getVelocidad());

        coche1.acelerar(50);
        coche2.acelerar(70);

        System.out.println(coche1.getNombre() + " después de acelerar: " + coche1.getVelocidad());
        System.out.println(coche2.getNombre() + " después de acelerar: " + coche2.getVelocidad());

        coche1.frenar(20);
        coche2.frenar(80);

        System.out.println(coche1.getNombre() + " después de frenar: " + coche1.getVelocidad());
        System.out.println(coche2.getNombre() + " después de frenar: " + coche2.getVelocidad());
    }
}

class Coche {

    private String nombre;
    private int velocidad;

    public Coche(String nombre) {
        this.nombre = nombre;
        velocidad = 0;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int incremento) {
        velocidad = velocidad + incremento;
    }

    public void frenar(int decremento) {
        if (velocidad - decremento >= 0) {
            velocidad = velocidad - decremento;
        } else {
            velocidad = 0;
        }
    }

}