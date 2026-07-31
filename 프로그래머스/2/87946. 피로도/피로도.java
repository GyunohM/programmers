import java.util.*;

class Solution {
    //최대 던전 수를 0으로 초기화
    int maxCount = 0;
    public int solution(int k, int[][] dungeons) {
        
        //방문 체크 배열 정의
        boolean[] visited = new boolean[dungeons.length];
        //탐험 경로 저장 배열 정의
        int[] out = new int[dungeons.length];
        //재귀(백트래킹-dfs) 시작지점
        permutation(0, dungeons, visited, out, k);
        
        return maxCount;
    }
    //재귀함수 정의
    public void permutation(int depth,int[][] dungeons,boolean[] visited,
                           int[] out, int k){
        //종료조건 정의
        if(depth == dungeons.length){
            int count = 0;
            for(int i : out){
                if(k >= dungeons[i][0]){
                    k -= dungeons[i][1];
                    count++;  
                }
            }
            maxCount = Math.max(maxCount, count);
            return;
        }
        //반복 재귀 호출 정의
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = i;
                permutation(depth+1, dungeons, visited, out, k);
                visited[i] = false;
            }
        }
    }
}