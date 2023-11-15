import java.io.*;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String s = br.readLine();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length()-1) + "\n");
            
        }
        
        br.close();
        
        System.out.println(sb);
        
    }
}