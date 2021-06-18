public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();

		if(str.equals(reverse)) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}
}