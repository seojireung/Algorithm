import java.util.*;
import java.lang.*;
import java.io.*;

// 백준 10870 
class Main {

    public static int func(int n) {

        // 재귀 함수
        if(n <= 1) return n;
        else return func(n-1) + func(n-2);
        
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.print(func(n));
    }
}