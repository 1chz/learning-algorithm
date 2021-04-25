// 소수 만들기
class Solution {
     static int answer = 0;

    public static void backTracking(int[] nums, int sum, int depth, int count){
        if(count == 3){
            boolean flag = false;
            for (int i = 2; i < sum; i++) {
                if(sum % i == 0)
                    flag = true;
            }
            if(!flag)
                answer++;
            return;
        }

        depth++;
        if(depth <= nums.length){
            backTracking(nums ,sum+nums[depth-1], depth, count+1);
            backTracking(nums, sum, depth, count);
        }

    }
    
    public int solution(int[] nums) {
        backTracking(nums, 0, 0, 0);
        return answer;
    }
}