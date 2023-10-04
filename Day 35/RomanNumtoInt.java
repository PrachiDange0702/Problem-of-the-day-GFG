class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int n=str.length()-1;
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int sum=0;
        int prev=0;
        for(int i=str.length()-1;i>=0;i--){
            int current=hm.get(str.charAt(i));
            if(current<prev){
                sum=sum-current;
            }
            else{
                sum=sum+current;
            }
            prev=current;
        }
        return sum;
    }
}
