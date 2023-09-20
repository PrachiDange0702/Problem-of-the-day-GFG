class Solution {
    
    ArrayList<Integer> rotate(int N, int D) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int binaryLength = 16; // Assuming N is stored using 16 bits
        
        // Ensure D is in the range [0, binaryLength)
        D = D % binaryLength;
        
        // Convert N to binary string
        String binaryN = Integer.toBinaryString(N);
        while (binaryN.length() < binaryLength) {
            binaryN = "0" + binaryN;
        }
        
        // Perform left rotation
        String leftRotatedBinary = binaryN.substring(D) + binaryN.substring(0, D);
        int leftRotatedDecimal = Integer.parseInt(leftRotatedBinary, 2);
        result.add(leftRotatedDecimal);
        
        // Perform right rotation
        String rightRotatedBinary = binaryN.substring(binaryLength - D) + binaryN.substring(0, binaryLength - D);
        int rightRotatedDecimal = Integer.parseInt(rightRotatedBinary, 2);
        result.add(rightRotatedDecimal);
        
        return result;
    }
}
