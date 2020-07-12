// Reverse bits of a given 32 bits unsigned integer.

public class ReverseBits {
    public int reverseBits(int n) {
        if(n == 0)
            return 0;
        int ans = 0;
        
        for(int i = 1; i < 32; i++) {
            if((n & 1) == 1) {
                ans |= 1;
            }
            
            ans <<= 1;
            n >>= 1;
        }
        
        if((n&1) == 1)
            ans |= 1;
        return ans;
    }
}
