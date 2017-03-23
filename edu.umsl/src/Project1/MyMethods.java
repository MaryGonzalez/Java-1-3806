
package Project1;

import java.util.Scanner;


public class MyMethods 
{
    public void productNoNegatives()
    {
        System.out.println("You are in Product No Negatives");
    }
    
    
    public void findTwelve()
    {
        System.out.println("You are in Find Twelve");
    }
    
    
    public void maxMinAvg()
    {
        
        int num;
        int count = 0;
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
                
        System.out.print("Enter a whole number, and -99 to exit: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
        
            if (num == -99)
            {
                System.exit(1);
            }
            
            while(num != -99)
            {

                if(num<min)
                {
                    min=num;
                }
                if(num>max)
                {
                    max=num;
                }
                
                count++;
                total += num;
                
                System.out.print("Enter a whole number, -99 to exit:");
                num = sc.nextInt();        
            }

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
        
        float average = total/count;
        System.out.println("The average is: " + average);
      
    }
    
    
    public void letterGrade()
    {
        
    int  input, sumA, sumB, sumC, sumD, sumF;
	sumA=sumB=sumC=sumD=sumF=0;
	

	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter grade 0-100 [-99 to quit]");
        input = sc.nextInt();

	if(input==-99) 
        {
            System.exit(1);
        }

	while(input != -99)
        {

            if(input>=90)
            {
                sumA++;
                System.out.println(input + "      A");
	    }
            else if(input >= 70)
            {
                sumB++;
                System.out.println(input + "      B");
            }
            else if(input >= 50)
            {
                sumC++;
                System.out.println(input + "      C");
            }
            else if(input >= 35)
            {
                sumD++;
                System.out.println(input + "      D");
            }
            else
            {
                sumF++;
                System.out.println(input + "      F");
            }
            System.out.println("Please enter grade 0-100 [-99 to quit]");
            input = sc.nextInt();
        }
        
        System.out.println("The total number of A's is " + sumA);
        System.out.println("The total number of B's is " + sumB);
        System.out.println("The total number of C's is " + sumC);
        System.out.println("The total number of D's is " + sumD);
        System.out.println("The total number of F's is " + sumF);    
        
                
    }
    
    
    public void exit()
    {
        System.out.println("Goodbye!");
        System.exit(0);
    }
    
    
    
}
