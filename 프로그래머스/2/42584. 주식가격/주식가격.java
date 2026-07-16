import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int pastIndex = stack.pop();
                    answer[pastIndex] = i - pastIndex;
                    
                }
            stack.push(i);
            
            }

        while(!stack.isEmpty()){
            int pastIndex = stack.pop();     
            answer[pastIndex] = (prices.length-1) - pastIndex; 
        }
        return answer;
        }
}
      
    