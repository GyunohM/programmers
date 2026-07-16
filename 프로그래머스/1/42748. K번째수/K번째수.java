import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //1.결과값을 담을 result 배열 정의
        int[] result = new int[commands.length];
        //2.배열을 자르고 정렬한 후 result에 담음
        for(int i=0; i<commands.length; i++){
            int[] slicedArr = range(array, commands[i][0], commands[i][1]);
            
            Arrays.sort(slicedArr);
            
            result[i] = slicedArr[commands[i][2] - 1];
            
        }
        //3. 결과값 리턴
        return result;
    }
    
    //인덱스 범위만큼 배열을 자르는 메서드 정의
    public static int[] range(int[] array,int from,int to){
        int[] answer = new int[to - from + 1];
        int j=0;
        for(int i=from-1; i<to; i++){
            answer[j] = array[i];
            j++;
        }
        return answer;
    }
}