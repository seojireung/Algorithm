import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];

        for(int i=1; i<=28; i++){
            arr[Integer.parseInt(br.readLine())] = 1;
        }

        for(int i=1; i<=30; i++){
            if(arr[i]!=1) System.out.println(i);
        }

        br.close();
                
    }
}