import java.util.Scanner;

public class MaximumPolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] coordinates = new int[N][2];

        for (int i = 0; i < N; i++) {
            coordinates[i][0] = scanner.nextInt();
            coordinates[i][1] = scanner.nextInt();
        }

        double area = maximumPolygonArea(N, coordinates);
        System.out.println((int) Math.abs(area)); // Print the absolute area as an integer
    }

    public static double maximumPolygonArea(int N, int[][] coordinates) {
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < N; i++) {
            int x1 = coordinates[i][0];
            int y1 = coordinates[i][1];
            int x2 = coordinates[(i + 1) % N][0]; // Wrap around for the last point
            int y2 = coordinates[(i + 1) % N][1];
            sum1 += x1 * y2;
            sum2 += x2 * y1;
        }

        return Math.abs((sum1 - sum2) / 2);
    }
}
