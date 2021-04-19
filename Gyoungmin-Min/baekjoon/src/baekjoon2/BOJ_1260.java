package baekjoon2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
    static boolean[] visit;
    static int[][] map;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static int V;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = sParseInt(st.nextToken()); // 1~1000
        M = sParseInt(st.nextToken()); // 1~10000
        V = sParseInt(st.nextToken()); // 1~N
        //방문확인용
        visit = new boolean[N+1];
        map = new int[N+1][N+1];
        //간선.
        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int temp1 = sParseInt(st.nextToken());
            int temp2 = sParseInt(st.nextToken());
            map[temp1][temp2] = 1;
            map[temp2][temp1] = 1;
        }
        dfs(V);
        System.out.println(sb.toString());
        Arrays.fill(visit,false);
        sb = new StringBuilder();
        bfs(V);
        System.out.println(sb.toString());
    }

    private static int sParseInt(String str){
        return Integer.parseInt(str);
    }

    public static void dfs(int number){
        visit[number] = true;
        sb.append(number+" ");
        for(int i =1; i<N+1; i++){
            if(!visit[i] && map[number][i] == 1){
                dfs(i);
            }
        }
    }

    public static void bfs(int number){
        visit[number] = true;
        Queue<Integer> queue = new LinkedList();
        queue.offer(number);
        while(!queue.isEmpty()){
            int temp = queue.poll();
            sb.append(temp+" ");
            for(int i =1; i<N+1; i++){
                if(!visit[i] && map[temp][i] == 1){
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}
