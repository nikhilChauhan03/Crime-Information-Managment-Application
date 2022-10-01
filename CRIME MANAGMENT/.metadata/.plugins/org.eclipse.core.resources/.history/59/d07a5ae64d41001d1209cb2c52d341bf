package com.masai.CriminalUseCase;

import java.util.Scanner;

import com.masai.Bean.Criminal;
import com.masai.CriminalDao.CriminalDao;
import com.masai.CriminalDao.CriminalDaoImpl;

public class RegisterCriminal {

public static void main(String[] args)
{
	
//	------------------------------------scanner class to taking input from the admin---------------------------------
	
	try
	{
	
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the Ciminal Name");
	String name = s1.nextLine();
	
	
	System.out.println("Enter the Address Of Criminal");
	String Address = s1.nextLine();
	
	System.out.println("Enter the Gender : Male / Female");
	String gender = s1.nextLine();
	
	System.out.println("Enter Any identity mark");
	String mark = s1.nextLine();
	
	System.out.println("What Crime he/she does");
	String crime = s1.nextLine();
	
	System.out.println("In which area he/she did crime");
	String area = s1.nextLine();
	
	System.out.println("Enter the Age");
	int age = s1.nextInt();
	
//	-------------------------------------creating object of criminal class---------------------------------------------
	
	Criminal c = new Criminal(name,Address,age,gender,mark,crime,area);

//	-------------------------------------inserting the values into the database----------------------------------------
	
	CriminalDao cd = new CriminalDaoImpl();
	String status = cd.addCriminalDetails(c);
	System.out.println(status);
	
	}
	catch(Exception e)
	{
		System.out.println("Input mismatch");
//		System.out.println(e.getMessage());
	}
	
}
	

}
