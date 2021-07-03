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
		
		int T = Integer.parseInt(br.readLine());
		int R = 0;
		String S = "";
		
		for(int i=0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			R = Integer.parseInt(st.nextToken());
			S = st.nextToken();
			
			for(int j=0; j < S.length(); j++) { // 문자열
				for(int k=0; k < R; k++) { // 반복횟수
					bw.write(S.charAt(j));
				}
			}
			bw.write("\n");
		}
        bw.flush();
        bw.close();
        br.close();
    }
}