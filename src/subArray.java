public class subArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        printSubarrays(inputArray);
    }

    public static void printSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}
