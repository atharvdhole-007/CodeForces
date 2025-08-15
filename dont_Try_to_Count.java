import java.util.*;

public class dont_Try_to_Count {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		for(int j = 0; j < t; j++){
		    int n = scn.nextInt();
		    int m = scn.nextInt();
		    
		    scn.nextLine();
		    String x = scn.nextLine();
		    String s = scn.nextLine();
		    int count = 0;
		    
		    StringBuilder sb = new StringBuilder(x);
		    
		    for (int i = 0;i < 3 ;i++) {
    		    if (n < m){
    		        while(n < m){
    		            sb = sb.append(sb);
    		            count++;
    		            n = sb.length();
    		        }
    		    }
    		    else if(n == m ){
    		        if (sb.toString().contains(s)){
    		            break;
    		        }
    		        else{
    		            sb = sb.append(sb);
    		            if(sb.toString().contains(s)){
    		                count++;
    		                break;
    		            }
    		            else{
    		                count = -1;
    		            }
    		        }
    		    }
    		    else{
    		        if(sb.toString().contains(s)){
    		            break;
    		        }
    		        else {
    		            sb = sb.append(sb);
    		            if(sb.toString().contains(s)){
    		                count++;
    		                break;
    		            }
    		            else{
    		                count = -1;
    		            }
    		        }
    		    }
		    }
		    System.out.println(count);
		    
		}
		scn.close();
    }
}
