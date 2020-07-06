// Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length, i = n-1;
        while(i >= 0) {
            if(digits[i] < 9) {
                break;
            }
            i--;
        }
        if(i == -1) {
            int[] res = new int[n+1];
            res[0] = 1;
            return res;
        } else {
            digits[i]++;
            i++;
            while(i < n) {
                digits[i++] = 0;
            }
        }
        return digits;
    }
}
