import java.util.*;

public class goals_of_Victory {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            int[] arr = new int[n-1];

            for (int j = 0; j < n-1; j++) {
                arr[j] = scn.nextInt();
            }

            int posi = 0;
            int nega = 0;

            for (int j2 = 0; j2 < n-1; j2++) {
                int key = arr[j2];

                if (key >= 0) {
                    posi += key;
                }
                else{
                    nega += key;
                }
                
            }

            int ans = nega + posi;

            System.out.println(-ans);
        }
        scn.close();
    }
}
