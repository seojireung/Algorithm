import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 총 금액
        int X = Integer.parseInt(br.readLine());
        // 물건 종류 수
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        
        // 물건 가격
        int a;
        // 물건 개수
        int b;

        // 물건 합산
        int sum = 0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            sum += (a*b);
        }

        if (sum == X) System.out.print("Yes");
        else System.out.print("No");

        br.close();
        
    }
}