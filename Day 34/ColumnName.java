class Solution
{
    String colName (long n) {
        String col = "";
        
        while(n != 0){
            long index = n % 26;
            
            if(index == 0) {
                col += 'Z';
                n -= 1;
            } else
                col += (char) ((index - 1) + 'A');
            
            n /= 26;
        }
        
        String rev = col;
        col = "";
        
        for(int i = rev.length() - 1; i >= 0; i--)
            col += rev.charAt(i);
        
        return col;
    }
}
