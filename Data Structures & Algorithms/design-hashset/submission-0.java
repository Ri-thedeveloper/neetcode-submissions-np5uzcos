class MyHashSet {
        ArrayList<Integer>a=new ArrayList<>();
        int size=0;
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(!contains(key)){
        a.add(key);
        size++;}
    }
    
    public void remove(int key) {
        a.remove(Integer.valueOf(key));
        size--;
    }
    
    public boolean contains(int key) {
        for(int b:a){
            if(b==key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */