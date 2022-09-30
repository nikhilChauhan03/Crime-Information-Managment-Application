package com.masai.crimeByCriminalUseCases;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.masai.crimeByCriminalDao.CrimeByCriminalDao;
import com.masai.crimeByCriminalDao.CrimeByCriminalDaoImpl;

public class SearchCrimeByCriminal {

	public static void main(String[] args)
	{
		
//		----------------------creating the object of crimebycriminal class to call method----------------------------------
		
		CrimeByCriminalDao ccd = new CrimeByCriminalDaoImpl();
		
//		----------------------------creating the scanner class to take input from user-------------------------------------
		
		Scanner s1 = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the crime_id");
			int crime_id = s1.nextInt();
			
			System.out.println("Enter the criminal_id");
			int criminal_id = s1.nextInt();
			
			ccd.searchCrimeByCriminal(crime_id, criminal_id);
			
		}
		catch(InputMismatchException  im)
		{
			System.out.println("Input Mismatch");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
