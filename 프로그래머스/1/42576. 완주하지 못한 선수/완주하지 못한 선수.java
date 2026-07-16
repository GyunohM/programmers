import java.util.*;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //1 해시맵 정의
        HashMap<String,Integer> map = new HashMap<>();
        //2 완주자 배열을 해시맵에 삽입 이때 value에는 처음 삽입은 0 그리고 삽입할 이름(key가 ) 이미 key에 있다면 value + 1
        for(String name : completion){
            if(map.containsKey(name)){
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }
        //3. 참가자 배열을 앞에서부터 key(이름)을 꺼내서 완주자 맵에 존재하는지 비교하는데 이때 만약 해당 value가 0이거나 맵에 해당 key가 존재하지 않는다면 해당 참가자 배열 인덱스의 key를 리턴하고 value가 0이 아니면 해당 value -1을 함. 
        
        
        for(int i=0 ;i <= participant.length-1; i++){
            String key = participant[i];
            if(!map.containsKey(key) || map.get(key) == 0){
                return key;
            }
                else{
                    int value = map.get(key);
                    map.put(key, value -1);
                }
                
            }return "";
        }
    }