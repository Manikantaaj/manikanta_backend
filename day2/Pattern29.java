public class Pattern29 {
    
    /*                A
                     ABA
                    ABCBA
                   ABCDCBA
                  ABCDEDCBA
    */
    public static void main(String args[]) {
        int n = 5; 
        int i, j, k;
        
        for (i = 0; i < n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = i; j >= -i; j--) {
                if (j < 0)
                    System.out.print((char) (i + j + 65));
                else
                    System.out.print((char) (i - j + 65));
            }
            System.out.print("\n");
        }
    }
}
