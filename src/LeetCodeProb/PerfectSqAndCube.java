package LeetCodeProb;

public class PerfectSqAndCube {


    public static void main(String[] args) {
        int num=64;


        PerfectSqAndCube p=new PerfectSqAndCube();
        if((Math.pow(p.isPerfectCube(num),3))==(Math.pow(p.isPerfectSq(num),2))){
            System.out.println(num+ " is both perfect sqr and cube ");
        }
    }

    private int isPerfectSq(int num) {
        int sqrnum=0;
        if(num>1){
            sqrnum=(int)Math.sqrt(num);
        }
        return sqrnum;
    }

    private int isPerfectCube(int num) {
        int cubenum=0;
        if(num>1){
             cubenum=(int)Math.cbrt(num);
        }
        return cubenum;
    }


}

