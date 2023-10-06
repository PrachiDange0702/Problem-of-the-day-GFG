class Solution
{
    public static void rearrange(Node odd)
    {
       if(odd.next == null || odd.next.next == null) return;
        Node curr = odd;
        int cnt = 1;
        while(curr.next!=null){
            curr = curr.next;
            cnt++;
        }
       Node first = odd;
       Node prev = null;
       Node second = first.next;
       while(first.next != null && second.next != null){
           first.next = second.next;
           first = second.next;
           second.next = prev;
           prev = second;
           second = first.next;
       }
       if(cnt%2 == 0){
            second.next = prev;
       }
       else{
            first.next = prev;
       }
    }
}
