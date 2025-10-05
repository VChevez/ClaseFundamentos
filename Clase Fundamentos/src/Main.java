import java.util.Scanner;
public class Main {

    public static void main(String[]args) {
        Scanner h = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a descomponer: ");
        double a = h.nextDouble();
        double[] b  = {1.0, 0.75, 0.5, 0.25, 0.1, 0.05, 0.01};
        System.out.println("Descomposición de " + a + ":");
        double m = 0;
        System.out.println(" moneda/s de " + a + " = 0" );
        for (double moneda : b) {
            int j = (int) Math.floor((a + 1e-9) / moneda);
            if (j > 0){
                System.out.println(j + " moneda/s de " + moneda);
                a -= j * moneda;}



    }
}
}