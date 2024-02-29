class Solution {
   /* public int islandPerimeter(int[][] grid) {
        if(grid.length==1&&grid[0].length==1){return 4;}
        int perimeter = 0;
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1){
                    grid[i][j]=5;
                }
            
               
                if (grid[i][j] > 0) {
                    if (i + 1 < grid.length && grid[i + 1][j] > 0)
                        grid[i][j]--;
                    if (i - 1 >= 0 && grid[i - 1][j] > 0)
                        grid[i][j]--;
                    if (j + 1 < grid[0].length && grid[i][j + 1] > 0)
                        grid[i][j]--;
                    if (j - 1 >= 0 && grid[i][j - 1] > 0)
                        grid[i][j]--;
                }

            
            }
        }
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
               if(grid[i][j]>0)  perimeter+=grid[i][j]-1;
            }
        }

        return  perimeter;
    } */
    
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}