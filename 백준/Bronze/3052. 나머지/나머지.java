import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            ){
            // 나머지수 관리용, 중복제거
            Set<Integer> list = new HashSet<>();
            
            // 나누는 수
            int divisor = 42;
            
            // 한 줄씩 읽고 나누기
            String line;
            while ((line = br.readLine()) != null){
                int num = Integer.parseInt(line);
                list.add(num % divisor);
            }// for ends
            
            // 서로 다른 나머지 몇 개인지 출력
            String answer = String.valueOf(list.size());
            bw.write(answer);
            bw.flush();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }// main ends
}// class ends