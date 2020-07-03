/*

There are 8 prison cells in a row, and each cell is either occupied or vacant.

Each day, whether the cell is occupied or vacant changes according to the following rules:

If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
Otherwise, it becomes vacant.

// solution fails at maximum case when n is 10^9

*/

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int n = 8, cycle = 1;
        int[] temp = new int[8];
        for(int i = 1; i < 7; i++) {
            temp[i] = (cells[i-1]==cells[i+1]) ? 1:0;
        }
        while(N-- > 1) {
            for(int i = 1; i < 7; i++) {
                cells[i] = (temp[i-1] == temp[i+1]) ? 1:0;
                temp[i-1] = cells[i-1];
            }
            temp[6] = cells[6];
        }
        cells[7] = 0;
        return cells;
    }
}
