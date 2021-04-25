// 스킬트리
import java.util.ArrayList;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] skillSet = skill.split("");
        for (String skill_tree : skill_trees) {
            ArrayList<String> list = new ArrayList<>();
            String[] set = skill_tree.split("");
            boolean flag = false;
            for (String s : set) {
                if(skill.contains(s))
                    list.add(s);
            }

            for (int i = 0; i < list.size(); i++) {
                if(!list.get(i).equals(skillSet[i])){
                    flag = true;
                    break;
                }
            }

            if(!flag)
                answer++;
        }
        return answer;
    }
}