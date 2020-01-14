class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m+n;
        int[] mergeArray = new int[total];
        int j =0;
        int t = 0;
       if(n>0) {
        for(int i = 0; i<nums1.length; i++)
        {   
            
            if(j<n)
            {
                
                if(nums1[i]<nums2[j] && i<m)   { // 1 < 2
                    mergeArray[t] = nums1[i]; // 1
                    t++; // 1
                    
                    
                }
                else if(nums1[i] == nums2[j]) { // 2 == 2
                    mergeArray[t] = nums1[i]; // 2
                    mergeArray[t+1] = nums2[j]; // 2
                    j++; //
                    t = t+2;
                
                }
                else if(nums1[i]>nums2[j]) {
                    mergeArray[t] = nums2[j];
                    //mergeArray[t+1] = nums1[i];
                    j++;
                    t++;
                    i--;
                    
                }
                else if (nums1[i]==0) {
                    mergeArray[t] = nums2[j];
                    j++;
                    t++;
                  
                }
            }
            else {
                    if(nums1[i] != 0)
                    {
                    mergeArray[t] = nums1[i]; // 1
                    t++; // 1 
                    }
                
            }
            
        }
           for(int i=0; i<mergeArray.length; i++)
           {
                nums1[i] = mergeArray[i];
           }
            mergeArray = null;
       }
    }   
}