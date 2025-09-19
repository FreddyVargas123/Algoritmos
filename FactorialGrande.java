import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FactorialGrande {

    private static ArrayList<Integer> multiplicar(ArrayList<Integer> numero, int n) {
        ArrayList<Integer> resultado = new ArrayList<>();
        int sobrante = 0; 

        for (int i = 0; i < numero.size(); i++) {
            int producto = numero.get(i) * n + sobrante;
            resultado.add(producto % 10); 
            sobrante = producto / 10;  
        }

        while (sobrante != 0) {
            resultado.add(sobrante % 10);
            sobrante /= 10;
        }

        return resultado;
    }

    public static String factorial(int n) {
        ArrayList<Integer> resultado = new ArrayList<>();
        resultado.add(1);

        for (int i = 2; i <= n; i++) {
            resultado = multiplicar(resultado, i);
        }

        Collections.reverse(resultado);
        StringBuilder sb = new StringBuilder();
        for (int digito : resultado) {
            sb.append(digito);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();

        String resultado = factorial(n);
        System.out.println(n + "! = " + resultado);

        scanner.close();
    }
}

