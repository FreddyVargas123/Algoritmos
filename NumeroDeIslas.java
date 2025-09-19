import java.util.Scanner;

public class NumeroDeIslas {

    public static int contarIslas(int[][] grid) {
        int filas = grid.length;
        int columnas = grid[0].length;
        int contador = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (grid[i][j] == 1) {
                    contador++;
                    dfs(grid, i, j);
                }
            }
        }
        return contador;
    }

    private static void dfs(int[][] grid, int i, int j) {
        int filas = grid.length;
        int columnas = grid[0].length;
        if (i < 0 || i >= filas || j < 0 || j >= columnas || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int columnas = scanner.nextInt();

        int[][] grid = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz :");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int resultado = contarIslas(grid);
        System.out.println("Numero de islas: " + resultado);

        scanner.close();
    }
}

