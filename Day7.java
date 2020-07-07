// You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.

// Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

// The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.


class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length, c = grid[0].length, count = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(grid[i][j] == 1)
                    count += sidesFromOneCell(grid, i, j, r, c);
            }
        }
        return count;
    }
    
    public int sidesFromOneCell(int[][] grid, int i, int j, int r, int c) {
        int count = 0;
        
        if(i > 0 && grid[i-1][j] == 1)
            count++;
        if(j > 0 && grid[i][j-1] == 1)
            count++;
        if(i < r-1 && grid[i+1][j] == 1)
            count++;
        if(j < c-1 && grid[i][j+1] == 1)
            count++;
        return 4-count;
    }
}

//  ____ _____ _____
// | 1  |  0  |  1  |
//  ____ _____ _____
// | 1  |  1  |  1  |
//  ____ _____ _____
// 12 is the perimeter for this testcase
//  ____       _____
// | 1  |     |  1  |
//       _____  
// | 1     1     1  |
//  ____ _____ _____
