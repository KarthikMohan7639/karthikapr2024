package PatternProgramming;

public class Pattern {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 5; i++) {

//            System.out.println();
//        }
        int n=3;

        for (int i = 1; i <= n-1; i++) {


            for (int j =i; j<n; j++) {
                Thread.sleep(500);
                System.out.print("  ");
            }

            for (int j = 1; j <=i; j++) {
                Thread.sleep(500);
                System.out.print("* ");
            }

            for(int j=1;j<i;j++){
                Thread.sleep(500);
                System.out.print("* ");
            }
            Thread.sleep(500);
            System.out.println();
        }

        for (int i = 1; i <=n; i++) {
            // Left increasing spaces

            for (int j = 1; j < i; j++) {
                Thread.sleep(500);
                System.out.print("  ");
            }
            Thread.sleep(500);
            // Left decreasing stars
            for (int j = i; j <= n; j++) {
                Thread.sleep(500);
                System.out.print("* ");
            }

            // Right decreasing stars

            for (int j = i; j < n; j++) {
                Thread.sleep(500);
                System.out.print("* ");
            }

            // Move to the next line
            Thread.sleep(500);
            System.out.println();
        }


    }
}
