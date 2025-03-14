public class Sol {
    public static void main(String[] args) {
        String str="dadbaddad";
//        totSteps(str);
        int res=totSteps(str);
        System.out.println(res);
    }
String str="aaaaa";
public static int totSteps(String s) {
    int count=0;
    int len=s.length();
    for(int i=0;i<len-1;i++){
        if(s.charAt(i)==s.charAt(i+1)){
            count++;
        }

    }
    for(int i=len-1;i>0;i--){
        if(s.charAt(i)==s.charAt(i-1)){
            count++;
        }
    }

   return count;
}

}
