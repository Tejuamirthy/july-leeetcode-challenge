// Write a program to find the n-th ugly number.
// Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.


class Solution {
    public int nthUglyNumber(int n) {
        if(n <= 6)
            return n;
        int x = 1;
        int[] arr = new int[n];
        arr[0] = 1;
        int iter2 = 0, iter3 = 0, iter5 = 0;
        int f2 = 2, f3 = 3, f5 = 5;
        while(x < n) {
            arr[x] = Math.min(f2, Math.min(f3 ,f5));
            if(arr[x] == f2) {
                iter2++;
                f2 = arr[iter2]*2;
            }
            if (arr[x] == f3) {
                iter3++;
                f3 = arr[iter3]*3;
            }
            if(arr[x] == f5) {
                iter5++;        
                f5 = arr[iter5]*5;
            }
            x++;
        }
        return arr[n-1];
    }
}
