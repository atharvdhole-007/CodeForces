import java.util.*;

public class gamewithIntegers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            if (n % 3 == 0) {
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
        scn.close();
    }
}
