import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public static void main(String[] args) throws Exception {
        int t = 1;
        t = nextInt(); 
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() throws Exception {
        // Write your logic here
        int n = 7;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();

        }

        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            int num = arr[i];
            num *= -1;

            sum += num;
        }

        sum += arr[n-1];

        System.out.println(sum);

    }
}