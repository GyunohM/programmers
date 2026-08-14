import java.util.*;

class Solution {
    //문자열 "AEIOU"생성
    String str = "AEIOU";
    
    //정렬한 단어를 저장할 arraylist
    ArrayList<String> arr = new ArrayList<>();
    
    //메인 메서드
    public int solution(String word) {       
        permutation("");
    
        return arr.indexOf(word) + 1;
        
    }
    
    //중복 정렬 재귀 메서드
    public void permutation(String current){
        //액션조건
        if(!current.equals("")){
            arr.add(current);
        }
        //종료조건
        if(current.length() == str.length()){
            return;
        }
        
        //재귀 반복
        for(int i=0; i<str.length(); i++){
            permutation(current + str.charAt(i));
                }
    }
}
                