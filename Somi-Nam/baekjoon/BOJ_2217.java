package baekjoon;

import java.io.*;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/2217">
 * https://www.acmicpc.net/problem/2217 ����
 * </a>
 */
public class BOJ_2217 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] rope = new int[N];
		for (int i = 0; i < rope.length; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rope);
		br.close();
		
		int best = rope[rope.length - 1];
		
		for (int i = 0; i < rope.length; i++) {
			int ropeLenght = rope[rope.length - i - 1];
			int newbest = (ropeLenght * (i + 1));
			if(newbest >= best) {
				best = newbest;
			}
		}
		System.out.println(best);
		
		// �ű�
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(br.readLine());
//
//        int rope[] = new int[10001];
//        int min = 10001;
//        int max = -1;
//
//        for(int i = 0; i < n; i++){
//            int weight = Integer.parseInt(br.readLine());
//            if(weight < min) min = weight; //min�� ���� ���� �߷��� ��ĥ�� �ִ� ����
//            if(weight > max) max = weight; //max�� ���� ���� �߷��� ��ĥ�� �ִ� ����
//            rope[weight]++;
//        }
//
//        int prevWeight = min;
//        int line = n;
//        int maxWeight = prevWeight * n;//maxWeight�� �������� �̿��Ͽ� ���ø� �� �ִ� ��ü�� �ִ� �߷�
//        line -= rope[prevWeight];
//
//        for(int i = prevWeight + 1; i <= max; i++){
//            if(rope[i] > 0){
//                if(maxWeight < i * line)
//                    maxWeight = i * line;
//                line -= rope[i];
//            }
//        }
//
//        bw.write(String.valueOf(maxWeight + "\n"));
//        bw.flush();
//
//        br.close();
//        bw.close();
	}

}
