class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int>v;
        for(int i=0;i<(2*nums.size());i++){
            v.push_back(nums[i%nums.size()]);
        }
        //  for(int i=0;i<nums.size();i++){
        //     v.push_back(nums[i]);
        // }

        return v;
    }
};