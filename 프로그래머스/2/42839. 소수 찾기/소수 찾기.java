import java.util.*;

class Solution {
   //중복 제거를 위해 해시셋을 사용
    HashSet<Integer> set = new HashSet<>();
    
    //메인 함수
    public int solution(String numbers) {
    //현재까지 이어붙여 만든 문자열을 ""로 초기화
    String prefix = "";
    //방문 여부 체크 배열
    boolean[] visited = new boolean[numbers.length()];
        //소수의 개수 담을 변수
        int count = 0;
        //재귀 시작 조건 정의
        permutation("",visited, numbers);
        //해시셋에 저장된 모든 문자열의 경우의 수를 isPrime()함수로 판별하여 개수 리턴
        for(int value: set){
            if(isPrime(value)){
                count++;
            }
        }
        return count;
    }
    
    public void permutation(String prefix, boolean[] visited, String numbers){
        // 종료조건
        if(!prefix.equals("")){
            set.add(Integer.valueOf(prefix));
        }
        //재귀 반복
        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                permutation(prefix + String.valueOf(numbers.charAt(i)),
                            visited, numbers);
                
                //원상복구 (백트래킹)
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime(int n){
        // 0과 1일 경우 소수에서 제외
        if(n < 2){
            return false;
        }
        //2이상일 경우 2부터 n의 제곱근까지 반복문으로 소수 찾기
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        //끝까지 나누어 떨어지지 않았다면 소수
        return true;
    }
}