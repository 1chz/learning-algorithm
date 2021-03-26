import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i =0; i<N;i++){
            sb.append(isVPS(br.readLine().split("")) +"\n" );
        }
        System.out.println(sb.toString());
    }
    public static String isVPS(String[] x){
        String result ="YES";
        int left [] = new int[x.length];
        int index =1;
        try {
            for (int i =0; i<x.length; i++){
                if (x[i].equals("(")){
                    left[index] = index;
                    index++;
                }else{
                    if (left[index-1] != 0){
                        left[index-1] = 0;
                        index--;
                    }else{
                        result = "NO";
                        break;
                    }

                }
            }
            if (index != 1){
                result = "NO";
            }
        }catch (Exception e){
            result = "NO";
        }

        return result;
    }
}
