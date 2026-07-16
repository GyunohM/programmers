import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        //1.해시맵 정의
        HashMap<String, Integer> map = new HashMap<>(phone_book.length);
        //2.해시맵에 전화번호 추가, value는 공통으로 1넣음
        for(String phoneNumber : phone_book){
            map.put(phoneNumber, 1);
        }
        //2. 이중 for문 : phone_book에서 하나씩 꺼내서 phoneNumber에 넣고 이어서
        //sb에 글자 하나씩 추가하며 해시맵에 해당 piece가 존재하는지 확인 
        //단 map.containsKey를 할때 i는 전화번호 - 1길이까지만 찾아야함.
        
        
        for( String phoneNumber : phone_book){
            StringBuilder sb = new StringBuilder(); 
            for(int i = 0; i < phoneNumber.length()-1 ; i++){
                sb.append(phoneNumber.charAt(i));
                if(map.containsKey(sb.toString())) {
                    return false;
                } 
        }
        
          }return true;
        }
}