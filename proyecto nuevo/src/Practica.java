import java.util.Scanner;

public class Practica {
    Scanner scanner= new Scanner(System.in);

    public void Practicando1() {
        String Nombre= "Vicente";
        System.out.println("Se llama " + Nombre);
        int Edad= 18;
        Edad++;
        System.out.println("Tiene " + Edad + " años de edad");
        String Ciudad= "Portoviejo";
        System.out.println("Vicente vive en la ciudad de " + Ciudad);
    }

    public void Practicando2(){
        int Valor= 0;
        System.out.println("primer valor " + Valor);
        Valor += 10;
        System.out.println("Segundo valor " + Valor);
        Valor += 20;
        System.out.println("Tercer valor " + Valor);

    }
    public void Practicando3(){
        String nombre= "Alberto";
        int Edad= 40;
        boolean Estudiante = false;
        double Altura =  1.78;
        char Inicial = 'A';
        System.out.println("Nombre: " + nombre + " ,Tipo: " + nombre.getClass().getSimpleName() );
        System.out.println("Edad: " + Edad + " ,Tipo: " + Integer.TYPE);
        System.out.println("Es estudiante?: " + Estudiante + " ,Tipo: " + Boolean.TYPE);
        System.out.println("Altura: " + Altura + " , Tipo: " + Double.TYPE);
        System.out.println("Inicial: " + Inicial + " , Tipo: " + Character.TYPE);
    }
    public void Practicando4(){
        String Libro = "EL Retrato de Dorian Gray";
        System.out.println("Titulo de la obra: " + Libro);
        String Autor = "Oscar Wilde";
        System.out.println("Autor de la obra: " + Autor);
        int AñodePublicacion = 1890;
        System.out.println("Año de publicación: " + AñodePublicacion);
        int numerodepaginas = 320;
        System.out.println("Número de páginas: " + numerodepaginas);
        boolean Disponible= true;
        System.out.println("Disponibilidad: " + Disponible);
    }
    public void Practicando5(){
        final String APP = "CAP";
        System.out.println("Nombre de la app: " + APP);
        double version = 1.0;
        System.out.println("Versión de la app: " + version);
        double pi = Math.PI;
        System.out.println( "El numero Pi es: " + String.format("%.2f", pi));
        String Nombre= "Alejandro";
        System.out.println("Nombre: " + Nombre);
        int Nivel = 1;
        System.out.println("Nivel: " + Nivel);
        Nivel = 2;
        System.out.println("Siguiente Nivel: "+   Nivel);
        Nombre="Maria";
        System.out.println("Nombre Actualizado: " + Nombre);
        int puntuación= 50;
        System.out.println("Puntuación: "+ puntuación);
        puntuación= 100;
        System.out.println("Puntuación Actualizada "+ puntuación);
        final int digito = 50;
        System.out.println(digito);
    }
    public void Casting (){
       int numerodecimal= 5;
       double numeroentero= (double) numerodecimal;
        System.out.println(numeroentero);
        double radio = 5.0;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
    public void Practicando6(){
    int uno = 10;
    int dos = 30;
    double resultado = uno + dos;
        System.out.println("Suma: " + resultado);
    resultado = dos - uno;
        System.out.println("Resta: " + resultado);
    resultado = uno * dos;
        System.out.println("Multiplicación: " + resultado);
    resultado = dos/uno;
        System.out.println("División: " + resultado);
    }
    public void Practicando7(){
        System.out.println("¿Cómo te llamas? ");
         String Nombre = scanner.nextLine();
        System.out.println("¿Cuantos años tienes? ");
            String Edad = scanner.nextLine();
        System.out.println("¿Dónde vives? ");
         String Ciudad = scanner.nextLine();

        System.out.println("!Hola¡ Me llamo " + Nombre + "\n"+ "Tengo " + Edad +" y vivo en " + Ciudad);

scanner.close();
    }
    public void Practicando8(){
        System.out.println("Base del rectángulo: ");
        int Base = scanner.nextInt();
        System.out.println("Altura del rectángulo: ");
        int Altura= scanner.nextInt();
        double area=    Base * Altura;
        System.out.println("El área del rectángulo es: " + area);
    }
    public void Practicando9(){
        String nombre = "Laptop Lenovo IdeaPad 3";
        double precio = 749.99;
        String codigo = "LP2025";
        boolean disponible = true;


        System.out.println("Información del Producto");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + String.format("%.2f", precio));
        System.out.println("Código: " + codigo);
        System.out.println("Disponible: " + disponible );
    }
    public void Practicando10(){
        System.out.println("Introduce la temperatura celcius: ");
       Double Celcius = scanner.nextDouble();
       Double Farenheit = Celcius *9/5 +32;
        System.out.println("Grados Celcius: " + Celcius + "°C" + "\n" + "Grados Farenheit: " + Farenheit + "°F");
    }
}
