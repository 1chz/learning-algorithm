import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Algo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if(h == 0) {
        	if(m < 45) {
        		m -= 45;
            	h -= 1;
            	m += 60;
            	if(h == -1) {
            		h = 23;
            	}
        	} else {
        		m -= 45; 
        	}
        	bw.write(h + " " + m);
        } else if(h >= 1) {
        	if(m < 45) {
        		m -= 45;
            	h -= 1;
            	m += 60;
        	} else {
        		m -= 45;
        	}
        	bw.write(h + " " + m);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}