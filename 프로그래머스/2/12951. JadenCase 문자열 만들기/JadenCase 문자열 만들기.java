import java.util.*;

class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        
        int i=0;
        while(i<s.length()){
        if(s.charAt(i) != ' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
                i++;
            while(i<s.length() && s.charAt(i) != ' '){
                sb.append(s.charAt(i));
                    i++;
                    }        
            } else { 
            while (i<s.length() && s.charAt(i) == ' '){
                sb.append(s.charAt(i));
                i++;
                    }
                }
            }
            return String.valueOf(sb);
        }
}