import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        //1.큐 정의
        ArrayDeque<Integer> que = new ArrayDeque<>();
        //time : 경과시간
        //totalWeight : 다리 위 트럭 총량
        //index: 다리에 진입하는 트럭
        int time = 0;
        int totalWeight = 0;
        int index = 0;
        
        //2.큐를 빈공간 0 으로 채움
        for(int i=0; i<bridge_length; i++){
            que.offer(0);
        }
        
        //3.마지막 트럭이 다리에 진입하기 전까지 로직 수행
        while(index < truck_weights.length){
            time++;
            
            totalWeight -= que.poll();
            
            //이제 막 진입할 트럭의 무게와 다리위 트럭의 총중량의 합이 지탱가능한 무게보다 작               을 때
            if(totalWeight + truck_weights[index] <= weight){
                //트럭을 진입시킴
                que.offer(truck_weights[index]);
                //총중량을 추가시킴
                totalWeight += truck_weights[index];
                //다음 트럭을 다리위에 올려 검사하기 위해 인덱스 증가
                index++;
                //지탱무게 제한으로 인해 트럭이 진입할 수 없을 때
            } else {
                //더미 데이터 0 추가
                que.offer(0);
            }
            
        } return time + bridge_length;
    }
}
