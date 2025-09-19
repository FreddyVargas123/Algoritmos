import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumeroFelizSimple {

    private static int sumaCuadradosDigitos(int n) {
        int suma = 0;
        while (n > 0) {
            int digito = n % 10;
            suma += digito * digito;
            n /= 10;
        }
        return suma;
    }

    public static boolean esFeliz(int n) {
        Set<Integer> vistos = new HashSet<>();

        while (n != 1 && !vistos.contains(n)) {
            vistos.add(n);
            n = sumaCuadradosDigitos(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (esFeliz(numero)) {
            System.out.println(numero + " es un numero feliz.");
        } else {
            System.out.println(numero + " no es un numero feliz.");
        }

        scanner.close();
    }
}
