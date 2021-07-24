import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, String> colors = new HashMap<String, String>();
        colors.put("black", "0,1");
        colors.put("brown", "1,10");
        colors.put("red", "2,100");
        colors.put("orange", "3,1000");
        colors.put("yellow", "4,10000");
        colors.put("green", "5,100000");
        colors.put("blue", "6,1000000");
        colors.put("violet", "7,10000000");
        colors.put("grey", "8,100000000");
        colors.put("white", "9,1000000000");

        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();

        String value = colors.get(color1).split(",")[0] + colors.get(color2).split(",")[0];
        long result = Long.valueOf(value) * Long.valueOf(colors.get(color3).split(",")[1]);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}