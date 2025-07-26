package CodeForces;

import java.util.*;

public class halloumiBoxes {

    public static boolean isSorted(int[] numbers) {
    for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] > numbers[i + 1]) {
            return false;
        }
    }
    return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        if (t <= 100) {
            for(int i = 1; i <= t;i++){
                int n = scn.nextInt();
                int k = scn.nextInt();
                int[] numbers = new int[n];

                if (k <= n) {
                    if (n <= 100) {
                        for (int j = 0; j < n; j++) {
                            int num = scn.nextInt();
                            numbers[j] = num;
                        }
                        if (isSorted(numbers)) {
                            System.out.println("YES");
                        }
                        else if (k >= 2) {
                            System.out.println("YES");
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
        scn.close();

    }
}
