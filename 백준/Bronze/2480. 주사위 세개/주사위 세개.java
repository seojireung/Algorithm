import java.util.*;
import java.io.*;

// 2480 주사위 세개
public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // 모두 다를 경우 최댓값
        int max = 0;
        
        // 같은 눈 3개
        if(a==b && b==c && c==a) System.out.print( 10000+(a*1000) );
        // 같은 눈 2개 (a==b&&a!=c&&b!=c, b==c&&b!=a&&c!=a, c==a&&c!=b&&b!=a)
        if(a==b && a!=c && b!=c) System.out.print( 1000+(a*100) );
        if(b==c && b!=a && c!=a) System.out.print( 1000+(b*100) );
        if(c==a && c!=b && b!=a) System.out.print( 1000+(c*100) );
        // 모두 다른 눈
        if(a!=b && b!=c && c!=a) {
            if(a>b && a>c) max = a;
            if(b>c && b>a) max = b;
            if(c>a && c>b) max = c;
            System.out.print( max*100 );
        }

        br.close();
    }
}