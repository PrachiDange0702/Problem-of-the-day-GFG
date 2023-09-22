class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
          ArrayList<Integer > list =new ArrayList<>(2);
          helper(arr,list,x,0,n-1);
          
          return list;
          
    }
        static void helper(int[] arr,ArrayList<Integer> list,int x,int st,int end){
            if(st>end)
               return;
            
            if(x>arr[end] || x<arr[st]){
               list.add(-1);
               list.add(-1);
               
               return;
            }
            int mid=st+(end-st)/2;
            if(arr[mid]==x)
            {
                
                int first=mid;
                while( first >=st && arr[first]==x)
                {
                    first=first-1;
                }
                     first=first+1;
    
                int curr=mid;
                 while(curr <=end && arr[curr]==x)
                {
                    curr=curr+1;
                }
                if(curr==end && arr[curr]==x)
                     curr=curr;
                 else 
                     curr=curr-1;
                
                list.add(first);
                list.add(curr);
                
                return;
                
            }
            else if(arr[mid]<x)
                 helper(arr,list,x,mid+1,end);
            
            else
                helper(arr,list,x,st,mid-1);
            
        }
}
