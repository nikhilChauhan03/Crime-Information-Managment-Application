package com.masai.crimeUseCase;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

import com.masai.Bean.Crime;
import com.masai.CrimeDao.CrimeDaoImpl;
import com.masai.CrimeDao.CrimesDao;


public class CrimeRegister {

	public static void main(String[] args)
	{
//		------------------------Scanner class for taking input from user---------------------------------
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the name of the crime");
		String name = s1.nextLine();
		
		System.out.println("Enter the Number of Victims");
		int vict = s1.nextInt();
		
		System.out.println("Enter the Detailed Description of the crime (maximum 150 words");
		s1.nextLine();
		String des = s1.nextLine();
		
		System.out.println("Enter the date of crime (formate must be -> yyyy-mm-dd");
		String str = s1.next();
	
		
//		--------------------------using try catch block to check the date format ---------------------
		try {
			
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateS = LocalDate.parse(str,dtf);
		String date = dateS.toString();
		
		System.out.println("Enter the Name of the police Station");
		s1.nextLine();
		String police = s1.nextLine();
		
		System.out.println("Enter the name of the Main suspected");
		String sus = s1.nextLine();
		s1.nextLine();
		
		System.out.println("what is the Status of this case ? Solved/Unsolved");
		String status = s1.next();
		
		
//		---------------------------creating the Crime class object and calling the method to insert data into data base--------------------
		Crime c = new Crime(name,vict,des,date,police,sus,status);
	
		CrimesDao cd = new CrimeDaoImpl();
		String s = cd.AddCrimeDetails(c);
		
		System.out.println(s);

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid format");
		}
		
		
		
		
		
		
		
		
	}
	
}
