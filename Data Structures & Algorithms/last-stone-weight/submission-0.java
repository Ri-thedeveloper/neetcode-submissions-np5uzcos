class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:stones){
            p.add(a);
        }
        while(p.size()>1){
            int x=p.poll();
            int y=p.poll();
        
        if(y!=x){
            p.add(x-y);
        }}
        return p.isEmpty()?0:p.peek();
    }}

