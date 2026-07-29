import java.util.*;

class Solution {
    public int solution(String s) {
        int xCount = 0;
        int not_xCount = 0;
        int wordPiece = 0;
        char x = '!';
        
        for(int i=0; i<s.length(); i++){
            //1.xCount가 0일 때의 x를 새 단어의 시작
            if(xCount == 0){
                x = s.charAt(i);
            }
            
            // 2. 개수 세기
            if(x == s.charAt(i)){
                xCount ++;
            } else {
                not_xCount ++;
            }
            // 3. 개수가 같아지면 단어 자르기
            if (xCount ==not_xCount){
                wordPiece ++;
                xCount = 0;
                not_xCount = 0;
            }
        }
        // 4. 반복문이 끝났는데 xCount가 0이 아니라면 단어 수 + 1
        if(xCount != 0 || not_xCount != 0){
            wordPiece++;
        } 
        return wordPiece;
    }
} 
                   