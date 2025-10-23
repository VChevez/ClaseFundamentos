public class Practica {

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


    }

}
