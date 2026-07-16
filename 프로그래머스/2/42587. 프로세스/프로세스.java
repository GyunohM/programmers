import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        ArrayDeque<Integer> que = new ArrayDeque<>();
        // 1 큐에 인덱스 삽입
        for(int i=0; i<priorities.length; i++){
            que.offer(i);
        }
        
        int current = 0;
        int run = 0;
        int max = 0;
        while(!que.isEmpty()){
            current = que.poll();
            max = current;
            // 2 큐 전체를 순회하며 더 높은 우선순위가 있는지 확인
            for(int idx : que){
                if(priorities[max] < priorities[idx]){
                    max = idx;
                }
            }
            // 3 현재 꺼낸 프로세스가 가장 우선순위가 높다면 실행
                if(max == current){
                    run++;
                    // 실행한 프로세스가 location인지 확인
                    if(current == location){
                        break;
                    }
                    // 4 우선순위가 더 높은 프로세스가 있다면 다시 큐 뒤로 이동
                } else{
                    que.offer(current);
                }
            
            } return run;
            
}
}