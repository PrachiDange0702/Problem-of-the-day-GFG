class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        for(int i=1; i<=N; i++){
            tmap.put(i,0);
        }
        for(int ele : arr){
            if(tmap.containsKey(ele)){
              int oldFreq = tmap.get(ele);
              tmap.put(ele,oldFreq+1);
            }
        }
        int j=0;
        for(Integer key : tmap.keySet()){
            int ele = tmap.get(key);
            arr[j] = ele;
            j++;
        }
        
    
    }
}
