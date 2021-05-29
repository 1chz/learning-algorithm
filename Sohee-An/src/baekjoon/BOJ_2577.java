import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine())
                * Integer.parseInt(br.readLine())
                * Integer.parseInt(br.readLine());
        String numCnt = Integer.toString(number);
        br.close();

        for(int i=0; i < 10; i++) {
            int cnt = 0;
            for(int j=0; j<numCnt.length(); j++){
                if((numCnt.charAt(j) - '0') == i){
                    cnt++;
                }
            }
            System.out.print(cnt + "\n");
        }
    }
}