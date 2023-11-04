import java.util.Arrays;
import java.util.Scanner;

public class CivilWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] powers = new int[N];

        for (int i = 0; i < N; i++) {
            powers[i] = scanner.nextInt();
        }

//        Arrays.sort(powers); // Sort the avengers' powers in ascending order

        long ironmanPower = 0;
        long captainPower = 0;

        for (int i = N - 1; i >= 0; i--) {
            if ((N - i) % 2 == 1) {
                ironmanPower += powers[i];
            } else {
                captainPower += powers[i];
            }
        }

        long difference = ironmanPower - captainPower;
        System.out.println(Math.abs(difference)); // Print the absolute difference
    }
}
