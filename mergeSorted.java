public class mergeSorted {
    public static void main(String[] args) {
       
        int num1[] = {1, 2, 3, 4, 0, 0, 0, 0};
        int num2[] = {3, 4, 5, 6};
        int m = 4; 
        int n = 4;  
        mergesortarrays(num1, num2, m, n);

        
        for (int i = 0; i < m + n; i++) {
            System.out.print(num1[i] + " ");
        }
    }

    public static void mergesortarrays(int[] num1, int[] num2, int m, int n) {
        int i = m - 1;  
        int j = n - 1;  
        int k = m + n - 1;  

       
        while (j >= 0) {
            if (i >= 0 && num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }
    }
}
