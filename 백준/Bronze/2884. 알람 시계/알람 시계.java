import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M<45){
            if(H==0) System.out.print( "23 " ); 
            else System.out.print( H-1 + " " );
            System.out.print( 60-(45-M) );
        }else {
            System.out.print( H + " " );
            System.out.print( M-45 );
        }

        br.close();
        
    }
}