import java.util.Arrays;

public class selectionSort {
    public static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n ; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,6,8};
        System.out.println("original array: "+Arrays.toString(arr));
        sort(arr);
        System.out.println("sorted array: "+Arrays.toString(arr));
    }
}
