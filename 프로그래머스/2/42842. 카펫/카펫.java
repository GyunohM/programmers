import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        int total = brown + yellow;
        //i는 세로 길이(최소 3부터 전체의 제곱근까지 탐색)
        for(int i = 3; i <= Math.sqrt(total); i++){
            //약수일 때만 검사
            if(total % i == 0){
                int width = total / i;
                int height = i;
                //타일의 개수가 일치하는지 확인
                if((width * 2) + (height * 2) - 4 == brown && (width - 2) * (height - 2) == yellow){
                //정답을 찾으면 즉시 리턴
                return new int[]{width, height};
                }
            }     
        }
        return new int[]{};
    }
}