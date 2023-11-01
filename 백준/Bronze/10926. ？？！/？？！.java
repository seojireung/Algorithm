import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        String exist = "??!";
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputID = br.readLine();
        
        System.out.println(inputID + exist);
    }
}