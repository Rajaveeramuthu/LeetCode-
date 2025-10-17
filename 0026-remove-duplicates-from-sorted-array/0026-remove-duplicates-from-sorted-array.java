class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int sum=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[sum]){
                sum++;
                nums[sum]=nums[i];
            }
        }
        return sum+1;
    }
}