import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int count = 0;

        for(int i=0; i<10; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        //각 인덱스들 비교
        for(int i=0; i<arr.length; i++){
            
            int tmp = 0;
            
            for(int j=i+1; j<arr.length; j++){
                
                if(arr[i] == arr[j]) tmp++;
            }
            
            if(tmp == 0) count++;
        }

        System.out.print(count);

        br.close();
    }
}