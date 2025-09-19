import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IntervalosNoSuperpuestos {

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[1]));

        int count = 0;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd) {
                count++;
            } else {
                lastEnd = intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de intervalos:");
        int n = scanner.nextInt();
        
        int[][] intervals = new int[n][2];

        System.out.println("Ingrese los intervalos separados por espacios:");

        for (int i = 0; i < n; i++) {
            System.out.print("Intervalo " + (i + 1) + " (inicio fin): ");
            intervals[i][0] = scanner.nextInt();  
            intervals[i][1] = scanner.nextInt();  
        }

        int result = eraseOverlapIntervals(intervals);
        System.out.println("Numero minimo de eliminaciones: " + result);
        scanner.close();
    }
}

