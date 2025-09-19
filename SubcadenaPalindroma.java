import java.util.Scanner;

public class SubcadenaPalindroma {

    public static String subcadenaPalindromaMasLarga(String s) {
        if (s == null || s.length() < 1) return "";

        int inicio = 0, fin = 0;

        for (int i = 0; i < s.length(); i++) {
            int longitud1 = expandirDesdeCentro(s, i, i);     
            int longitud2 = expandirDesdeCentro(s, i, i + 1); 
            int longitud = Math.max(longitud1, longitud2);

            if (longitud > fin - inicio) {
                inicio = i - (longitud - 1) / 2;
                fin = i + longitud / 2;
            }
        }
        return s.substring(inicio, fin + 1);
    }

    private static int expandirDesdeCentro(String s, int izquierda, int derecha) {
        while (izquierda >= 0 && derecha < s.length() && s.charAt(izquierda) == s.charAt(derecha)) {
            izquierda--;
            derecha++;
        }
        return derecha - izquierda - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        String resultado = subcadenaPalindromaMasLarga(palabra);
        System.out.println("La subcadena palíndroma más larga es: " + resultado);

        scanner.close();
    }
}
