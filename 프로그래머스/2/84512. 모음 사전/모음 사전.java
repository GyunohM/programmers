import java.util.*;

class Solution {
    // 탐색할 모음 배열과 결과를 담을 리스트
    String str = "AEIOU";
    ArrayList<String> arr = new ArrayList<>();

    public int solution(String word) {       
        permutation("");
        
        // indexOf는 0부터 시작하므로 +1을 하여 순서를 반환
        return arr.indexOf(word) + 1;
    }

    public void permutation(String current) {
        // 1. 액션: 빈 문자열이 아닐 때만 완성된 단어로 취급하여 저장
        if (!current.equals("")) {
            arr.add(current);
        }
        
        // 2. 종료 조건: 단어의 최대 길이인 5(str.length())에 도달하면 가지치기
        if (current.length() == str.length()) {
            return;
        }

        // 3. 재귀 반복: A, E, I, O, U 순서대로 글자를 붙여가며 DFS 탐색
        for (int i = 0; i < str.length(); i++) {
            permutation(current + str.charAt(i));
        }
    }
}