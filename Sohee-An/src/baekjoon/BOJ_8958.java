import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(br.readLine());
        String ox[] = new String[tCase];

        for(int i=0; i < tCase; i++){
            ox[i] = br.readLine();
        }
        br.close();

        for(int i=0; i<ox.length; i++) {
            int cnt = 0;
            int sum = 0;
            for(int j=0; j<ox[i].length(); j++){
                if(ox[i].charAt(j) == 'O'){
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.print(sum + "\n");
        }
    }
}