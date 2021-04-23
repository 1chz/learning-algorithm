package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

public class BOJ_14729 {
    public static void main(String[] args) throws Exception{
        DecimalFormat form = new DecimalFormat("#,###0.000");
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Float [] stdt_list = new Float[n];
        for(int i =0; i < n; i++){
            stdt_list[i] = (Float.parseFloat(br.readLine()));
        }
        Arrays.sort(stdt_list);
        for(int i =0; i < 7; i++){
            System.out.println(form.format(stdt_list[i]));
        }

    }
}
