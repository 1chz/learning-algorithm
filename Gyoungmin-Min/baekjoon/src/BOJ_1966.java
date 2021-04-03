import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1966 {
    StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int test_case =0; test_case<n;test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int doc = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            LinkedList <int[]> queue = new LinkedList();
            int count =0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i<doc;i++){
                int temp[] = {i, Integer.parseInt(st.nextToken())};
                queue.add(temp);
            }
            for1:
            while(true){
                int head[] = queue.peek();
                for(int i=1; i<queue.size();i++){
                    if(queue.get(i)[1] > head[1]){
                        queue.offer(queue.removeFirst());
                        continue for1;
                    }
                }
                if(head[0] == index){
                    break;
                }else{
                    queue.removeFirst();
                }
                count++;
            }
            System.out.println(count+1);
        }
    }
}