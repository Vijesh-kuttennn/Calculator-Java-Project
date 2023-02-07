package com.calculation;
import com.addition.Addition;
import com.subtraction.Subtraction;
import com.multiplication.Multiplication;
import com.division.Division;



import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		int choice = 0;
		Scanner input = new Scanner(System.in);
		float n1, n2;
		
		System.out.print("\nWelcome to Calculator Project!");
		
		try
		{
			while(choice != 5 )
			{
				System.out.print("\n1 - Addition");
				System.out.print("2 - Substraction");
				System.out.print("3 - Multiplication");
				System.out.print("4 - Division");
				System.out.print("5 - Exit");
				System.out.print("\n Enter your Choice");
				choice = input.nextInt();
				
				if(choice == 5)
				{
					
						System.out.print("\nThanks for using");
					    System.exit(0);
				}
				
				System.out.print("\nEnter First value");
				n1 = input.nextFloat();
				
				System.out.print("\nEnter Second value");
				n2 = input.nextFloat();
				
				if(choice == 1)
				{
					System.out.print("Sum: " + Addition.addition(n1, n2));
				}
				
				else if(choice == 2)
				{
				
				System.out.print("Substraction: " + Subtraction.subtraction(n1,n2));
			
			    }
				
				else if(choice == 3)
				{
					System.out.print("Multiplication: " + Multiplication.Multiplication(n1,n2));
				}
				else if(choice == 4)
				{
					System.out.print("Division: " + Division.division(n1,n2));
				}
			}	
		}
		catch(Exception ex)
		{
			
				System.out.println("\nError: " + ex.toString() + "Occured");
				
					
			
		}

	}
}