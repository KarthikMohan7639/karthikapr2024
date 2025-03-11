
package arr;

import java.util.Arrays;

public class ArrayLeftRot {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int d=2;
        System.out.println(Arrays.toString(arrayLeftRot(a,d)));
    }

    private static int[] arrayLeftRot(int[] a, int d) {
        int len=a.length;
        int newIndex;
        int result[]=new int[len];
        for(int i=0;i<len;i++){
            newIndex=(i+len-d)%len;
            result[newIndex]=a[i];
        }
        return result;
    }

}
