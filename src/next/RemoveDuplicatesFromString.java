package next;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String s = " It is a good morning ";
        boolean b=s.matches("It is a good morning");
       Integer i= s.lastIndexOf('g');
        System.out.println(i);

    }
}

//    public static void removeDuplicates(String str) {
//        boolean[] seen = new boolean[Character.MAX_VALUE];
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar = Character.toLowerCase(str.charAt(i)); // Convert to lowercase
//            if (!seen[currentChar]) {
//                seen[currentChar] = true;
//                result.append(str.charAt(i)); // Append the original character
//            }
//        }
//        System.out.println(result.toString());
//    }
//    public static void removeDuplicates2(String str) {
//        String res="";
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar = str.charAt(i);
//            if (res.indexOf(currentChar) == -1) {
//                res = res + currentChar;
//            }
//        }
//        System.out.println(res);
//    }
//}
