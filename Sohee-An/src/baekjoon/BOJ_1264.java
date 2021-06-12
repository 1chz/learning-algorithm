import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp[] = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};
		int cnt = 0;

		while(true) {
			String str = br.readLine();
			String strArr[] = str.split("");
			
			if(str.equals("#")){
				br.close();
				return;
			}
			
			for(int i = 0; i < strArr.length; i ++) {
				for(int j = 0; j < exp.length; j++) {
					if(strArr[i].equals(exp[j])) {
						cnt++;
					}
				}
			}
		    System.out.println(cnt);
			cnt = 0;
		}
	}
}