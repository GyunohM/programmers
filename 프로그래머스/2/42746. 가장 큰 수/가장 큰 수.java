import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        //1.numbers의 데이터를 string으로 형변환해서 string 배열에 담음
        String[] strNumbers = new String[numbers.length];
            for(int i=0; i<numbers.length; i++){
                strNumbers[i] = String.valueOf(numbers[i]);
            }
        //2. 커스텀 정렬 (앞 뒤를 합쳤을 때 비교해서 더 큰 수를 내림차순)
        Arrays.sort(strNumbers, (o1 , o2) -> (o2 + o1).compareTo(o1 + o2));
        
        //3.예외 : 배열 맨 앞이 0이면 0 리턴
        if(strNumbers[0].equals("0")){
            return "0";
        }
        // 4. stringbuilder에 담음
        StringBuilder answer = new StringBuilder();
        for(String str : strNumbers){
            answer.append(str);
        }
        // 5. string으로 변환
        return answer.toString();
        }
    }
