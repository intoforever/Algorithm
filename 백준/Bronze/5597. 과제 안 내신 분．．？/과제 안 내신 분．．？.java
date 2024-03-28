import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            
            // 리스트 생성
            List<String> studentList = new ArrayList<>();
            
            // 학생리스트 채우기
            for(int i=0; i<30; i++){
                studentList.add(String.valueOf(i+1));
            }
            
            // 입력 읽어서 학생 리스트에서 1명씩 제거
            String line;
            while((line = br.readLine()) != null) {
                studentList.remove(line);    
            }
            
            // 출력
            int idx0 = Integer.parseInt(studentList.get(0));
            int idx1 = Integer.parseInt(studentList.get(1));
            if (idx0 > idx1) {
                bw.write(studentList.get(1)+"\n");
                bw.write(studentList.get(0)+"\n");
            } else {
                bw.write(studentList.get(0)+"\n");
                bw.write(studentList.get(1)+"\n");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        
        
    }// main ends
}// class ends