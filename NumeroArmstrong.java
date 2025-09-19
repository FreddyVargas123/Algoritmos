import java.util.Scanner;

public class NumeroArmstrong {

    public static boolean esArmstrong(int n) {
        int original = n;
        int suma = 0;
        int digitos = String.valueOf(n).length();

        while (n > 0) {
            int digito = n % 10;
            suma += Math.pow(digito, digitos);
            n /= 10;
        }

        return suma == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (esArmstrong(numero)) {
            System.out.println(numero + " es un numero Armstrong.");
        } else {
            System.out.println(numero + " no es un numero Armstrong.");
        }

        scanner.close();
    }
}

