import java.util.*;

class Solution {
    public String solution(String s) {
        Integer arr[] = new Integer[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = (int)s.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append((char)num);
        }
        return sb.toString();
    }
}