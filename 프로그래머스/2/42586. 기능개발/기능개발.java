import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //1.큐 정의
        ArrayDeque<Integer> que = new ArrayDeque<>();
        //2.남은 일수 계산후 큐에 삽입
        int idx = 0;
        for(int num : progresses){
            que.offer((int)Math.ceil((100.0 - num) / speeds[idx]));
            idx++;
            }
    
        //3.큐에서 poll해서 최종 배포시 작업 개수를 배열에 삽입
        int count = 0;
        idx = 0;
        int [] answer = new int[progresses.length];
        while(!que.isEmpty()){
            int maxtime = que.peek();
                while(!que.isEmpty() && maxtime >= que.peek()){
                count++;
                que.poll();
            }
                    answer[idx] = count;
                    idx++;
                    count = 0;
                    }
        
        int [] print = new int[idx];   
        for(int i=0; i<idx; i++){         
            print[i] = answer[i];
        }
        return print;
            }
    }