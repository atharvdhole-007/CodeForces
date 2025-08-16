import java.util.*;

public class How_Much_Does_Daytona_Cost {
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

        for (int p = 0; p < temp.length; p++) {
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
            int key = scn.nextInt();

            int[] arr = new int[n];
            int st = 0;
            int end = n-1;

            for (int j = 0; j < n;j++) {
                arr[j] = scn.nextInt();
            }

            mergesort(arr, 0, n-1);
            int ch = 0;

            while (st <= end) {
                int mid = (st + end) / 2;

                if (arr[mid] == key) {
                    ch = 1;
                    break;
                }
                else if (arr[mid] < key) {
                    st = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            
            if (ch == 1) {
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
            
        }
        scn.close();
    }
}
