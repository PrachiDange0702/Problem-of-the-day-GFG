class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        String bin=Integer.toBinaryString(n);
        int len=bin.length()-1;
        if(k>len)
        {
            return false;
        }
        if(bin.charAt(len-k)=='0')
        {
            return false;
        }
        return true;
    }
    
}
