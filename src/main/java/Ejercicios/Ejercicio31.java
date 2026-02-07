package Ejercicios;

// Clase Persona con nombre, edad y método esMayorDeEdad().
public class Ejercicio31 {
    public static void main(String[] args) {
        Persona persona = new Persona("Kelly Johanna", 26);
    }
}

class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esMayorDeEdad() {
        boolean validacion = false;

        if (edad >= 18) {
            validacion = true;
        }

        return validacion;
    }
}
