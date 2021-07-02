import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        while(true) {
        	List<Integer> arr = new ArrayList<>();
            int cnt = 0;
            
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
            	int num = Integer.parseInt(st.nextToken());
            	if(num == -1) {
            		bw.flush();
                    bw.close();
                    br.close();
            		return;
            	}
            	arr.add(num);
            }
            Collections.sort(arr);
            	
        	for(int i=0; i < arr.size(); i++) {
                for(int j=0; j < arr.size(); j++) {
                	if(i == 0 && j == 0) {
                		continue;
                	}
                	
                    if(arr.get(i)*2 == arr.get(j)) {
                        cnt++;
                    }
                }
            }
        	bw.write(cnt + "\n");
            cnt = 0;
        }
    }
}