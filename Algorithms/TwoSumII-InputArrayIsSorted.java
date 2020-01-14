class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int[] value = new int[2];
        if(numbers.length<1) return new int[]{0};
        else{
        for(int i=0; i<numbers.length; i++) {
            for(int j =numbers.length-1; j>i; j--) {
                if(numbers[i]<=numbers[j] && numbers[i]+numbers[j]==target) {
                    value[0] = i+1;
                    value[1] = j+1;
                }
            }
        }
        }
        return value;
    }
}