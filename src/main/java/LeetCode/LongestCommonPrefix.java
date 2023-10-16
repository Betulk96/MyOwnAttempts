package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static JavaPrograms.Utils.input;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        /*
        Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
*/
//Example 1:

        String []strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }




 public static  String longestCommonPrefix(String[] strs) {
     if (strs.length == 0) return "";

     String prefix = strs[0];
     for (int i = 1; i < strs.length; i++) {
         while (strs[i].indexOf(prefix) != 0) {
             prefix = prefix.substring(0, prefix.length() - 1);
         }
     }
     return prefix;


//   }
//public static String longestCommonPrefix(String[] v) {
//    StringBuilder ans = new StringBuilder();
//    Arrays.sort(v);
//    String first = v[0];
//    String last = v[v.length-1];
//    for (int i=0; i<Math.min(first.length(), last.length()); i++) {
//        if (first.charAt(i) != last.charAt(i)) {
//            return ans.toString();
//        }
//        ans.append(first.charAt(i));
//    }
//    return ans.toString();
}

}
