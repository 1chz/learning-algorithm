import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ11022{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    for(int i = 1; i < tc+1; i++){
      String[] input = br.readLine().split(" ");
      System.out.println("Case #" + i +": "+ input[0] + " + " + input[1] + " = " + (Integer.parseInt(input[0]) + Integer.parseInt(input[1])));
    }
    br.close();
  }
}
