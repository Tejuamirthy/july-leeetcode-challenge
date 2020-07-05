// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
// Given two integers x and y, calculate the Hamming distance.

class Solution {
    public int hammingDistance(int x, int y) {
        int temp = x ^ y; // xor operation results in setting the different bits to 1
        int count = 0;
        while(temp > 0) {
            count += temp & 1;
            temp >>= 1; // right shift by one bit
        }
        return count;
    }
}
