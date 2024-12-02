class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // If d is greater than the size of the array, take modulo
        d = d % arr.length;

        // Edge case: if d is 0 or array size is 1, no rotation is needed
        if (d == 0 || arr.length <= 1) return;

        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining elements
        reverse(arr, d, arr.length - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, arr.length - 1);
    }

    // Helper function to reverse a portion of the array
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
