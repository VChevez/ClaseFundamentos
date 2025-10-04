// Archivo: Persona.java
public class Persona {
    String nombre;
    int edad;
    String comida;
    // Constructor
    public Persona(String nombre, int edad,String comida) {
        this.nombre = nombre;
        this.edad = edad;
        this.comida = comida;
    }

    // Método
    public void saludar() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años y me gusta los " + comida);
    }
    public void gritar(){


    }
}
