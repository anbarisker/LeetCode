class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()<1) return 0;
        int nI = 0;
        int j = 0;
        boolean check = false;
        for(int i = 0 ; i < haystack.length(); i++)
        {
            if(nI<needle.length())
            {
            if(haystack.charAt(i) == needle.charAt(nI))
            {
                nI++;
                if(check == false)
                {
                    j = i;
                    check = true;
                }
            }
                else if(nI>0){
                    check = false;
                    nI=0;
                    i=j;
        
                    
                }
            }
        }
        if(nI != needle.length()) j = -1; 
        
            return j;
    }
}