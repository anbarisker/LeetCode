class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length<1) {
            return 0;
        }
       HashSet<Integer> set = new HashSet<Integer>();
       for(int i:nums){
           if(set.contains(i)){
               set.remove(i);
           }
           else {
               set.add(i);
           }
       }
      
           for(int i:set) {
               return i;
           }
        return 0;
    }
}