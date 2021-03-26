package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
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
            Queue <int[]> queue = new LinkedList();
            Queue <int[]> queue2 = new LinkedList();
            int count =0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i<doc;i++){
                int temp[] = new int[2];
                temp[0] = i;
                temp[1] = Integer.parseInt(st.nextToken());
                queue.add(temp);
            }
//            while(!queue.isEmpty()){
//                int [] current = queue.poll();
//                boolean check = true;
//                if(!queue.isEmpty()) {
//                    while (queue.size() > 0) {
//                        int[] temp = queue.peek();
//                        if (current[1] < temp[1]) {
//                            queue.add(current);
//                            if (!queue2.isEmpty()) {
//                                queue.addAll(queue2);
//                            }
//                            check = false;
//                            break;
//                        } else {
//                            queue2.add(queue.poll());
//                        }
//                    }
//                }
//                if(check){
//                    count++;
//                    if(current[0] == index){
//                        break;
//                    }
//                }
//                if(queue2.size() >0){
//                    queue.addAll(queue2);
//                }
//            }
            System.out.println(count);
        }
    }
}
