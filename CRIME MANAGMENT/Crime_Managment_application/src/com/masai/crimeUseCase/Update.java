package com.masai.crimeUseCase;

import java.util.Scanner;

import com.masai.CrimeDao.CrimeDao;
import com.masai.CrimeDao.CrimeDaoImpl;
import com.masai.Exceptions.CrimeException;

public class Update {
	
	
	public void update()
	{
		
		
//		---------------------------Initiating the Scanner class --------------------------------
			
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the valid Crime Id");
		int id = s1.nextInt();

//		---------------------creating the object of crimeDao class to call methods-----------------------------
//		----> checking the current status of the case
		
		CrimeDao cd = new CrimeDaoImpl();
		
		try {
			
			String current_status = cd.checkStatus(id);
			System.out.println(current_status);
			
//		---------------------Again taking the input from user to update the status---------------------------	
			
			System.out.println("Want to update the status ? Y / N");
			String choice = s1.next();
			
			try
			{
				if(choice.equalsIgnoreCase("y"))
				{
					System.out.println("Enter the value : solved / unsolved");
					String value = s1.next();
					
					String s = cd.updateStatusOfCase(id, value);
					System.out.println(s);
					
				}
				else if(choice.equalsIgnoreCase("n"))
				{
					System.out.println("Thankyou!!!");
				}
				else
				{
					throw new CrimeException("Invalid choice");
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		} catch (CrimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	

	public static void main(String[] args) {

		new Update().update();
		
	}

}
