import java.util.*;

class Solution {
    public boolean solution(String s) {
        int length = 0;
        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i);
            if((int)num >= 48 && (int)num <=57){
                length++;
            } else { 
                return false;
            }        
        }   return (length == 4 || length == 6);
    }
}