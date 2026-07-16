import java.util.*;

class Solution {
    public int solution(int[] citations) {
        //오름차순으로 정렬
        Arrays.sort(citations);
        int h = 0;
        //i : 인용되는 논문 권수
        for(int i=1; i<=citations.length; i++){
            if(citations[citations.length - i] >= i){
                h = i;
            } else { 
            break;
            }
        }
        
        return h;
    }
}