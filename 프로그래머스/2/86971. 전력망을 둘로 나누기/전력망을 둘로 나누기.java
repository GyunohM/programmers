import java.util.*;

class Solution {
    
    int count;
    boolean[][] graph;
    boolean[] visited;
    
    public int solution(int n, int[][] wires) {
        
        int minDifference = Integer.MAX_VALUE;
        
        graph = new boolean[n+1][n+1];
        
        //초기 전력망 상태 기록
        for(int i = 0; i < wires.length; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            graph[v1][v2] = true;
            graph[v2][v1] = true;
        }
        
        //노드 끊기
        for(int i = 0; i < wires.length; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            graph[v1][v2] = false;
            graph[v2][v1] = false;
            
            count = 0;
            visited = new boolean[n+1];
        
            //끊어진 두 전력망 중 하나의 전력망(v1)의 노드 개수 구하기
            dfs(v1, n);
            
            //두 전력망의 노드 개수 차이의 절댓값 구하기
            int diff = Math.abs(count - (n - count));
            
            //최소 노드 개수 차이를 갱신
            minDifference = Math.min(minDifference, diff);
            
            //새로운 노드를 끊기 위해 전력망 연결 여부 초기화
            graph[v1][v2] = true;
            graph[v2][v1] = true;
        }
        
        return minDifference;
    }
    
    public void dfs(int current, int n){
        //액션
        visited[current] = true;
        count++;
        
        for(int i = 1; i <= n; i++){
            if(graph[current][i] == true && !visited[i]){
                dfs(i, n);
            }
        }
    }    
}