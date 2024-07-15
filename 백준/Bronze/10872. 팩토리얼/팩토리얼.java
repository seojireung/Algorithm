import java.util.*;
import java.lang.*;
import java.io.*;

// 백준 10872
class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // (방법 1)
        // for문

        int res = 1;
        
        if (N==0) System.out.print(1);
        if (N>0){
            
            // N-i가 0보다 클 때까지 (i < N)
            for (int i=0; i<N; i++) {
                res = res * (N-i);
            }
            System.out.print(res);
        }

    }
}