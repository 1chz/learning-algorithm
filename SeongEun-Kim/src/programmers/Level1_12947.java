package programmers;

public class Level1_12947 {

    public boolean solution(int x) {

        // 사용자가 입력한 값을 split을 이용해 배열에 담는다
        // 배열의 길이만큼 반복문을 실행하고 값들을 더한다
        // 사용자가 입력한 값 % 더해진 값 == 0 이면 true 그게 아니라면 false를 반환한다.

        boolean answer = true;
        int test = 0;
        String [] xArr = (x+"").split("");

        for(int i=0;i<xArr.length;i++){
            test += Integer.parseInt(xArr[i]);
        }

        return x % test == 0 ? true:false;
    }

}
