import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        // 최댓값, 위치
        int max = 0;
        int index = 0;
        // 순서 부여
        int count = 0;

        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int find : arr){
            count++;
            if(find > max){
                max = find;
                index = count;
            }
        }

        System.out.println(max + "\n" + index);
      
    }
}