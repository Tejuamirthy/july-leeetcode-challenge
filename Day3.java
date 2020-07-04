/*

There are 8 prison cells in a row, and each cell is either occupied or vacant.

Each day, whether the cell is occupied or vacant changes according to the following rules:

If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
Otherwise, it becomes vacant.


*/

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int n = 8;
        int[] temp = new int[8];
        for(int i = 1; i < 7; i++) {
            temp[i] = (cells[i-1]==cells[i+1]) ? 1:0;
        }
        cells[0] = 0; cells[7] = 0;
        if(N > 15) // pattern inside midddle 6 prison cells repeats after 15 days
            N = (N-1)%14 +1;
        while(N-- > 1) {
            for(int i = 1; i < 7; i++) {
                cells[i] = (temp[i-1] == temp[i+1]) ? 1:0;
                temp[i-1] = cells[i-1];
            }
            temp[6] = cells[6];
        }
        for(int i = 1; i < 7; i++) {
            cells[i] = temp[i];
        }
        cells[7] = 0;
        return cells;
    }
}
