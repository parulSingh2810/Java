/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps_practice_set_6;

/**
 *
 * @author adarsh
 */
public class Ps_practice_set_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 1.calculate the array of 5 floats and calculate the sum.
        float [] marks ={45.7f,6.9f, 48.9f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);
                
        
        // 2. Write a program to find out whether a given integer is present in an array or not.
        float []marks ={45.7f, 6.9f, 48.9f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float element:marks){
            if (num==element){
                isInArray = true;
                break;
            }
        }
            if(isInArray){
                System.out.println("The value is present in the arary");
        }
            else{
        System.out.println("The value is not present in the arary");
        
    }
         
        // 3. Calculate  the average marks form an array containing marks of all students in physics using for each loop.
        float [] marks ={45.7f,6.9f, 48.9f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);
       
        
       // 4. Create a java program to add two matrices of size 2*3.
         
         int [][] mat1 = { {1,2,3},
                           {4,5,6}};
         int [][] mat2 = { {2,6,13},
                           {3,7,1}};
         int [][] result = { {0,0,0},
                             {0,0,0}};
         for (int i=0;i<mat1.length;i++){ //row number of times
               for (int j=0;j<mat1[i].length;j++){ // coloumn number of 
                  // System.out.print(result[i][j] + " ");
                   System.out.format("Setting value for i=%d and j=%d\n", i, j);
                   result[i][j] = mat1[i][j] + mat2[i][j];
               }
               System.out.println(" ");
         }
    
}
         for (int i=0;i<mat1.length;i++){ //row number of times
               for (int j=0;j<mat1[i].length;j++){ // coloumn number of 
                  // System.out.print(result[i][j] + " ");
                   System.out.print(result[i][j] + " ");
                   result[i][j] = mat1[i][j] + mat2[i][j];
               }
               System.out.println(" ");
         }
                
        // 5.write a java program to reverse an array.
        int [] marks = {1,21,3,4,5,37,87}
                System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        } 
        
        //6.write a java program to find the maximum element iN AN ARARY
        int [] arr = {1, 21, 3, 455 ,34 ,67};
        int max =0;
        for (int e: arr){
            if(e>max){
                max =e;
            }
    }
         System.out.println("the maximun element int his aray is :" + max);
                
         //7. write a java program to find  the minimum elemnet in an array
         int [] arr = {1,2100, 3, 455 ,34 ,67};
        int max = Integer.MIN_VALUE;
        for (int e: arr){
            if(e>max){
                max =e;
            }
            System.out.println("the minimum elemant int his aray is :" + max);
    }
                */
        //8. Write a java program to find whether an array is sorted or not.
        boolean isSorted = true;
         int [] arr = {1,2, 3, 4 ,34 ,67};
         for(int i=0;i<arr.length-1;i++){
             if(arr[i]>arr[i+1]){
                 isSorted = false;
                 break;
                 
             }
         }
         if(isSorted){
             System.out.println("The array is sorted");
        
         }
        
         else{
             System.out.println("The array is  not sorted");
        
         }
        
         
                }
    
}
