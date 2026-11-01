class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            int len=0;
            int ele=nums[i];
            while(ele>0){
                int digit=ele/10;
                ele=ele/10;
                len++;
            }
            if(len%2==0){
                count++;
            }

        }
        return count;
    }
}