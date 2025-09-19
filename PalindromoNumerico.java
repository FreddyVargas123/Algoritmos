import java.util.Scanner;

public class PalindromoNumerico {

    public static boolean esPalindromo(int n) {
        int original = n;
        int invertido = 0;

        while (n > 0) {
            int digito = n % 10;
            invertido = invertido * 10 + digito;
            n /= 10;
        }

        return original == invertido;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();

        if (esPalindromo(numero)) {
            System.out.println(numero + " es un palindromo.");
        } else {
            System.out.println(numero + " no es un palindromo.");
        }

        scanner.close();
    }
}

