import java.util.*;

public class recylingCenter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int c = scn.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scn.nextInt();
                
            }
            
            for (int j = 0; j < n; j++) {
                int max = arr[j];
                int loc = j;
                for (int k = j + 1; k < n; k++) {
                    if (max < arr[k]) {
                        max = arr[k];
                        loc = k;
                    }
                }
                int temp = arr[j];
                arr[j] = arr[loc];
                arr[loc] = temp;
                
            }

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > c) {
                    count++;
                }
                else if (arr[j] <= c) {
                    if (j+1 < n) {
                        for (int j2 = j+1; j2 < n; j2++) {
                            arr[j2] = arr[j2]*2;
                        }
                    }
                    else if (j == n-1) {
                        if (arr[j] >c) {
                            count++;
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
            
        }

        scn.close();
    }
}
