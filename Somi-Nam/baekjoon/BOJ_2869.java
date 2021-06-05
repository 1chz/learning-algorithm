package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/2869">
 * https://www.acmicpc.net/problem/2869 �����̴� �ö󰡰� �ʹ�
 * </a>
 */
public class BOJ_2869 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] read = br.readLine().split(" ");
		int A = Integer.parseInt(read[0]); // ���� �ö󰡴� ����
		int B = Integer.parseInt(read[1]); // �㿡 �������� ����
		int V = Integer.parseInt(read[2]); // �ö󰡾��� ����
		br.close();
		
		int height = V - B; // ����� ���� ���� ���� (�̲������� ������ -B)
		int day = height / (A - B);
		if(height % (A - B) != 0) { // �ö󰡾��� ���̰� ������
            day++;
        }
	        
		System.out.println(day);
	}
}
