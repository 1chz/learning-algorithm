// 1076번 저항(Bronze 2)

// 제출 결과 [메모리: 14796KB 시간: 136ms]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ_1076 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        String firstColor = br.readLine();
        String secondColor = br.readLine();
        String thirdColor = br.readLine();

        long resistence = Integer.parseInt(map.get(firstColor).toString() + map.get(secondColor));


        if (thirdColor.equals("black"))
            System.out.println(resistence);
        else {
            int multiply = 1;
            for (int i = 0; i < map.get(thirdColor); i++) {
                multiply = multiply * 10;
            }
            System.out.println(resistence * multiply);
        }
        br.close();
    }
}
