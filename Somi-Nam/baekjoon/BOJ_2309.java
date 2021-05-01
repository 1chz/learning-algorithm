package baekjoon;

import java.io.*;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/2309">
 * https://www.acmicpc.net/problem/2309
 * </a>
 */
public class BOJ_2309 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] dwarf = new int[9];
		int allSum = 0;
		for (int i = 0; i < dwarf.length; i++) {
			dwarf[i] = Integer.parseInt(br.readLine());
			allSum += dwarf[i];
		}
		Arrays.sort(dwarf); // 다른 방법은
		
		int[] notDwarf = new int[2];
		for (int i = 0; i < dwarf.length; i++) {
			for (int j = i + 1; j < dwarf.length; j++) {
				if(100 + dwarf[i] + dwarf[j] == allSum) {
					notDwarf[0] = i;
					notDwarf[1] = j;
					break;
				}
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < dwarf.length; i++) {
			if(i == notDwarf[0] || i == notDwarf[1]) continue;
			builder.append(dwarf[i]).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}

}
