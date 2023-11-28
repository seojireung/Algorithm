import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 배열
        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 오름차순 정렬
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N-1]);
        
    }
}