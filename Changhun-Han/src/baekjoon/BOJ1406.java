package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1406">
 * https://www.acmicpc.net/problem/1406
 * </a>
 */
public class BOJ1406 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        int N = parseInt(br.readLine());
        
        List<Character> list = new LinkedList<>();
        
        int length = s.length();
        for(int i = 0; i < length; i++) {
            list.add(s.charAt(i));
        }
        
        ListIterator<Character> cursor = list.listIterator();
        
        while(cursor.hasNext()) {
            cursor.next();
        }
        
        while(0 < N--) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch(c) {
                case 'L':
                    if(cursor.hasPrevious()) {
                        cursor.previous();
                    }
                    break;
                
                case 'D':
                    if(cursor.hasNext()) {
                        cursor.next();
                    }
                    break;
                
                case 'B':
                    if(cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                
                case 'P':
                    cursor.add(command.charAt(2));
                    break;
                
                default:
                    break;
            }
            
        }
        for(Character c : list) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
        br.close();
    }
    
}