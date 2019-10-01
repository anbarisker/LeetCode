class Solution {
    public boolean isPalindrome(int x) {
        if(x <0){
            return false;
        }
        else{
        int reversed = 0, remainder, original = x;
        while(x != 0) {
        remainder = x % 10; // reversed integer is stored in variable
        reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
        x  /= 10;  //the last digit is removed from num after division by 10.
        }
    // palindrome if original and reversed are equal
        if(original == reversed)
        {
            return true;
        }
        }
        return false;
   // return original == reversed;
    }
}

public class MainClass {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            boolean ret = new Solution().isPalindrome(x);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}