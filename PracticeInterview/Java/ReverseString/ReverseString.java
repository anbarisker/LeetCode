import java.io.*;
import java.util.*;
public class ReverseString{
    public static void main(String[] args) {
        reverseString("hi");
    }

    static void reverseString(String str) {
        char[] strToChar = new char[str.length()];
        int index = 0;
        for(int i = str.length()-1; i>=0; i--) {
            strToChar[index++] = str.charAt(i);
            System.out.println(strToChar[index-1]);
        }
        /*for(int i = strToChar.length-1; i>=0; i--){
            System.out.println(strToChar[i]);
        }*/
    }
}