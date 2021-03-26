// 15596번 정수 N개의 합(Bronze 2)

// 제출 결과 [메모리: 422968KB 시간: 44ms]
public class BJ_15596 {

    long sum(int[] a) {
        long ans = 0;
        for (int i : a) {
            ans += i;
        }
        return ans;
    }
}