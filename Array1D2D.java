public class Array1D2D {
    public static void main(String[] args) {
         // Array 1D
         int[] array1D = {5, 12, 1, 1, 12, 7};
         // Array 2D
         int[][] array2D = {
             {3, 4, 10, 12},
             {8, 10, 12, 5}
         };
       // Output 1D
       System.out.println("- Output 1D:");
       int count1 = 1;
       for (int i = 0; i < array1D.length; i++) {
           for (int j = i + 1; j < array1D.length; j++) {
               if (array1D[i] == array1D[j]) {
                   System.out.println("\nElemen ganda " + count1 + ": " + array1D[i]);
                   System.out.println("Lokasi : [" + i + "] dan [" + j + "]");
                   count1++;
               }
           }
       }

       // Output 2D
       System.out.println("\n- Output 2D:");
       int count2 = 1;
       for (int i1 = 0; i1 < array2D.length; i1++) {
           for (int j1 = 0; j1 < array2D[i1].length; j1++) {
               for (int i2 = i1; i2 < array2D.length; i2++) {
                   int jStart = (i1 == i2) ? j1 + 1 : 0;
                   for (int j2 = jStart; j2 < array2D[i2].length; j2++) {
                       if (array2D[i1][j1] == array2D[i2][j2]) {
                           System.out.println("\nElemen ganda " + count2 + ": " + array2D[i1][j1]);
                           System.out.println("Lokasi : [" + i1 + "][" + j1 + "] dan [" + i2 + "][" + j2 + "]");
                           count2++;
                       }
                   }
               }
           }
       }
   }
}
    
