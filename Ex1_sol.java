/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_sol;
import java.util.Scanner;

/**
 *
 * @author adarsh
 */
public class Ex1_sol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks of Physics ");
                int Physics = scan.nextInt();

        System.out.println("Enter your marks of  MAths");
                int Maths = scan.nextInt();

        System.out.println("Enter your marks of English ");
                int English = scan.nextInt();

        System.out.println("Enter your marks of Hindi");
                int Hindi = scan.nextInt();

        System.out.println("Enter your marks of Computer ");
                int Computer = scan.nextInt();
        float percentage =((Physics + Maths + English + Hindi + Computer)/500.0f)*100;
        System.out.println("percentage :");
        System.out.println(percentage);

        
    }
    
}
