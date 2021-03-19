import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.printf("%s %s %s %s %s %s",1-Integer.parseInt(st.nextToken()),1-Integer.parseInt(st.nextToken()),
                2-Integer.parseInt(st.nextToken()),2-Integer.parseInt(st.nextToken()),2-Integer.parseInt(st.nextToken()),8-Integer.parseInt(st.nextToken()));

    }
}
