import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1021 {
    public static void main(String[] args) throws Exception{
        LinkedList<Integer> list = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int count =0;
        for (int i =1; i<=n;i++){
            list.add(i);
        }
        for (int i =0; i<m; i++){
            int temp = Integer.parseInt(st.nextToken());
            int head = list.peek();
            int target = list.indexOf(temp)+1;
            int size= list.size();

            if(head != temp){
                if(Math.abs(1 - target) < (size - target +1)){
                    while(head != temp){
                        list.offer(list.removeFirst());
                        head = list.peek();
                        count++;
                    }
                    list.removeFirst();
                }else{
                    while(head != temp){
                        list.addFirst(list.removeLast());
                        head = list.peek();
                        count++;
                    }
                    list.removeFirst();
                }
            }else{
                list.removeFirst();
                continue;
            }
        }
        System.out.println(count);

    }

}