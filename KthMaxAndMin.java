
import java.util.Arrays;

public class KthMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;

        Arrays.sort(arr);

        int kthMin = arr[k-1];
        int kthMax = arr[arr.length - 1];

        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nKth Minimum Element: " + kthMin);
        System.out.println("Kth Maximum Element: " + kthMax);

    }
}
