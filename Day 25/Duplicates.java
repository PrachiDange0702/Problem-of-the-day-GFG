class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i+=count)
        {
            count=0;
            for(int j=i;j<n;j++)
            {
                if(arr[i]!=arr[j])
                {
                    break;
                }
                count++;
            }
            if(count>1)
            {
                a.add(arr[i]);
            }
        }
        if(a.isEmpty())
        {
            a.add(-1);
            return a;
        }
        return a;
    }
}
