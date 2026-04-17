import java.io.*;
import java.util.*;

class Main {
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
        int n = nextInt();

        int[] ans = new int[n];

        int p1 = n/2;
        int p2 = (n/2) + 2;
        ans[0] = (n/2) +1;

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                ans[i] = p1;
                p1--;
            } else {
                ans[i] = p2;
                p2++;
            }

        }

        for (int i =0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}