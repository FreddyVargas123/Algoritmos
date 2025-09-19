import java.util.Scanner;

public class SubcadenaSinRepeticiones {

    public static String subcadenaMasLargaSinRepeticiones(String s) {
        int[] ultimaPos = new int[256];
        for (int i = 0; i < 256; i++) {
            ultimaPos[i] = -1; 
        }

        int inicio = 0; 
        int maxLongitud = 0;
        int inicioMax = 0; 

        for (int fin = 0; fin < s.length(); fin++) {
            char c = s.charAt(fin);

            if (ultimaPos[c] >= inicio) {
                inicio = ultimaPos[c] + 1;
            }
            ultimaPos[c] = fin;
            if (fin - inicio + 1 > maxLongitud) {
                maxLongitud = fin - inicio + 1;
                inicioMax = inicio;
            }
        }

        return s.substring(inicioMax, inicioMax + maxLongitud);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String texto = scanner.nextLine();

        String resultado = subcadenaMasLargaSinRepeticiones(texto);
        System.out.println("La subcadena mas larga sin repeticiones es: \"" + resultado + "\"");
        System.out.println("Longitud: " + resultado.length());

        scanner.close();
    }
}
