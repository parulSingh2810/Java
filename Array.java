/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author adarsh
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          /*    float   [] marks ={92, 92, 78, 89, 90}
                String [] students ={"Parul ","Rohan","Shubham","Lovish"};
              System.out.println( students[2]);
          */      

        int []marks = {98, 45, 67, 45, 90}

      //System.out.println(marks.length);
        
        // Displaying the Array (Naive Way)
        System.out.println("Printing using Naive way   ");        
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        
        //Displaying the array(for loop)
        System.out.println("Printing using for loop");
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        } 
        //Displaying the array in reverse order(for loop)
         System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        } 
        
        //Displaying the array (for-each loop)
         System.out.println("Printing using for-each loop in ");
        for(int element: marks){
            System.out.println(element);
        } 
        
        
                
         
    }
    
}
