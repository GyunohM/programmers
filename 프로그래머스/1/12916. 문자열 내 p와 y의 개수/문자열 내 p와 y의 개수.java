import java.util.*;

class Solution {
    boolean solution(String s) {
        char[] charArray = new char[s.length()];
        charArray = s.toCharArray();
        int score_p = 0;
        int score_y = 0;
        for(char str : charArray){
            if(str =='p' || str =='P'){
                score_p++;
            } else if (str == 'y' || str =='Y'){
                score_y++;
            }
        }
        return score_p == score_y;
        
        
    }
}