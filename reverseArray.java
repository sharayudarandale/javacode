import java.util.Scanner;
import java.util.Arrays;

class reverseArray {
    public static void reverseArray(int[] arr) {
        int left = 0; // Pointer at the beginning
        int right = arr.length - 1; // Pointer at the end

        // Swap elements until the two pointers meet in the middle
        while (left < right) {
            // Swap the elements at the left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers closer to the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Declare the array and take input
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reverse the array
        reverseArray(arr);

        // Print the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
