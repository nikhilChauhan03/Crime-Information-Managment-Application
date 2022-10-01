package com.masai.crimeByCriminalUseCases;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.masai.crimeByCriminalDao.CrimeByCriminalDao;
import com.masai.crimeByCriminalDao.CrimeByCriminalDaoImpl;

public class DeleteCrimeByCriminal {
	
	public void deleteCrimeByCriminal()
	{
		
		System.out.println("-----> Alert! <------");
		System.out.println("These details will not delete from crime and criminal data but combined registered details will be deleted");
		System.out.println("");
		
//		----------------------creating the object of crimebycriminal class to call method----------------------------------
		
		CrimeByCriminalDao ccd = new CrimeByCriminalDaoImpl();
		
//		----------------------------creating the scanner class to take input from user-------------------------------------
		
		Scanner s1 = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the crime_id");
			int crime_id = s1.nextInt();
			
			System.out.println("Enter the criminal_id");
			int criminal_id = s1.nextInt();
			
			System.out.println(ccd.deleteCrimeCriminal(crime_id, criminal_id));
			
		}
		catch(InputMismatchException  im)
		{
			System.out.println("Input Mismatch");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {

		new DeleteCrimeByCriminal().deleteCrimeByCriminal();
		
	}
		
	}


