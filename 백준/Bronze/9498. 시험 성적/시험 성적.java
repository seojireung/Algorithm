import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Main{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int score = Integer.parseInt(br.readLine());

        if(90<=score && score<=100) System.out.println("A");
        if(80<=score && score<=89) System.out.println("B");
        if(70<=score && score<=79) System.out.println("C");
        if(60<=score && score<=69) System.out.println("D");
        if(score<=59) System.out.println("F");
    }
}