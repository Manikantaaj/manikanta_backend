public class Pattern31 {
    /*           1
               1 2 1
             1 2 3 2 1
           1 2 3 4 3 2 1
         1 2 3 4 5 4 3 2 1 
         */
    public static void main(String args[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i - 1; j >= -(i - 1); j--) {
                if (j >= 0)
                    System.out.print(i - j);
                else
                    System.out.print(i + j);
            }
            System.out.println();
        }
    }
}
