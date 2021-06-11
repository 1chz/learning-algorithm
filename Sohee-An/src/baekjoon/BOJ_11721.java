import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		for(int i = 0; i < str.length(); i++) {
			if(i % 10 == 0 && i != 0) {
				System.out.print("\n");
			}
			System.out.print(str.charAt(i));
		}
	}
}