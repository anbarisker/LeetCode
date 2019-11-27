class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int currentValue=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=nums[currentValue])
                currentValue++;
            nums[currentValue]=nums[i];
        }
        return currentValue+1;
    }
}