class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	Node temp=null;
	Node t=null;
	temp=head;
	    if(x==1)
	    {
	        head=head.next;
	        return head;
	    }
	    for(int i=1;i<x;i++)
	    {
	        t=temp;
	        temp=temp.next;
	    }
	    t.next=temp.next;
	    return head;
	    
    }
}
