import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_11948 {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = getReader();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[2000001];

        int N = Integer.parseInt(reader.readLine());
        for(int i = 0; i<N; i++) {
            arr[Integer.parseInt(reader.readLine()) + 1000000]++;
        }
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[i]; j++){

                writer.write(i-1000000+"n");
            }
        }
        writer.flush();
    }
    public static BufferedReader getReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }
}