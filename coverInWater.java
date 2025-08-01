import java.util.*;

public class coverInWater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scn.nextLine());
            String input = scn.nextLine();
            int count = 0, min = 0;

            for (int j = 0; j < n; j++) {
                char ch = input.charAt(j);

                if (ch == '.') {
                    count++; 
                    if(j == n-1){
                        if (count >= 3) {
                            min = 2;
                            break;
                        }
                        else if (count == 2) {
                            min = min + 2;
                        }
                        else { 
                            min++;
                        }
                    }
                }
                else{
                    if (count >= 3) {
                        min = 2;
                        break;
                    }
                    else if (count == 2) {
                        min = min + 2;
                    }
                    else if (count == 1){ 
                        min++;
                    }
                    count = 0;
                }
            }
            System.out.println(min);
        }


        scn.close();
    }
}
