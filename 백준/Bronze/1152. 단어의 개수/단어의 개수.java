import java.util.*;
import java.lang.*;
import java.io.*;

// 백준 1152 단어의 개수
class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // StringTokenizer 클래스의 안에서 제공하는 기본 메서드
        // nextToken 메서드를 호출할 수 있는 횟수
        // --> StringTokenizer에 남아있는 토큰 갯수 반환
        System.out.print(st.countTokens());
        
    }
}