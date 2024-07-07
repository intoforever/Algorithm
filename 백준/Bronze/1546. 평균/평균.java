import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            double num = Double.parseDouble(br.readLine()); // 과목갯수
            String[] arr = br.readLine().split(" "); // 과목 별 점수
            // int len = arr.length;
            List<Double> list = new ArrayList<>();
            for (String a : arr) {
                list.add(Double.parseDouble(a));
            }
            
            list.sort((a, b) -> Double.compare(b, a));
            Double max = list.get(0); // 최고 점수
            Double answer = 0.0;
            
            for (double a : list) {
                answer += a/max*100;
            }
            
            answer = answer/num;
            
            bw.write(""+answer);
            bw.flush();
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends