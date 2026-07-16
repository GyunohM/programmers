import java.util.*;

class Solution {
    boolean solution(String s) {
        //stack 정의
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        //문자열을 문자로 바꿔서 스택에 push 및 pop
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
            stack.push(c);
            } else if ( c == ')' && stack.isEmpty()){
                return false;
            }
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();  
            }
        }
        //스택이 비었으면 true 문자가 남아있으면 false
        return stack.isEmpty();
    } 
}