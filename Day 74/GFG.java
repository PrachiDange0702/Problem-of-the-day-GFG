class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String a, String b)
    {
        // Your code here
        int n = a.length();
        
        // Check if lengths of both strings are equal
        if (n != b.length())
            return false;
        
        // Check if 'b' can be obtained by rotating 'a' clockwise by 2 places
        String clockwiseRotation = a.substring(n - 2) + a.substring(0, n - 2);
        if (clockwiseRotation.equals(b))
            return true;
        
        // Check if 'b' can be obtained by rotating 'a' anti-clockwise by 2 places
        String anticlockwiseRotation = a.substring(2) + a.substring(0, 2);
        return anticlockwiseRotation.equals(b);
    }
    
}
