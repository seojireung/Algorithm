import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=N; i++){
            for(int a=1; a<=N-i; a++) System.out.print(" ");
            for(int b=1; b<=i; b++) System.out.print("*");
            for(int c=1; c<=i-1; c++) System.out.print("*");
            System.out.println("");
        }
        for(int i=1; i<=N-1; i++){
            for(int a=1; a<=i; a++) System.out.print(" ");
            for(int b=1; b<=N-i; b++) System.out.print("*");
            for(int c=1; c<=N-i-1; c++) System.out.print("*");
            System.out.println("");
        }

        br.close();
    }
}