import java.io.*;

class Solution {
    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < a; i++) {
                sb.append("*");
            }
            
            String str = sb.toString();
            
            for (int i = 0; i < b; i++) {
                bw.write(str + "\n");
            }
            
            bw.flush();
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}