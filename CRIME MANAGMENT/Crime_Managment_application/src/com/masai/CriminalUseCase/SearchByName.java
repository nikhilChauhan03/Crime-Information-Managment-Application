package com.masai.CriminalUseCase;

import java.util.List;
import java.util.Scanner;

import com.masai.Bean.Criminal;
import com.masai.CriminalDao.CriminalDao;
import com.masai.CriminalDao.CriminalDaoImpl;
import com.masai.Exceptions.CriminalException;

public class SearchByName {

	public static void main(String[] args) {
		
//		----------------------scanner class to take input from user----------------------------
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Name of Criminal");
		String s = s1.nextLine();
		
//		-------------------Creating the object of crimeDao class to call method----------------------
		
		CriminalDao cd = new CriminalDaoImpl();
		try {
			
			List<Criminal> list = cd.searchByName(s);
			
			for(Criminal c:list)
			{
				System.out.println();
				System.out.println("Id of the Criminal : " + c.getId() );
				System.out.println("Name of the criminal : " + c.getName());
				System.out.println("Address of criminal; : " + c.getAddress());
				System.out.println("Gender : " + c.getGender());
				System.out.println("Age : " + c.getAge());
				System.out.println("Area : " + c.getArea());
				System.out.println("Identity mark : " + c.getIdentity_mark());
				System.out.println("crime : " + c.getCrime());
				System.out.println();
				System.out.println("***********************************************");
				 
			}
			
			
		} catch (CriminalException e) {
			System.out.println(e.getMessage());
		}
		
	}
	}


