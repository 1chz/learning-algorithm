package leetcode;

public class LC_400 {
	
	public static void main(String[] args) {
		System.out.println(findNthDigit(25));
	}
	
	public static String findNthDigit(int n){
		// 1 - 9: count 9
		// 10 - 99: count 90
		// 100 - 999: count 900
		long max = 9;
		long min = 1;
		long digits = 1; // 자릿수
		//Find the range of the number for the given digit
		// 주어진 숫자의 범위 찾기
		// 15 => 범위는 10(최소) 부터  90(최대)
		while (n > digits * max) { // n이 자릿수 * 최댓값보다 같거나 작아질 때까지 반복
			n -= (digits * max); // n에서 자릿수 * 최댓값을 뺌 => 15 - 9 = 6
			digits++; // 2
			max *= 10; // 90
			min *= 10; // 10
		}
		
		// [10, 11, 12, ...]
		// 10의 오프셋은 0이어야 하므로 (n-1)을 사용하여 counting index를 0으로 만든다
		// 실제 숫자 구하기
		String num = (int)(min + ((n-1)/digits)) + ""; // 12
		int index = (int)((n-1) % digits); // 1
		
		return num;
	}

}
