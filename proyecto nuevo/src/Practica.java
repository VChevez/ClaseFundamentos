import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
public class Practica {
    Scanner scanner = new Scanner(System.in);

    public void Practicando1() {
        String Nombre = "Vicente";
        System.out.println("Se llama " + Nombre);
        int Edad = 18;
        Edad++;
        System.out.println("Tiene " + Edad + " años de edad");
        String Ciudad = "Portoviejo";
        System.out.println("Vicente vive en la ciudad de " + Ciudad);
    }

    public void Practicando2() {
        int Valor = 0;
        System.out.println("primer valor " + Valor);
        Valor += 10;
        System.out.println("Segundo valor " + Valor);
        Valor += 20;
        System.out.println("Tercer valor " + Valor);

    }

    public void Practicando3() {
        String nombre = "Alberto";
        int Edad = 40;
        boolean Estudiante = false;
        double Altura = 1.78;
        char Inicial = 'A';
        System.out.println("Nombre: " + nombre + " ,Tipo: " + nombre.getClass().getSimpleName());
        System.out.println("Edad: " + Edad + " ,Tipo: " + Integer.TYPE);
        System.out.println("Es estudiante?: " + Estudiante + " ,Tipo: " + Boolean.TYPE);
        System.out.println("Altura: " + Altura + " , Tipo: " + Double.TYPE);
        System.out.println("Inicial: " + Inicial + " , Tipo: " + Character.TYPE);
    }

    public void Practicando4() {
        String Libro = "EL Retrato de Dorian Gray";
        System.out.println("Titulo de la obra: " + Libro);
        String Autor = "Oscar Wilde";
        System.out.println("Autor de la obra: " + Autor);
        int AñodePublicacion = 1890;
        System.out.println("Año de publicación: " + AñodePublicacion);
        int numerodepaginas = 320;
        System.out.println("Número de páginas: " + numerodepaginas);
        boolean Disponible = true;
        System.out.println("Disponibilidad: " + Disponible);
    }

    public void Practicando5() {
        final String APP = "CAP";
        System.out.println("Nombre de la app: " + APP);
        double version = 1.0;
        System.out.println("Versión de la app: " + version);
        double pi = Math.PI;
        System.out.println("El numero Pi es: " + String.format("%.2f", pi));
        String Nombre = "Alejandro";
        System.out.println("Nombre: " + Nombre);
        int Nivel = 1;
        System.out.println("Nivel: " + Nivel);
        Nivel = 2;
        System.out.println("Siguiente Nivel: " + Nivel);
        Nombre = "Maria";
        System.out.println("Nombre Actualizado: " + Nombre);
        int puntuación = 50;
        System.out.println("Puntuación: " + puntuación);
        puntuación = 100;
        System.out.println("Puntuación Actualizada " + puntuación);
        final int digito = 50;
        System.out.println(digito);
    }

    public void Casting() {
        int numerodecimal = 5;
        double numeroentero = (double) numerodecimal;
        System.out.println(numeroentero);
        double radio = 5.0;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }

    public void Practicando6() {
        int uno = 10;
        int dos = 30;
        double resultado = uno + dos;
        System.out.println("Suma: " + resultado);
        resultado = dos - uno;
        System.out.println("Resta: " + resultado);
        resultado = uno * dos;
        System.out.println("Multiplicación: " + resultado);
        resultado = dos / uno;
        System.out.println("División: " + resultado);
    }

    public void Practicando7() {
        System.out.println("¿Cómo te llamas? ");
        String Nombre = scanner.nextLine();
        System.out.println("¿Cuantos años tienes? ");
        String Edad = scanner.nextLine();
        System.out.println("¿Dónde vives? ");
        String Ciudad = scanner.nextLine();

        System.out.println("!Hola¡ Me llamo " + Nombre + "\n" + "Tengo " + Edad + " y vivo en " + Ciudad);

        scanner = null;
    }

    public void Practicando8() {
        System.out.println("Base del rectángulo: ");
        int Base = scanner.nextInt();
        System.out.println("Altura del rectángulo: ");
        int Altura = scanner.nextInt();
        double area = Base * Altura;
        System.out.println("El área del rectángulo es: " + area);
        scanner = null;
    }

    public void Practicando9() {
        String nombre = "Laptop Lenovo IdeaPad 3";
        double precio = 749.99;
        String codigo = "LP2025";
        boolean disponible = true;


        System.out.println("Información del Producto");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + String.format("%.2f", precio));
        System.out.println("Código: " + codigo);
        System.out.println("Disponible: " + disponible);
    }

    public void Practicando10() {
        System.out.println("Introduce la temperatura celcius: ");
        Double Celcius = scanner.nextDouble();
        Double Farenheit = Celcius * 9 / 5 + 32;
        System.out.println("Grados Celcius: " + Celcius + "°C" + "\n" + "Grados Farenheit: " + Farenheit + "°F");
        scanner = null;
    }

    public void Practicando11() {
        System.out.println("Introduzca el primero dígito: ");
        double A = scanner.nextDouble();
        System.out.println("Introduzca el segundo dígito: ");
        double B = scanner.nextDouble();
        double resultado = A + B;
        System.out.println("Suma: " + resultado);
        resultado = A - B;
        System.out.println("Resta: " + resultado);
        resultado = A * B;
        System.out.println("Multiplicación: " + resultado);
        resultado = A / B;
        System.out.println("División: " + resultado);
        resultado = A % B;
        System.out.println("(Módulo) o Resto: " + resultado);
        scanner = null;
    }

    public void Practicando12() {
        System.out.println("Introduzca el primer dígito: ");
        double A = scanner.nextDouble();
        System.out.println("Introduzca el segundo dígito: ");
        double B = scanner.nextDouble();
        boolean resultado = A == B;
        System.out.println("El resultado de == es: " + resultado);
        resultado = A < B;
        System.out.println("El resultado de < es: " + resultado);
        resultado = A > B;
        System.out.println("El resultado de > es: " + resultado);
        resultado = A != B;
        System.out.println("El resultado de != es: " + resultado);
        resultado = A <= B;
        System.out.println("El resultado de <= es: " + resultado);
        resultado = A >= B;
        System.out.println("El resultado de >= es: " + resultado);
        scanner = null;
    }

    public void Practicando13() {
        double Number = 100;
        System.out.println("Valor inicial: " + Number);
        Number += 50;
        System.out.println("Después de sumar 50 (+=): " + Number);
        Number -= 20;
        System.out.println("Después de restar 20 (-=): " + Number);
        Number *= 2;
        System.out.println("Después de multiplicar 2 (*=): " + Number);
        Number /= 3;
        System.out.println("Después de dividir 3 (/=): " + Number);
    }

    // Número Par
    public void Practicando14() {
        Double Number = scanner.nextDouble();
        if (Number % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        scanner = null;

    }

    public void Practicando15() {
        System.out.println("Introduzca su edad: ");
        int Edad = scanner.nextInt();
        if (Edad >= 21) {
            System.out.println("¿Tiene Carnet de conducir?");
            boolean Carnet = scanner.nextBoolean();
            if (Edad >= 21 && Carnet == true)
                System.out.println("Puede alquilar un coche");
        } else {
            System.out.println("No puede alquilar un coche");
        }
        scanner = null;

    }

    public void Practicando16() {
        System.out.println("Ingrese precio del producto: ");
        double Precio = scanner.nextDouble();
        System.out.println("Ingrese el Descuento: ");
        double Descuento = scanner.nextDouble();
        System.out.println("Precio original: " + Precio + "\n" + "Porcentaje del Descuento: " + Descuento);
        double Resultado = (Descuento * Precio) / 100;
        System.out.println("Descuento: " + Resultado);
        Resultado = Precio - Resultado;
        System.out.println("Precio Final: " + Resultado);
    }

    public void Practicando17() {
        System.out.println("Ingrese su edad: ");
        int Age = scanner.nextInt();
        boolean UnderAge = (Age < 26);
        System.out.println("Eres menor de 26 años: " + UnderAge);
        System.out.println("¿Eres estudiante? (True/False): ");
        boolean Student = scanner.nextBoolean();
        boolean invert = !Student;
        System.out.println("NO eres estudiante: " + !Student);
        boolean Discount = (Age < 26 && Student == true);
        System.out.println("Tiene descuento de estudiante: " + Student + "\n" + "Tiene descuento de Joven: " + UnderAge);
        System.out.println("¿Tiene descuento especial de estudiante y Joven? " + Discount);
    }

    public void Practicando18() {
        System.out.println("Introduzca el primer número: ");
        double Primero = scanner.nextDouble();
        System.out.println("Introduzca el segundo número: ");
        double Segundo = scanner.nextDouble();
        System.out.println("Introduzca el tercer número: ");
        double Tercero = scanner.nextDouble();
        double resultado = Primero + Segundo + Tercero;
        System.out.println("Suma de los tres números: " + resultado);
        resultado = resultado / 3;
        System.out.println("Promedio: " + resultado);
        resultado = (Primero * Segundo) / Tercero;
        System.out.println("Resultado de (Primero * Segundo) / Tercero = " + resultado);
    }

    public void Practicando19() {
        System.out.println("Nota del primer exámen: ");
        int Primero = scanner.nextInt();
        System.out.println("Nota del segundo exámen: ");
        int Segundo = scanner.nextInt();
        System.out.println("Nota del tercer exámen: ");
        int Tercer = scanner.nextInt();
        double resultado = (Primero + Segundo + Tercer) / 3;
        System.out.println("Promedio: " + resultado);
        boolean nota = (resultado >= 5);
        System.out.println("Has aprobado:" + nota);
        boolean nota2 = (resultado >= 7);
        System.out.println("Tienes un notable:" + nota2);
        boolean nota3 = (resultado >= 9);
        System.out.println("Tienes un sobresaliente:" + nota3);
        scanner = null;
    }

    public void Practicando20() {
        scanner = new Scanner(System.in);
        System.out.println("Indica cuanto cobras por hora");
        int salarioHoras = scanner.nextInt();
        System.out.println("Indica cuantas horas has trabajado");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Has trabajado horas extra: ");
        boolean horasExtra = scanner.nextBoolean();
        int numeroHorasExtra;
        int salarioTotal;
        if (horasExtra && horasTrabajadas > 40) {
            numeroHorasExtra = (horasTrabajadas - 40);
            System.out.println("Horas extra Igual a: " + numeroHorasExtra);
            salarioTotal = (40 * salarioHoras + (numeroHorasExtra * (salarioHoras * 2)));
            System.out.println("Tu salario este mes es de: " + salarioTotal);
            int salarioDeHorasExtra = salarioTotal - (40 * salarioHoras);
            System.out.println("El salario de horas extra es: " + salarioDeHorasExtra);
            int salarioHorasNormales = salarioTotal - salarioDeHorasExtra;
            System.out.println("Salario por horas normales es: " + salarioHorasNormales);
        } else {
            System.out.println("No sé realizaron horas extra ");
            salarioTotal = salarioHoras * horasTrabajadas;
            System.out.println("Tu salario este mes es de: " + salarioTotal);
        }
        scanner.close();
    }

    public void Practicando21() {
        System.out.println("Ingrése su edad:");
        int Edad = scanner.nextInt();
        if (Edad >= 18) {
            System.out.println("Eres mayor de edad, puedes votar");
        } else {
            System.out.println("No puedes votar");

        }
        scanner.close();
    }

    public void Practicando22() {
        System.out.println("Ingrese un número entero:");
        int Number = scanner.nextInt();
        if (Number == 0) {
            System.out.println("Es cero");
        } else if (Number > 0) {
            System.out.println("Es Positivo");
        } else
            System.out.println("Es negativo");
        scanner.close();

    }

    public void Practicando23() {
        System.out.println("Introduzca su nota (entre 0 y 10): ");
        int Nota = scanner.nextInt();
        if (Nota > 10) {
            System.out.println("Felicidades has aprobado");
        } else
            System.out.println("Has reprobado");
        scanner.close();
    }

    public void Practicando24() {
        System.out.println("Importe de compra: ");
        double Importe = scanner.nextDouble();
        if (Importe >= 100) {
            double Descuento = (Importe * 10) / 100;
            double Importefinal = Importe - Descuento;
            System.out.println("El importe total con descuento es: " + Importefinal);
        } else {
            System.out.println(" Importe final (no aplica descuento)");
        }
        scanner.close();

    }

    public void Practicando25() {
        System.out.println("Introduzca un número entero");
        int Numero = scanner.nextInt();
        if (Numero % 2 == 0) {
            System.out.println("El " + Numero + " un número Par");
        } else
            System.out.println("El " + Numero + " un número impar");
        scanner.close();
    }

    public void Practicando26() {
        System.out.println("Introduce tu edad");
        int Age = scanner.nextInt();
        if (Age >= 16) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso Denegado, debes tener al menos 16 años para poder acceder a este contenido");
        }
        scanner.close();

    }

    public void Practicando27() {
        System.out.println("Introduzca su calificación (debe ser entre 0 y 10)");
        int Grade = scanner.nextInt();
        if (Grade <= 4) {
            System.out.println("Has suspendido ");
        } else if (Grade == 5 || Grade == 6) {
            System.out.println("Has Aprobado ");
        } else if (Grade == 7 || Grade == 8) {
            System.out.println("Has obtenido un Notable");
        } else if (Grade >= 9) {
            System.out.println("Has obtenido un Sobresaliente");

        }
        scanner.close();

    }

    public void Practicando28() {
        System.out.println("Introduzca el primer número");
        int Number1 = scanner.nextInt();
        System.out.println("Intruzca el segundo número");
        int Number2 = scanner.nextInt();
        if (Number1 > Number2) {
            System.out.println("El número " + Number1 + " Es mayor que " + Number2);
        } else {
            System.out.println("El número " + Number2 + " Es mayor que " + Number1);
        }
        scanner.close();
    }

    public void Practicando29() {
        System.out.println("Introduzca su peso en kg");
        double Weight = scanner.nextDouble();
        System.out.println("Introduzca su altura en Metros");
        double Height = scanner.nextDouble();
        double Imc = Weight / (Math.pow(Height, 2));
        if (Imc < 18.5) {
            System.out.println("Usted tiene un IMC por debajo de lo normal de: " + String.format("%.2f", Imc));

        } else if (Imc >= 18.5 && Imc <= 24.9) {
            System.out.println("Usted tiene un IMC normal de: " + String.format("%.2f", Imc));
        } else {
            System.out.println("Usted tiene un IMC por encima de lo normal de: " + String.format("%.2f", Imc));
        }
        scanner.close();
    }

    public void Practicando30() {
        System.out.println("Introduzca su altura en cm: ");
        int Height = scanner.nextInt();
        if (Height < 120) {
            System.out.println("No puede subirse a la atracción debido a que no alcanza la altura requerida");
        } else if (Height > 200) {
            System.out.println("No puede subirse a la atracción debido a que sobrepasa la altura permitida");
        } else System.out.println("Puede subirse a la atracción");
        scanner.close();
    }

    public void Practicando31() {
        System.out.println("Es socio? ");
        boolean Partner = scanner.nextBoolean();
        System.out.println("Indique el valor de su compra: ");
        int Purchase = scanner.nextInt();
        if (Partner == true && Purchase < 200) {
            double Discount = (Purchase * 10) / 100;
            System.out.println("Importe original de " + Purchase);
            System.out.println("Su descuento es de " + Discount);
            double Amount = Purchase - Discount;
            System.out.println("importe final es de " + Amount);
        } else if (Partner == true && Purchase >= 200) {
            double Discount = (Purchase * 20) / 100;
            System.out.println("Importe original de " + Purchase);
            System.out.println("Su descuento es de " + Discount);
            double Amount = Purchase - Discount;
            System.out.println("importe final es de " + Amount);
        } else if (Partner == false && Purchase > 300) {
            double Discount = (Purchase * 5) / 100;
            System.out.println("Importe original de " + Purchase);
            System.out.println("Su descuento es de " + Discount);
            double Amount = Purchase - Discount;
            System.out.println("importe final es de " + Amount);
        } else {
            System.out.println("Importe original de " + Purchase);
            System.out.println("No aplica descuento ");
            System.out.println("importe final es de " + Purchase);
        }
        scanner.close();
    }

    public void Practicando32() {
        System.out.println("Introduzca una contraseña");
        String Password = scanner.nextLine();
        int Letters = Password.length();
        boolean Numbers = Password.matches(".*\\d.*");
        boolean Forbidden = (Password.equals("Password") ||
                Password.equals("12345678") ||
                Password.equals("password"));
        boolean True = (Letters >= 8);
        if (True == true && Numbers == true && Forbidden == false) {
            System.out.println("Contiene al menos 8 caracteres = " + True);
            System.out.println("Contiene al menos un número = " + Numbers);
            System.out.println("Es una contraseña prohibida = " + Forbidden);
            System.out.println("Contraseña válida = True");
        } else if (True == true && Numbers == true && Forbidden == true) {
            System.out.println("Contiene al menos 8 caracteres = " + True);
            System.out.println("Contiene al menos un número = " + Numbers);
            System.out.println("Es una contraseña prohibida = " + Forbidden);
            System.out.println("¿Es válida? (cumple todos los requisitos): false\n" +
                    "Contraseña NO válida. Debe poner una contraseña no prohibida .");
        } else if (True == true && Numbers == false && Forbidden == true) {
            System.out.println("Contiene al menos 8 caracteres = " + True);
            System.out.println("Contiene al menos un número = " + Numbers);
            System.out.println("Es una contraseña prohibida = " + Forbidden);
            System.out.println("¿Es válida? (cumple todos los requisitos): false\n" +
                    "Contraseña NO válida. Debe poner una contraseña no prohibida y contener al menos un número.");
        } else if (True == false && Numbers == true && Forbidden == false) {
            System.out.println("Contiene al menos 8 caracteres = " + True);
            System.out.println("Contiene al menos un número = " + Numbers);
            System.out.println("Es una contraseña prohibida = " + Forbidden);
            System.out.println("¿Es válida? (cumple todos los requisitos): false\n" +
                    "Contraseña NO válida. Debe poner una contraseña de al menos 8 caracteres. ");
        } else if (True == false && Numbers == false && Forbidden == false) {
            System.out.println("Contiene al menos 8 caracteres = " + True);
            System.out.println("Contiene al menos un número = " + Numbers);
            System.out.println("Es una contraseña prohibida = " + Forbidden);
            System.out.println("¿Es válida? (cumple todos los requisitos): false\n" +
                    "Contraseña NO válida. Debe poner una contraseña de al menos 8 caracteres y que contenga números.");
        } else if (True == true && Numbers == false && Forbidden == false) {
            System.out.println("Contiene al menos 8 caracteres = " + True);
            System.out.println("Contiene al menos un número = " + Numbers);
            System.out.println("Es una contraseña prohibida = " + Forbidden);
            System.out.println("¿Es válida? (cumple todos los requisitos): false\n" +
                    "Contraseña NO válida. Debe poner una contraseña que contenga números.");
        }

        scanner.close();
    }

    public void Practicando33() {
        System.out.println("Introduzca su edad: ");
        int Age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduzca el día de la semana ");
        String Day = scanner.nextLine();
        boolean Minor = Age < 12;
        boolean Teen = Age >= 12 && Age <= 17;
        boolean Adult = Age >= 18 && Age <= 64;
        boolean ThirdAge = Age >= 65;
        if (Minor) {
            System.out.println("Dia de la semana " + Day);
            System.out.println("¿Eres menor de 12? " + Minor);
            System.out.println("¿Tienes entre 12 y 17? " + Teen);
            System.out.println("Obtienes entrada gratis");
        } else if (Age >= 12 && Age <= 17 && Day.equals("Martes")) {
            System.out.println("Dia de la semana " + Day);
            System.out.println("¿Eres menor de 12? " + Minor);
            System.out.println("¿Tienes entre 12 y 17? " + Teen);
            System.out.println("Precio de entrada: 0.0€ (Entrada gratuita para menores en martes)");

        } else if (Age >= 12 && Age <= 17 && !Day.equals("Martes")) {
            System.out.println("Dia de la semana " + Day);
            System.out.println("¿Eres menor de 12? " + Minor);
            System.out.println("¿Tienes entre 12 y 17? " + Teen);
            System.out.println("Precio de entrada: 5.0€");

        } else if (Age >= 18 && Age <= 64 && Day.equals("Jueves")) {
            System.out.println("Tienes entre 18 y 64 " + Adult);
            System.out.println("Dia de la semana " + Day);
            System.out.println("Precio de entrada: 7.0€");
        } else if (Age >= 18 && Age <= 64 && !Day.equals("Jueves")) {
            System.out.println("Tienes entre 18 y 64 " + Adult);
            System.out.println("Dia de la semana " + Day);
            System.out.println("Precio de entrada: 10.0€");
        } else if (Age >= 65) {
            System.out.println("Tienes 65 o más años " + ThirdAge);
            System.out.println("Dia de la semana " + Day);
            System.out.println("Precio de entrada: 6.0€");
        }
        scanner.close();
    }

    public void Practicando34() {
        System.out.println("Ingresa tu edad: ");
        int Age = scanner.nextInt();
        System.out.println("Ingrese sus ingresos mensuales ");
        int Invoice = scanner.nextInt();
        System.out.println("¿Tiene deudas pendientes? ");
        boolean Debt = scanner.nextBoolean();
        boolean rangeOfAge = Age >= 21 && Age <= 65;
        boolean Cobro = Invoice >= 1000;
        if (Age >= 21 && Age <= 65 && Invoice >= 1000 && Debt == false) {
            System.out.println("Tienes entre 21 y 65: " + rangeOfAge);
            System.out.println("¿Tus ingresos son mayor o iguales a 1000€? = " + Cobro);
            System.out.println("¿Tienes Deudas pendientes? = " + Debt);
            System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo.");
        }
        if (rangeOfAge == false && Invoice >= 1000 && Debt == false) {
            System.out.println("Tienes entre 21 y 65: " + rangeOfAge);
            System.out.println("¿Tus ingresos son mayor o iguales a 1000€? = " + Cobro);
            System.out.println("¿Tienes Deudas pendientes? = " + Debt);
            System.out.println("Lo siento, NO eres elegible para solicitar el préstamo.");
        }
        if (rangeOfAge == false && Cobro == false && Debt == false) {
            System.out.println("Tienes entre 21 y 65: " + rangeOfAge);
            System.out.println("¿Tus ingresos son mayor o iguales a 1000€? = " + Cobro);
            System.out.println("¿Tienes Deudas pendientes? = " + Debt);
            System.out.println("Lo siento, NO eres elegible para solicitar el préstamo.");
        }
        if (rangeOfAge == false && Cobro == false && Debt == true) {
            System.out.println("Tienes entre 21 y 65: " + rangeOfAge);
            System.out.println("¿Tus ingresos son mayor o iguales a 1000€? = " + Cobro);
            System.out.println("¿Tienes Deudas pendientes? = " + Debt);
            System.out.println("Lo siento, NO eres elegible para solicitar el préstamo.");
        }
        if (rangeOfAge == true && Cobro == true && Debt == true) {
            System.out.println("Tienes entre 21 y 65: " + rangeOfAge);
            System.out.println("¿Tus ingresos son mayor o iguales a 1000€? = " + Cobro);
            System.out.println("¿Tienes Deudas pendientes? = " + Debt);
            System.out.println("Lo siento, NO eres elegible para solicitar el préstamo.");
        }
        if (rangeOfAge == true && Cobro == false && Debt == true) {
            System.out.println("Tienes entre 21 y 65: " + rangeOfAge);
            System.out.println("¿Tus ingresos son mayor o iguales a 1000€? = " + Cobro);
            System.out.println("¿Tienes Deudas pendientes? = " + Debt);
            System.out.println("Lo siento, NO eres elegible para solicitar el préstamo.");
        }
        if (rangeOfAge == false && Cobro == true && Debt == true) {
            System.out.println("Tienes entre 21 y 65: " + rangeOfAge);
            System.out.println("¿Tus ingresos son mayor o iguales a 1000€? = " + Cobro);
            System.out.println("¿Tienes Deudas pendientes? = " + Debt);
            System.out.println("Lo siento, NO eres elegible para solicitar el préstamo.");
        }
        if (rangeOfAge == true && Cobro == false && Debt == false) {
            System.out.println("Tienes entre 21 y 65: " + rangeOfAge);
            System.out.println("¿Tus ingresos son mayor o iguales a 1000€? = " + Cobro);
            System.out.println("¿Tienes Deudas pendientes? = " + Debt);
            System.out.println("Lo siento, NO eres elegible para solicitar el préstamo.");
        }
        scanner.close();
    }

    public void Practicando35() {
        int PackageDollars = 5;
        System.out.println("Introduzca el peso del paquete");
        int PackageKg = scanner.nextInt();
        System.out.println("Introduzca la distancia en km");
        int Distance = scanner.nextInt();
        System.out.println("¿Es envío urgente?  True/False");
        boolean Emergency = scanner.nextBoolean();
        int priceDistance = 10;

        if (PackageKg > 5 && Distance > 100 && Emergency == true) {
            System.out.println("Precio base = " + PackageDollars);
            System.out.println("El peso del producto es = " + PackageKg);
            int Sobrepeso = PackageKg - 5;
            System.out.println("El peso excede 5kg en  " + Sobrepeso + "Kg");
            int costeadicional = Sobrepeso * 2;
            System.out.println("Coste adicional por peso: " + costeadicional);
            int Price = (PackageDollars + costeadicional);
            System.out.println("El precio es " + Price + "€");
            System.out.println("Coste adicional por distancia " + priceDistance + "€");
            int subtotal = Price + priceDistance;
            System.out.println("Subtotal: " + subtotal + "€");
            System.out.println("Es envío urgente: " + Emergency);
            double total = subtotal * 1.5;
            System.out.println("Coste de envío total= " + total + "€");
        } else if (PackageKg > 5 && Distance > 100 && Emergency == false) {
            System.out.println("Precio base = " + PackageDollars);
            System.out.println("El peso del producto es = " + PackageKg);
            int Sobrepeso = PackageKg - 5;
            System.out.println("El peso excede 5kg en  " + Sobrepeso + "Kg");
            int costeadicional = Sobrepeso * 2;
            System.out.println("Coste adicional por peso: " + costeadicional);
            int Price = (PackageDollars + costeadicional);
            System.out.println("El precio es " + Price + "€");
            System.out.println("Coste adicional por distancia " + priceDistance + "€");
            int subtotal = Price + priceDistance;
            System.out.println("Subtotal: " + subtotal + "€");
            System.out.println("Es envío urgente: " + Emergency);
            System.out.println("Coste de envío total= " + subtotal + "€");
        } else if (PackageKg > 5 && Distance <= 100 && Emergency == false) {
            System.out.println("Precio base = " + PackageDollars);
            System.out.println("El peso del producto es = " + PackageKg);
            int Sobrepeso = PackageKg - 5;
            System.out.println("El peso excede 5kg en  " + Sobrepeso + "Kg");
            int costeadicional = Sobrepeso * 2;
            System.out.println("Coste adicional por peso: " + costeadicional);
            int Price = (PackageDollars + costeadicional);
            System.out.println("El precio es " + Price + "€");
            int subtotal = Price;
            System.out.println("Subtotal: " + subtotal + "€");
            System.out.println("Es envío urgente: " + Emergency);
            System.out.println("Coste de envío total= " + subtotal + "€");
        } else if (PackageKg <= 5 && Distance <= 100 && Emergency == false) {
            System.out.println("Precio base = " + PackageDollars);
            System.out.println("El peso del producto es = " + PackageKg);
            System.out.println("El precio es " + PackageDollars + "€");
            int subtotal = PackageDollars;
            System.out.println("Subtotal: " + subtotal + "€");
            System.out.println("Es envío urgente: " + Emergency);
            System.out.println("Coste de envío total= " + subtotal + "€");
        }

    }

    public void Practicando36() {
        int Number;
        do {
            System.out.println("Introduce un número del 1-7");
            Number = scanner.nextInt();

            switch (Number) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                case 3:
                    System.out.println("Martes");
                    break;
                case 4:
                    System.out.println("Miércoles");
                    break;
                case 5:
                    System.out.println("Jueves");
                    break;
                case 6:
                    System.out.println("Viernes");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
            }
        }
        while (Number != 8);
    }

    public void Practicando37() {
        System.out.println("Introduce tu nota , (A, B, C, D, F)");
        String Grade = scanner.nextLine();

        switch (Grade) {
            case "A":
                System.out.println("Calificación A: Excelente");
                break;
            case "B":
                System.out.println("Calificación B: Muy bien");
                break;
            case "C":
                System.out.println("Calificación C: Bien");
                break;
            case "D":
                System.out.println("Calificación D: Suficiente");
                break;
            case "F":
                System.out.println("Calificación F: Insuficiente");
        }

    }

    public void Practicando38() {
        System.out.println("Introduce el primer número");
        double NumberOne = scanner.nextDouble();
        System.out.println("Introduce el segundo número");
        double NumberTwo = scanner.nextDouble();
        System.out.println("Introduce la operación que quieres realizar  (+, -, *, /). ");
        scanner.nextLine();
        String ArithmeticOperator = scanner.nextLine();
        switch (ArithmeticOperator) {
            case "+":
                double Result = NumberOne + NumberTwo;
                System.out.println("El resultado de " + NumberOne + " + " + NumberTwo + " = " + Result);
                break;
            case "-":
                double Result2 = NumberOne - NumberTwo;
                System.out.println("El resultado de " + NumberOne + " - " + NumberTwo + " = " + Result2);
                break;
            case "/":
                double Result3 = NumberOne / NumberTwo;
                System.out.println("El resultado de " + NumberOne + " / " + NumberTwo + " = " + Result3);
                break;
            case "*":
                double Result4 = NumberOne * NumberTwo;
                System.out.println("El resultado de " + NumberOne + " * " + NumberTwo + " = " + Result4);
                break;
        }
    }

    public void Practicando39() {
        int Opcion;
        do {
            System.out.println("--- MENÚ ---\n" +
                    "1. Ver perfil\n" +
                    "2. Configuración\n" +
                    "3. Ayuda\n" +
                    "4. Salir");
            Opcion = scanner.nextInt();
            switch (Opcion) {
                case 1:
                    System.out.println("Elegiste ver tu perfil");
                    break;
                case 2:
                    System.out.println("Elegiste la configuración");
                    break;
                case 3:
                    System.out.println("Elegiste ayuda");
                    break;
                case 4:
                    System.out.println("Saliste");
                    break;
            }
        }
        while (Opcion != 4);

    }

    public void Practicando40() {

        System.out.println("Introduce un mes del año (1-12): ");
        int Seasons = scanner.nextInt();
        switch (Seasons) {
            case 12, 1, 2:
                System.out.printf("El mes %d Corresponde a: Invierno", Seasons);
                break;
            case 3, 4, 5:
                System.out.printf("El mes %d Corresponde a: Primavera", Seasons);
                break;
            case 6, 7, 8:
                System.out.printf("El mes %d Corresponde a: Verano", Seasons);
                break;
            case 9, 10, 11:
                System.out.printf("El mes %d Corresponde a: Otoño", Seasons);
        }
    }

    public void Practicando41() {
        System.out.println("Introduce un número (1-10):");
        int multiplicación = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicación + " x " + i + " = " + (multiplicación * i));

        }

    }

    public void Praticando42() {
        System.out.print("Introduce un número: ");
        int Numero = scanner.nextInt();
        int suma = 0;
        // Mostrar el proceso de suma
        System.out.print("Sumando: ");
        for (int i = 1; i <= Numero; i++) {
            suma = suma + i;
            if (i < Numero) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();

        System.out.println("La suma de números del 1 al " + Numero + " es: " + suma);
        scanner.close();
    }

    public void Practicando43() {
        System.out.println("Introduce un número: ");
        int number = scanner.nextInt();
        System.out.println("recorriendo numeros del 1 al " + number);
        int contadorPar = 0;
        int contadorImpar = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0 && i <= number) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        System.out.println("Numeros de pares: " + contadorPar);
        System.out.println("Numeros de impares: " + contadorImpar);
    }

    public void Practicando44() {
        System.out.print("Introduce un número: ");
        int Numero = scanner.nextInt();
        int suma = 1;
        for (int i = 1; i <= Numero; i++) {
            suma = suma * i;

            if (i < Numero) {
                System.out.print(i + "! * ");
            } else {
                System.out.print(i + "!");
            }
        }
        System.out.println();
        System.out.println("Factorial de " + Numero + " es " + suma);
    }

    public void Practicando45() {
        System.out.println("--- MENÚ ---\n" +
                "1. Flexiones\n" +
                "2. Abdominales\n" +
                "3. Sentadillas\n" +
                "Elige un ejercicio (1-3):");
        int option = scanner.nextInt();
        System.out.println("Cuantas repeticiones quiere hacer: ");
        int reps = scanner.nextInt();
        for (int i = 1; i <= reps; i++) {
            switch (option) {
                case 1:
                    System.out.println("Has hecho " + i + " Flexiones");
                    if (i == reps) System.out.println("Haz completado todas las flexiones ");
                    break;
                case 2:
                    System.out.println("Has hecho " + i + " Abdominales");
                    if (i == reps) System.out.println("Haz completado todas las abdominales ");
                    break;
                case 3:
                    System.out.println("Has hecho " + i + " Sentadillas");
                    if (i == reps) System.out.println("Haz completado todas las sentadillas ");
                    break;
            }
        }
    }

    public void Practicando46() {

        System.out.println("Introduzca un número para el contador: ");
        int counter = scanner.nextInt();
        int holder;
        do {
            for (holder = 1; holder <= counter; holder++)
                System.out.println(holder);

        } while (holder < counter);
        System.out.println("Fin del conteo");


    }

    public void counter() {
        System.out.println("Introduzca un número para el contador");
        int number = scanner.nextInt();
        int counter = 0;
        ;
        while (counter < number) {
            System.out.println(counter + 1);
            counter++;


        }
        System.out.println("Fin del conteo");
    }

    public void Practicando47() {
        final String harcoded_password = "12345";
        String password = "";
        do {
            System.out.println("Enter the password");
            password = scanner.nextLine();
            if (!password.equals(harcoded_password)) {
                System.out.println("Wrong password!");
            }
        } while (!password.equals(harcoded_password));
        System.out.println("Correct password!");
    }

    public void Practicando48() {
        System.out.println("Enter numbers for the sum");
        int number = 1;
        int sum = 0;
        while (number > 0) {
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println(sum);
    }

    public void Practicando49() {
        System.out.println("Enter a number between 1-10");
        int guessNumber = 0;
        int systemNumber = (int) (Math.random() * 10) + 1;
        do {
            guessNumber = scanner.nextInt();
            if (systemNumber < guessNumber) {
                System.out.println("Try again, the number is lower");
            } else if (systemNumber > guessNumber) {
                System.out.println("Try again the number is higher");
            }

        } while (guessNumber != systemNumber);
        System.out.println("Correct you guessed the number, and the number was: " + systemNumber);

    }

    public void Practicando50() {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        int option = 0;
        do {
            System.out.println("--- MENÚ ---\n" +
                    "1. Saludar\n" +
                    "2. Despedirse\n" +
                    "3. Ver hora\n" +
                    "4. Salir");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Hi, how are you?");
                    break;
                case 2:
                    System.out.println("Bye bye");
                    break;
                case 3:
                    System.out.println(formattedDate);
                    break;
            }

        } while (option != 4);
        System.out.println("You left");
    }

    public void Practicando51() {
        System.out.println("Enter a number for the countdown");
        int countdown = scanner.nextInt();
        while (countdown != 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("¡Despegue!");
    }

    public void Practicando52() {
        System.out.println("Enter how many grades are you going to write");
        int numberOfGrades = scanner.nextInt();
        int counter = 0;
        double sum = 0;
        double media = 0;
        System.out.println("Introduce la primera calificación ");
        while (counter < numberOfGrades) {
            counter++;
            double grades = scanner.nextDouble();
            System.out.println("Introduce la siguiente calificación\n" +
                    "calificación: " + counter + " = " + grades);
            sum += grades;
        }
        System.out.println("Suma total: " + sum);
        media = sum / numberOfGrades;
        System.out.println("The average is: " + media);
    }

    public void Practicando53() {
        System.out.println("Enter your age");
        int age = 0;
        do {
            age = scanner.nextInt();
            if (age < 0 || age > 120) {
                System.out.println("Your age is not valid, please enter an age between 0 and 120.");
            }

        } while (!(age >= 0) || !(age <= 120));
        System.out.println("Your age is valid: " + age + " ¡Thanks!");
    }

    public void Practicando54() {
        System.out.println("How many students are in the class? ");
        int numberOfStudents = scanner.nextInt();
        System.out.println("There are " + numberOfStudents + " students");
        System.out.println("Enter each student's grade");
        int[] studentsGrades = new int[numberOfStudents];

        int counter = 0;
        while (counter < numberOfStudents) {
            System.out.println("Enter the grade of the student number " + (counter + 1) + " (0-10): ");
            int studentsGrade = scanner.nextInt();
            if (studentsGrade < 0 || studentsGrade > 10) {
                System.out.println("Invalid Grade, try again.");
                continue;
            }
            studentsGrades[counter] = studentsGrade;
            counter++;
        }

        System.out.println("Grade Report");

        for (int i = 0; i < numberOfStudents; i++) {
            int studentsGrade = studentsGrades[i];
            String grade = "";
            switch (studentsGrade) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                case 7:
                    grade = "B";
                    break;
                case 6:
                case 5:
                    grade = "C";
                    break;
                case 4:
                case 3:
                    grade = "D";
                    break;
                default:
                    grade = "F";
                    break;
            }
            System.out.println("Student number " + (i + 1) + ": " + studentsGrade + " points " + "= Calificación " + grade);

        }

    }

    public void Practicando55() {
        int balance = 1000;
        int option = 0;
        System.out.println("Your initial balance is: " + balance);

        do {
            System.out.println("--- CAJERO AUTOMÁTICO ---\n" +
                    "1. Check balance\n" +
                    "2. Withdraw money\n" +
                    "3. Deposit money\n" +
                    "4. Leave");
            System.out.println("Choose an option");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.println("How much money do you want to withdraw?");
                    int withdraw = scanner.nextInt();
                    while (withdraw > balance || withdraw < 0) {
                        if (withdraw < 0) {
                            System.out.println("The withdrawal must be a positive number" +
                                    "\n How much money do you want to withdraw?");
                        } else
                            System.out.println("you do not have enough funds to withdraw money, your current funds are " +
                                    balance +
                                    "\n How much money do you want to withdraw?");
                        withdraw = scanner.nextInt();
                    }
                    System.out.println("Successful withdrawal of " + withdraw);
                    balance -= withdraw;
                    System.out.println("Your new balance is: " + balance);
                    break;

                case 3:
                    System.out.println("How much money do you want to deposit?");
                    int deposit = scanner.nextInt();
                    while (deposit < 0) {
                        System.out.println("The deposit must be greater than or equal to 0 \n" +
                                "How much money do you want to deposit?");
                        deposit = scanner.nextInt();
                    }
                    balance += deposit;
                    System.out.println("The deposit has been successful \n" +
                            "Your new balance is: " + balance);
                    break;
            }

        } while (option != 4);
        System.out.println("Thank you for using the ATM ");


    }

    /*1. Crea un programa de adivinación de números El programa genera de manera
aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
máximo de 7 intentos. Después de cada intento, indica si el número es mayor
o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
de intentos utilizado; si no, mostrar un aviso de que debe introducir
nuevamente un número.*/
    //generar un numero entre el 50 y el 1
    //El usuario debe adivinar en un limite de 7 intentos
    //
    public void T4ejecicio1() {
        System.out.println("Enter a number between 1-50, remember you just have 7 attemps");
        int guessNumber = 0;
        int systemNumber = (int) (Math.random() * 50) + 1;
        int attemps = 0;
        do {
            guessNumber = scanner.nextInt();
            attemps += 1;
            System.out.println("Your attemps are: " + attemps);
            if (systemNumber < guessNumber) {
                System.out.println("Try again, the number is lower");
            } else if (systemNumber > guessNumber) {
                System.out.println("Try again the number is higher");
            }

        } while (guessNumber != systemNumber && attemps != 7);
        if (guessNumber == systemNumber) {
            System.out.println("Correct you guessed the number, and the number was: " + systemNumber);
        } else
            System.out.println("You have used up all your attempts, good luck the next time ");


    }


    public void Practicando56() {
        String[] arrayTest = {"Apple, Cherry, Orange, Grape, Pear"};
        for (int i = 0; i < arrayTest.length; i++) {
            System.out.printf("The fruit in the %d of %s position \n", i, arrayTest[i]);
        }
        System.out.printf("And the number of spaces in the array is %d", arrayTest.length);

    }

    public void Practicando57() {
        int[] integers = new int[]{10, 20, 30, 40, 50, 60};
        System.out.println("Traversing the array number");
        for (int i = 0; i < integers.length; i++) {
            System.out.printf("Position number %d in array of the number %d\n", i, integers[i]);
        }
    }

    public void Practicando58() {
        int[] arrayUser = new int[5];
        for (int i = 0; i < arrayUser.length; i++) {
            System.out.println("Enter a number for the array " + (i + 1));
            arrayUser[i] = scanner.nextInt();
        }
        System.out.println("Array content:");
        for (int i = 0; i < arrayUser.length; i++) {
            System.out.println(arrayUser[i]);
        }
    }
    public void Practicando59(){
       /* Crea un programa con un array de 7 números.
            Pide al usuario un número a buscar y usa un bucle for para recorrer el array.
        Si el número existe, muestra su posición. Si no existe, indica que no se encontró. */

       // array que hace las cosas
        int [] arrayNumbers = new int []{54,34,56,43,23,53,93};
        System.out.println("Enter a number to see if it's in the array");
        int userNumber = scanner.nextInt();
         boolean flag = false;
        for (int i = 0; i < arrayNumbers.length; i++){
            if(arrayNumbers[i]== userNumber){
                System.out.println("The number " + arrayNumbers[i] + " already in the array, in the position " + (i + 1));
            flag = true;
            break; }
        }
              if (!flag){
                System.out.println("The number " + userNumber + " is not found in the array");
                }
     }

    /* Escribe un programa que defina un array de 10 números enteros.
    Usa un bucle for para contar cuántos números son mayores que 50 y muestra el resultado.*/

     public void Practicando60 (){
    int[] integerNumbers = new int[] {10,20,30,40,859,60,70,80,90,100};
         int counter = 0;
            for(int i = 0; i < integerNumbers.length; i++){
         if(integerNumbers[i] > 50){
             counter++;
             System.out.println(integerNumbers[i]);
         }
            }
         System.out.println("The quantities of numbers greater than 50 are: " + counter);

     }
     public void Practicando61(){
         double [] arrayDecimalNumbers = new double[] {5.57 , 2.48 , 1.47 , 2.33 , 7.18 , 4.15 , 5.52 , 5.70};
         double flag = 0;
         for (int i = 0; i < arrayDecimalNumbers.length; i++) {
             flag += arrayDecimalNumbers[i];
             arrayDecimalNumbers[i] = flag;
         }
         System.out.println("The sum of those numbers are " + flag);
         flag = flag / 8;
         System.out.println("and the media is " + flag);

     }
     public void Practicando62(){



     }
    }