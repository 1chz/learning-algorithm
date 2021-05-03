package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ2960 {

	public static void main(String[] args) {
		try {
			BOJ2960 cl = new BOJ2960();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			int n = Integer.parseInt(input.split(" ")[0]);
			int k = Integer.parseInt(input.split(" ")[1]);
			
			int pn = cl.returnKPrimeNum(n, k);
			
			System.out.println(pn);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int returnKPrimeNum(int n, int k) {
		int result = 0;
		
		// 2���� N���� ��� ���� ����
		int[] arr = new int[n-1];
		for(int i = 2; i <= n; i++) {
			arr[i - 2] = i;
		}
		
		// P�� P�� ��� �����
		int count = 1; // ���� ���� ����
		int p = 0; // ������ ���� �� �� ���� ������
		boolean findP = true; // P���� ��������
		Map<Integer, Integer> pn = new HashMap<Integer, Integer>(); //<����, ���� ��>
		
		while(count <= k) {
			// P����
			findP = true;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) { // ������ ���� ��
					if(findP) { // P �Ҽ� ����
						p = arr[i];
						pn.put(count++, p);
						arr[i] = 0;
						findP = false;
						continue;
					}
					if(arr[i] % p == 0) { // P�� ���
						pn.put(count++, arr[i]);
						arr[i] = 0;
					}
				}
			}
		}
		
		result = pn.get(k);
		
		return result;
	}

}
