import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫째 줄의 정수
        int N = Integer.parseInt(br.readLine());
        // 정수 크기 만큼 배열 생성
        int[] nums = new int[N];
        
        // 둘째 줄의 정수들 담기
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        // 배열에 담기(int 형 변환)
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 셋째 줄 정수 찾기
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        // v 정수가 있으면 count 1씩 증가
        for(int i=0; i<N; i++){
            if(nums[i]==v) count++;
        }

        // 정수 v 수 출력
        System.out.println(count);
	}
}