 
// * * * * * * * * *
//  * * * * *  *  *
//    *  *  * * *
//      *  *  *
//         *


 class Pattern18 {
    public static void main(String[] args) {
         

        for (int i = 5; i >= 1; i--) {
            // Printing spaces before stars
            for (int j = 1; j <= (5 - i); j++) 
                System.out.print("  ");
           
            // Printing stars in the first half of the row
            for (int j = 1; j <= i; j++) 
                System.out.print("* ");
            
            // Printing stars in the second half of the row
            for (int j = 1; j < i; j++) 
                System.out.print("* ");
            
            // Moving to the next line after each row
            System.out.println();
        }
    }
}

