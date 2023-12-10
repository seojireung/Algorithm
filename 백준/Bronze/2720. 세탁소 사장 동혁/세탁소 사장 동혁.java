import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
        
		int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        
		for(int i = 0; i < T; i++) {
			int input = Integer.parseInt(br.readLine());
			
			quarter = input / 25;
			input = input % 25;
			
			dime = input / 10;
			input = input % 10;
			
			nickel = input / 5;
			input = input % 5;
			
			penny = input / 1;
			
			sb.append(quarter).append(" ").append(dime).append(" ").append(nickel).append(" ").append(penny).append("\n");
		}
        
		System.out.println(sb.toString());
        
        br.close();
	}

}