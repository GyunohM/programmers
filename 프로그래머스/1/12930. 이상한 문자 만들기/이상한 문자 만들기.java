import java.util.*;

class Solution {
    public String solution(String s) {
        // sb 생성
        StringBuilder sb = new StringBuilder();
        //공백을 만날 때 마다 다음 나올 단어의 인덱스를 0으로 초기화 할 count 변수 정의
        int count = 0;
        
        for(int i=0; i<s.length(); i++){
            //문자열을 문자로 쪼갬
            char singleWord = s.charAt(i);
            //짝수이고 소문자이면 대문자로 변환
            if((count%2==0) && singleWord>= 97 && singleWord <=122){
                singleWord = (char)(singleWord - 32);
            }
            //홀수이고 대문자이면 소문자로 변환
            if((count%2==1) && singleWord <= 90 && singleWord >=65){
                singleWord = (char)(singleWord + 32);
            }
            //공백을 만나면 count = 0으로 초기화하고 공백이 아니면 count(단어 인덱스) 증가
            if(singleWord != ' '){
                count++;
        } else {
                count = 0;
            } 
        sb.append(singleWord);
        }
        
    return sb.toString();
    }
}