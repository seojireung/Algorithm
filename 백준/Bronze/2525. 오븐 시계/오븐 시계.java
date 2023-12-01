// 조리 시간(cook), 분 (minute)
// 1. cook 60 이상일 때 (cook/60은 hour에, cook%60은 minute에 더하기) / 아닐 때
// 2. (cook 계산까지 한) minute이 60 이상일 때 hour + 1
// 2-1. hour +1 할 때, hour이 23 이면 0 출력 / 아니면 hour + 1 출력
// 3. hour + (cook/60) 이 24 이상이면 24 빼주기
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 시, 분
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        // 조리 시간
        int cook = Integer.parseInt(br.readLine());

        // 조리 시간 60분 이상이면 시, 분 나눠서 계산
        if(cook >= 60){
            
            // 분 단위 먼저 계산
            // 분 + 조리 시간 중 분 단위 합산
            minute += (cook%60);
            
            // 분 단위 합이 60이상이면 시 단위로
            if(minute >= 60){
                
                // 자정 넘어가는 경우
                if(hour == 23) hour = 0;
                // 기본은 hour + 1
                else hour++;
                
                minute -= 60;
            }
            
            // 시 단위 (자정 넘어가는 거 계산)
            hour += (cook/60);
            if(hour >= 24) hour -= 24;
            
        // 조리 시간 60분 미만이면 분 단위 계산
        } else{
            
            minute += cook;
            
            // 위에 분 단위 복붙
            if(minute >= 60){
                
                if(hour == 23) hour = 0;
                else hour++;
                
                minute -= 60;
            }
        }

        System.out.print(hour + " " + minute);

        br.close();
    }
}