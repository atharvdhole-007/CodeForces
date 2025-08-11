import java.util.*;

public class doremysPaint3 {
    public static void merge(int[] arr, int left, int mid, int right){
        int i = left;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[right - left + 1];

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int p = 0; p < temp.length;p++){
            arr[left + p] = temp[p];
        }
    }
    public static void mergesort(int[] arr, int left, int right){
        int mid = left + (right - left) / 2;
        if (left < right) {
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scn.nextInt();
            }
            mergesort(arr, 0, n-1);

            int ch = 1;
            int c1 = arr[0];
            int c2 = arr[n-1];
            int eq1 = 0, eq2 = 0;

            for (int j = 0; j < n; j++) {
                if (c1 == c2){
                    ch = 1;
                    break;
                }
                else if (c1 == arr[j]) {
                    eq1++;
                }
                else if (c2 == arr[j]) {
                    eq2++;
                }
                else{
                    ch = 0;
                    break;
                }
            }

            if (n % 2 == 0 && ch != 0 && eq1 == eq2) {
                ch = 1;
            }
            else if (n % 2 != 0 && ch != 0 && (eq1 == (eq2 - 1) || eq2 == (eq1 - 1) || (eq1 == 0 && eq2 == 0))) {
                ch = 1;
            }
            else{
                ch = 0;
            }

            if (ch == 1) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            } 
        }

        scn.close();
    }
}
