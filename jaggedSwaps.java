import java.util.*;

public class jaggedSwaps {
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
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
            for (int i2 = 0; i2 < n; i2++){
                for (int j = 1; j < n-1; j++) {
                    if (arr[j-1] < arr[j] && arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            if (isSorted(arr)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        scn.close();
    }
}