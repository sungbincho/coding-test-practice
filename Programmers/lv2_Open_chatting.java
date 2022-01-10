// 프로그래머스 lv2_오픈채팅방

package Programmers;

import java.util.*;

public class lv2_Open_chatting {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        Solution_open_chatting oc = new Solution_open_chatting();
        System.out.println(Arrays.toString(oc.solution(record)));
    }
}

class Solution_open_chatting {
    public String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        Map<String,String> userId = new HashMap<>();

        for(int i=0;i<record.length;i++){
            String[] temp=record[i].split(" ");

            if(temp[0].equals("Enter")){
                userId.put(temp[1],temp[2]);
                list.add(temp[1]+"님이 들어왔습니다.");
            }
            else if(temp[0].equals("Leave")){
                list.add(temp[1]+"님이 나갔습니다.");
            }
            else if(temp[0].equals("Change")){
                userId.replace(temp[1],temp[2]);
            }
        }

        String[] answer=new String[list.size()];
        for(int i=0;i<list.size();i++){
            int idx=list.get(i).indexOf("님");
            String id=list.get(i).substring(0,idx);
            answer[i]=userId.get(id)+list.get(i).substring(idx);
        }

        return answer;
    }
}