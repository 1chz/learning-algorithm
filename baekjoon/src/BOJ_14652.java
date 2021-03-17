import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14652 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        outer:
        for (int i =0; i<N; i++){
            for (int j=0; j<M; j++){
                if (count == K){
                    System.out.printf("%s %s",i,j);
                    break outer;
                }
                count+=1;
            }
        }

    }
}
