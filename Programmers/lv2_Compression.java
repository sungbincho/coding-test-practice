// 프로그래머스 lv2_압축

package Programmers;

import java.util.*;

public class lv2_Compression {
    public static void main(String[] args) {
        String msg = "TOBEORNOTTOBEORTOBEORNOT";
        Solution_compression cp = new Solution_compression();
        int[] resultArr = cp.solution(msg);
        System.out.println(Arrays.toString(resultArr));
    }
}

class Solution_compression {
    public int[] solution(String msg) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        int idx = 1;

        for(char i = 'A'; i<='Z'; i++)
            hs.put(i+"", idx++);

        int size = msg.length();
        for(int i = 0; i < size; i++){
            int a = 1;

            while(i+a<=size && hs.containsKey(msg.substring(i,i+a)))
                a++;

            if(i+a>size){
                ans.add(hs.get(msg.substring(i)));
                break;
            }

            ans.add(hs.get(msg.substring(i,i+a-1)));
            hs.put(msg.substring(i,i+a),idx++);
            if(a>1)
                i+=a-2;
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            result[i] = ans.get(i);

        return result;
    }
}