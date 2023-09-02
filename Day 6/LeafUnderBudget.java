class Solution{
    public int getCount(Node node, int bud)
    {
        int count = 0;
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        getnodes(node,l1,1);
        Collections.sort(l1);
        for(int i=0;i<l1.size();i++) {
            if(bud>=l1.get(i)) {
                count++;
                bud = bud-l1.get(i); 
            }
        }
        return count;
    }
    
    public void getnodes(Node node,ArrayList<Integer> l1,int level) {
        if(node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            l1.add(level);
        }
        getnodes(node.left,l1,level+1);
        getnodes(node.right,l1,level+1);
    } 
}
