class Solution {
    public int removeDuplicates(int[] nums) {
        int ind=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[ind]){
                ind++;
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
            }
        }
        return ind+1;
    }
}