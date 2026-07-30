import java.util.*;

class Solution {
    public int solution(String s) {
        
        //최악의 경우의 길이로 초기화
        int answer = s.length();
        //step은 자르는 범위이고 step의 길이는 s길이의 절반까지임
        for(int step=1; step<=s.length()/2; step++){
            //prev(이전문자)를 인덱스의 맨 처음에 나오는 문자로 초기화
            String prev = s.substring(0, step);
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
        for(int j=step; j<s.length(); j+=step){
            //맨 마지막으로 자를 문자가 s의 길이를 초과하지 못하게 end 변수로 제어
            int end = Math.min(j+step, s.length());
            //현재 차례에서 자른 문자를 current변수에 삽입
            String current = s.substring(j, end);
            //이전문자와 현재문자가 같으면 count만 +1하고 다르다면 sb에 append
            //sb.append 할때 count가 2이상이면 count + prev하고 1이면 count는 생략하고
            //prev만
            if(prev.equals(current)){
                count++;
            } else {
                if(count>=2){
                    sb.append(count);
                } 
                sb.append(prev);
                prev = current;
                count = 1;
            }

        }   
            //substring(분할)하지 못하고 남은 문자를 sb에 append
            if(count>=2){
                    sb.append(count);
                } 
                sb.append(prev);
            //현재 반복문 차례의 sb이 길이와 answer(이전 길이의 최소값)을 비교하여 작은것으              로 갱신
            answer = Math.min(answer, sb.length());
    }

        return answer;
    }
}