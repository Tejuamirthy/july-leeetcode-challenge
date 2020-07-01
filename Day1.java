// You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

// Given n, find the total number of full staircase rows that can be formed.

class ArrangingCoins {
    public int arrangeCoins(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            n -= i;
            count++;
        }
        return count;
    }
    
    public int secondApp(int n) {
        int i = 0;
        int j = n;
        long k;

        long curr;
        while (i <= j) {
          k =(int)(i + (j - i) / 2);
          curr = k * (k + 1) / 2;

          if (curr == n) return (int)k;

          if (n < curr) {
            j = (int)k - 1;
          } else {
            i = (int)k + 1;
          }
        }
        return j;
    }
}
