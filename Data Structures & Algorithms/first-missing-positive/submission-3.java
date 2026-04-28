class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        List<Integer>a=new ArrayList<>();
         Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) count++;
            else a.add(nums[i]);
        }
        if (a.size()==0) return 1;
        int l=nums.length-count;
        List<Integer>b=new ArrayList<>();
        for(int i=0;i<l;i++){
            b.add(i+1);
        }
        
       
        for(int i=0;i<b.size();i++){
            int d=0;
            for(int j=0;j<a.size();j++){
            if(a.get(j)==b.get(i)) d++;
        }
        
        mp.put(b.get(i),d);
        for(int k=0;k<mp.size();k++){
            if(mp.get(k+1)==0) return k+1;
            else if(mp.get(k+1)!=0 && (k+1)==b.size()) return k+2;
        }
        
    }
    return -1;
}}