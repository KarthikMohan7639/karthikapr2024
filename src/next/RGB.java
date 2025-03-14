package next;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RGB {
    public static void main(String[] args) {
        String[] RGB={"Red","Green","Blue","Rose","Blood","Black"};


        String[] str1=new String[RGB.length];
        for (int i=0;i<RGB.length;i++){
            for (int j=0;j<RGB[i].length();j++){
                if(RGB[i].charAt(0)=='R' && RGB[j].charAt(0)=='R') {
                    str1[i] = RGB[i];
                    str1[i + 1] = RGB[j];
                }
            }
        }
        for (int i=0;i<str1.length;i++){
            System.out.println(str1[i]);
        }

    }
}
