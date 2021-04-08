/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi_dim_array;

/**
 *
 * @author adarsh
 */
public class Multi_dim_array {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] marks; // A 1-D Array
        int [][] flats; // A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        
        // Displaying the 2-D Array(for loop)
        System.out.println("Printing a 2-d array using for loop");
        for( int i=0;i<flats.length;i++){
         for( int j=0;j<flats[i].length;j++) {
         System.out.print(flats[i][j]);
          System.out.print(" ");
                }
         System.out.println("\n");
        }
    }
    
}
