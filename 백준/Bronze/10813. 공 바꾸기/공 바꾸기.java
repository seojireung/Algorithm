import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        // switch 위한 임의의 변수
        int change = 0;

        // 배열에 초깃값 바구니와 같은 수 넣어주기 (index+1)
        for(int a=0; a<arr.length; a++) arr[a] = a+1;

        for(int b=0; b<M; b++){
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;

            change = arr[i];
            arr[i] = arr[j];
            arr[j] = change;
        }

        // 배열 출력
        for(int value : arr) System.out.print(value + " ");

        br.close();
    }
}