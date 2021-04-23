import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_3190 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int board [][] = new int[n][n];
        int k =Integer.parseInt(br.readLine());
        for(int i =0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            board[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = 1;
        }
        int l =Integer.parseInt(br.readLine());
        Queue<String> time = new LinkedList();
        for(int i=0; i<l; i++){
            time.add(br.readLine());
        }
        int count =0;
        int col =0;
        int row = 0;
        int dir [][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int dir_count =0;
        int cur_dir[];
        int prev_col;
        int prev_row;
        st = new StringTokenizer(time.poll());
        int turn = Integer.parseInt(st.nextToken());
        LinkedList<int[]> snake_tail = new LinkedList();
        snake_tail.add(new int []{0,0});
        while(true){
            if(count == turn){
                String command = st.nextToken();
                if(!time.isEmpty()){
                    st = new StringTokenizer(time.poll());
                    turn = Integer.parseInt(st.nextToken());
                }
                if(command.charAt(0) == 'D'){
                    dir_count = (dir_count+1)%4;
                }else{
                    if(dir_count == 0){
                        dir_count = 3;
                    }else{
                        dir_count = (dir_count-1)%4;
                    }
                }
            }
            cur_dir = dir[dir_count];
            prev_col = col;
            prev_row = row;
            col += cur_dir[0];
            row += cur_dir[1];
            int temp[];
            if(!snake_tail.isEmpty()){
                temp = snake_tail.removeFirst();
            }else{
                temp = new int []{prev_col, prev_row};
            }
            board[temp[0]][temp[1]] = 2;
            if(col >= n || row >= n || col < 0 || row < 0 || board[col][row] == 2 ) {
                break;
            }
            if(board[col][row] == 1){
                snake_tail.addFirst(new int []{temp[0], temp[1]});
            }else{
                board[temp[0]][temp[1]] = 0;
            }
            snake_tail.addLast(new int []{col, row});
            board[col][row] = 2;
            count++;
        }
        System.out.println(count+1);
    }
}
