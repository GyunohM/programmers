import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        //시작 조건(0번 인덱스부터 시작, 누적합은 0부터 시작)
        return dfs(numbers, target, 0, 0);
    }
        
        //dfs(재귀)
    public int dfs(int[] numbers, int target, int index, int currentSum){
            //종료조건
        if(index == numbers.length){
            return currentSum == target ? 1 : 0;  
            }
            
        int[] signs = {1, -1};
        int answer = 0;
            
            //중복 순열 이므로 반복문 없이 index + 1로 재귀 호출(덧셈 뺄셈 기호는 중복해서 사용가능하므로 visited 불필요)
            //다음 수를 더할 것인지 뺼 것인지는 sings[i] 를 다음수에 곱하여 반복문으로 재귀 분기
            //sings를 만들기 않고 for문 없이 다음수를 더하는 재귀와 빼는 재귀를 각각 작성하는 방법도 있음
        for(int i = 0; i < 2; i++){
            answer += dfs(numbers, target, index + 1, currentSum + (signs[i] * numbers[index]));
        }
        return answer;
    }
}