import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17256 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        int az = Integer.parseInt(st.nextToken());

        int cx = Integer.parseInt(st2.nextToken());
        int cy = Integer.parseInt(st2.nextToken());
        int cz = Integer.parseInt(st2.nextToken());

        System.out.printf("%s %s %s" ,(cx-az),(cy/ay),(cz-ax));
        br.close();
    }
}
