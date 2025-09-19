import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizEspiral {

    public static List<Integer> recorrerEspiral(int[][] matriz) {
        List<Integer> resultado = new ArrayList<>();

        int arriba = 0;
        int abajo = matriz.length - 1;
        int izquierda = 0;
        int derecha = matriz[0].length - 1;

        while (arriba <= abajo && izquierda <= derecha) {
            
            for (int i = izquierda; i <= derecha; i++) {
                resultado.add(matriz[arriba][i]);
            }
            arriba++;

            for (int i = arriba; i <= abajo; i++) {
                resultado.add(matriz[i][derecha]);
            }
            derecha--;

            if (arriba <= abajo) {
                for (int i = derecha; i >= izquierda; i--) {
                    resultado.add(matriz[abajo][i]);
                }
                abajo--;
            }

            if (izquierda <= derecha) {
                for (int i = abajo; i >= arriba; i--) {
                    resultado.add(matriz[i][izquierda]);
                }
                izquierda++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamano n de la matriz: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        List<Integer> resultado = recorrerEspiral(matriz);
        System.out.println("espiral: " + resultado);

        scanner.close();
    }
}
