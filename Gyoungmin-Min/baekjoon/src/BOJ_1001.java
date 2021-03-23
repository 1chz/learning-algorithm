import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1001 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sr = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(sr.nextToken());
        int b= Integer.parseInt(sr.nextToken());
        System.out.println(a-b);

    }
}
