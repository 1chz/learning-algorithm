import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        
        String reverseA = "";
        for(int i = A.length()-1; i >= 0; i--) {
        	reverseA += A.charAt(i);
        }
        
        String reverseB = "";
        for(int i = B.length()-1; i >= 0; i--) {
        	reverseB += B.charAt(i);
        }
        
        if(Integer.parseInt(reverseA) < Integer.parseInt(reverseB)) {
        	bw.write(reverseB);
        } else {
        	bw.write(reverseA);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}