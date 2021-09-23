package programmers;

public class Level1_12948 {

    public String solution(String phone_number) {
        String answer = "";
        String [] arr = phone_number.split("");

        for(int i=0;i<arr.length;i++){
            if(i<arr.length-4){
                answer +="*";
            }else{
                answer += arr[i];
            }
        }
        return answer;
    }
    
}
