
class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here    
        // XOR of two numbers will give a number with set bits at the positions where the bits are different
        int xorResult = m ^ n;
        
        // If both numbers are the same, return -1
        if (xorResult == 0) {
            return -1;
        }
        
        // Find the position of the rightmost set bit in the XOR result
        int position = 1;
        while ((xorResult & 1) == 0) {
            xorResult >>= 1;
            position++;
        }
        
        return position;
    }
}


