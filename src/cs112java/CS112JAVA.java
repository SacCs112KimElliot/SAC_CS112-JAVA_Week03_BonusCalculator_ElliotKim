/* 
 * Subject:     SAC_CS112-Java_Week03_BonusProject
 * Objective:   Build a calculator by unconditionally add / subtract /multiply / divide 2 numbers
 * DueDate:     Mon, 09/12/2016
 * Programmer:  Elliot Kim
 */
package cs112java;

import java.util.Scanner;

public class CS112JAVA 
{

     public static void main(String[] args) 
    {
        // Introduce the calculator to the user
        System.out.println("This is a calculator.\nPlease type in 2 numbers to manipulate.\n");
        
        // Receive 2 numbers to manipulate
        Scanner input = new Scanner(System.in);
        double FirstNumber = 0;
        double SecondNumber = 0;
        System.out.println("Enter first number:");
        FirstNumber = input.nextInt();
        System.out.println("Enter Second number:");
        SecondNumber = input.nextInt();
        
        // Ask user what calculating operation desired
        // Filter invalid input
        int CalculationType = 5;
        while (CalculationType > 4 || CalculationType < 1)
            {
                System.out.println("\nHow would you like to maniplate the numbers?\n"
                    + "Choose a type of calculation:\n"
                    + "Press 1 to add\n"
                    + "Press 2 to subtract\n"
                    + "Press 3 to multiply\n"
                    + "Press 4 to divide");    
                CalculationType = input.nextInt();
            }
        
        // Proceed type of calculation the user requested
        double ResultAdd        = 0;
        double ResultSubtract   = 0;
        double ResultMultiply   = 0;
        double ResultDivide     = 0;
        if (CalculationType == 1)
        {
            ResultAdd = FirstNumber + SecondNumber;
            System.out.println("\nResult of adding calculation is " + ResultAdd);
        }
        else
              if (CalculationType == 2)
              {
                  ResultSubtract = FirstNumber - SecondNumber;
                  System.out.println("\nResult of subtract calculation is " + ResultSubtract);
              }
              else
                  if (CalculationType == 3)
                  {
                      ResultMultiply = FirstNumber * SecondNumber;
                      System.out.println("\nResult of multiply calculation is " + ResultMultiply);
                  }
                  else
                      if (CalculationType == 4)
                      {
                          ResultDivide = FirstNumber / SecondNumber;
                          System.out.println("\nResult of divide calculation is " + ResultDivide);
                      }
         System.out.println("\nIt was a pleasure calculating.\nHave a great day. Bye.");
    }
}
    
//Got it...please update BlackBoard.
