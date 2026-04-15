import java.util.*;

public class target_Practice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            char[][] box = new char[10][10];

            for (int j = 0; j < 10; j++) {
                String ln = scn.next();
                for (int j2 = 0; j2 < 10; j2++) {
                    box[j][j2] = ln.charAt(j2);
                }
            }

            int pt = 0;

            for (int j = 0; j < 10; j++) {
                for (int j2 = 0; j2 < 10; j2++) {
                    if (box[j][j2] == 'X') {
                        int ly = Math.min(Math.min(j, j2), Math.min(9 - j, 9 - j2));
                        pt += (ly + 1);
                    }
                }
            }

            System.out.println(pt);
        }

        scn.close();
    }
}
