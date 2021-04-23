import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        for(int i=0; i<5; i++){
            int stu = sc.nextInt();
              
            if(stu < 40) stu = 40;
                sum += stu;
        }
		System.out.println(sum/5);
		sc.close();
    }
}