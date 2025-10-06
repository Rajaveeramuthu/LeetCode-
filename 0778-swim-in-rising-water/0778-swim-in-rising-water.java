import java.util.*;

public class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] visited = new boolean[n][n];
        
        pq.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;
        
        int time = 0;
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int elevation = curr[0];
            int r = curr[1], c = curr[2];
            
            time = Math.max(time, elevation);

            if (r == n - 1 && c == n - 1) {
                return time;
            }
            
            for (int[] d : directions) {
                int nr = r + d[0];
                int nc = c + d[1];
                
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    pq.offer(new int[]{grid[nr][nc], nr, nc});
                }
            }
        }
        return -1;
    }
}