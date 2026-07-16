import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        //1.deque 선언
        Deque<Integer> dq = new ArrayDeque<>();
        //2.arr[] 를 dq에 추가
        for(int num : arr){
        if(dq.isEmpty()){
            dq.offerLast(num);
        } else{
        if(dq.peekLast() == num){
            continue;
        } else{
            dq.offerLast(num);
               }
            }
        }
        //3. dq에서 pollFirst();
        int[] answer = new int[dq.size()];
        int idx = 0;
        while(!dq.isEmpty()){
            answer[idx++]= dq.pollFirst();
        }
        
        return answer;
    }
}