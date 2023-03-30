//Chase Moskowitz
package com.mycompany.lab7arrays;

import java.util.Scanner;

public class Lab7Arrays 
{

    public static void main(String[] args) 
    {
        
        int[] array=new int [10];
        int count =0;
        int number;
        double total=0;
        double average=0;
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the number of fruits sold"
                + " or -1 to quit: ");
        number = keyboard.nextInt();
        array[count] = number;
        count++;
      
        if (number==-1)
        {
            System.out.println("\nYou didn't sell any fruit!!");
        }
            else
        {
               
                while (number != -1 && count <=9)
                 {
                    System.out.print("Enter the number of fruits sold"
                      + " or -1 to quit: ");
                    number = keyboard.nextInt();
                    
                     if (number != -1)
                     {  
                        array[count] = number;
                        count++;
                     }
                     else
                     {
                         
                     }
                     
                 }    
                if (count==10)
                {
                    System.out.println("\nArray is full!!");
                 }
        }
        
        
         for (int i=0; i<count; i++)
         {
             total+=array[i];
         }
         average=total/count;
        
       
        if (count>=1)
        { 
            System.out.printf("\n\n%5s %11s\n", "", "Fruit");
            System.out.printf("%5s %11s\n", "#", "Sold");
            System.out.printf("%5s %11s\n", "=====", "======");
            
            for (int i=0; i<count; i++)
            {
                System.out.printf("%5d %11d\n", i, array[i]);
             } 
            
            System.out.printf("\nAverage Fruits Sold: %.1f", average);
        }
           
        
     
    }
}
