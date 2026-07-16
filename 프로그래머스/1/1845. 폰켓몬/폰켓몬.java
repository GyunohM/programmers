import java.util.*;

class Solution {
    public int solution(int[] nums) {
        //1. hashset 변수 정의
        HashSet<Integer> set = new HashSet<>(nums.length);
        //2. 배열 nums의 데이터를 set에 추가함
        
        for(int num : nums){
            set.add(num);
        }
        //3. set의 크기(set안의 데이터 개수)가 배열안의 데이터개수보다 크거나 같으면
        //(배열길이/2)를 반환하고 작으면 set의 크기를 반환
        return Math.min(set.size(), nums.length /2);
        }
    }
        
        