class Solution {
    public int orangesRotting(int[][] grid) { 
        int fresh = 0;
        int time = 0;
        Queue<int[]> q = new ArrayDeque<>();
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
            }
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty() && fresh > 0){
            int length = q.size();
            for(int i = 0;i<length;i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] dir : directions){
                    int row = r + dir[0];
                    int col = c + dir[1];
                    if(row >= 0 && col >= 0 && row<grid.length && col < grid[0].length && grid[row][col] == 1){
                        grid[row][col] = 2;
                        q.offer(new int[]{row,col});
                        fresh--;
                    }

                }
            }
            time++;
        }
        return fresh == 0?time:-1;
        
    }
}
