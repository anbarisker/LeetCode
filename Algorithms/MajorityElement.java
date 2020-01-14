class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> data = new HashMap<Integer, Integer>();
        int highestValue = 0;
        int highestKey = 0;
        int temp = 0;
        for(int i = 0; i<nums.length; i++) {
            if(data.containsKey(nums[i])) {
                temp = data.get(nums[i]);
                data.put(nums[i],++temp);
            }
            else {
                data.put(nums[i],1);
                temp = 1;
            }
            if(highestValue<temp)
            {
                highestValue = temp;
                highestKey = nums[i];
                
            }
        }
        return highestKey;
       
    }
}