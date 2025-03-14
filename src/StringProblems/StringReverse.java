package StringProblems;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String s="Hello";
        String s1=stringReverse(s);
        String s2=stringReverse1(s);
        String s3=manStringReverse(s);
        String s4=reverseRecursively(s);
        System.out.println(s4);
    }

    public static String reverseRecursively(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    private static String manStringReverse(String s) {
        char[] c=s.toCharArray();
        int left=0,right=c.length-1;
        while(left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        return new String(c);
    }

    public static String stringReverse(String s) {
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public static String stringReverse1(String s) {
        StringBuilder rev=new StringBuilder(s);
        return rev.reverse().toString();
    }
}
