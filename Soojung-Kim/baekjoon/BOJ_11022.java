package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_11022 {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n;
        String str;

        str = scanner.nextLine();
        n = Integer.parseInt(str);

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            str = scanner.nextLine();
            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Case #");
            sb.append(i + 1);
            sb.append(": ");
            sb.append(list.get(i).split(" ")[0]);
            sb.append(" + ");
            sb.append(list.get(i).split(" ")[1]);
            sb.append(" = ");
            sb.append(Integer.parseInt(list.get(i).split(" ")[0]) +  Integer.parseInt(list.get(i).split(" ")[1]));
            System.out.println(sb.toString());
        }

    }
}
