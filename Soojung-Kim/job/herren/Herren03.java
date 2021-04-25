package job.herren;

import java.util.ArrayList;
import java.util.List;

/**
 * ### 3. 열려 있는 문
 *
 * 서로 다른 숫자로 된 배열 n개가 있다.
 *
 * 각각을 하나의 문이라 가정하면 m의 배수이면 문을 열거나 닫는다.(열려있으면 닫고 닫혀있으면 연다)
 *
 * n = {1,4,7,9,12,45,67,78,342}
 *
 * 1~n의최대값 까지 위의 작업(문을 여닫는 작업)을 진행한다.
 *
 * 최종적으로 열려있는 문은 어떤 숫자인가 ???
 *
 * ouput) {1,9}
 */
public class Herren03 {
    public static void main(String[] args) {

        int[] array = {1, 4, 7, 9, 12, 45, 67, 78, 342};
        boolean[] door = new boolean[array.length];

        for (int i = 1; i <= array[array.length-1]; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[j] % i == 0) {
                    door[j] = !door[j];
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < door.length; i++) {
            if (door[i]) {
                list.add(array[i]);
            }
        }
        System.out.println(list);
    }
}
