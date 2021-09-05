package baekjoon;

public class BOJ_15596 {
	
	long sum(int[] a) {
        long ans = 0;
        for(int i : a) {
        	ans += i;
        }
        return ans;
    }
}