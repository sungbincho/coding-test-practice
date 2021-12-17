// 프로그래머스 lv2_스킬트리

package Programmers;

public class lv2_Skill_tree {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        Solution_skill_tree st = new Solution_skill_tree();
        System.out.println(st.solution(skill, skill_trees));
    }
}

class Solution_skill_tree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String str : skill_trees) {
            String temp = str;

            for (int i = 0; i < str.length(); i++) {
                String s = str.substring(i, i+1);
                if (!skill.contains(s))
                    temp = temp.replace(s, "");
            }

            if (skill.indexOf(temp) == 0)
                answer++;
        }

        return answer;
    }
}
