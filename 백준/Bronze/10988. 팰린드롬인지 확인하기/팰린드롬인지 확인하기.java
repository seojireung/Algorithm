import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int length = str.length();

        // 문자열 양쪽 끝에서 하나씩 비교 시, 각 문자열 쌍이 모두 일치하는지 확인
        int check = 0;

        for(int i=0; i<(length/2); i++){
            if(str.charAt(i) == str.charAt(length-1-i)) check++;
        }

        System.out.print( (length/2) == check ? 1:0 );

        br.close();
    }
}