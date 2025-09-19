import java.util.Scanner;

public class SumaDeParesUnicos {

    public static void existeParConSuma(int[] nums, int target) {
        boolean encontrado = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Se encontró el par: " + nums[i] + " + " + nums[j] + " = " + target);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No existen dos números que sumen " + target);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número target: ");
        int target = scanner.nextInt();

        existeParConSuma(nums, target);

        scanner.close();
    }
}

