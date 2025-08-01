import java.util.Scanner;

public class lineTrip {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int x = scn.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scn.nextInt();
            }
            int max = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                int diff = arr[j+1] - arr[j];
                if (diff > max) {
                    max = diff;
                }

            }
            int edge = 2*(x - arr[n-1]);
            if (edge > max) {
                max = edge;
            }
            System.out.println(max);
        }
        scn.close();
    }
}
