/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.util.Scanner;

/**
 *
 * @author Mary
 */
public class RunMyMthods 
{
    public static void main(String[] args)
    {
        
        // Option menu
        System.out.println("     *Options*");
        System.out.println("1. Product no negative");
        System.out.println("2. Find Twelve");
        System.out.println("3. Max Min Avg");
        System.out.println("4. Letter Grade");
        System.out.println("5. Exit");
        System.out.println("");
        System.out.print("Choose an option [1-5]:");
        
        Scanner sc = new Scanner(System.in);
        //User input
        int option;
        option = sc.nextInt();
        
        MyMethods MyMethodsObject = new MyMethods();
       
        // Run through menu
      
        
        if(option < 1 || option > 5)
        { 
           System.out.println("Try again");
           System.out.println("     *Options*");
           System.out.println("1. Product no negative");
           System.out.println("2. Find Twelve");
           System.out.println("3. Max Min Avg");
           System.out.println("4. Letter Grade");
           System.out.println("5. Exit");
          
           option = sc.nextInt();
        }
       else if(option == 1)
         {
            MyMethodsObject.productNoNegatives();   
         }
       else if(option == 2) 
        {
            MyMethodsObject.findTwelve();
        }
       else if(option == 3)
        {
            MyMethodsObject.maxMinAvg();
        }
       else if(option == 4)
        {
            MyMethodsObject.letterGrade();
        }
       else if(option == 5)
        {        
            MyMethodsObject.exit();
        }
       
        
    }
}   
