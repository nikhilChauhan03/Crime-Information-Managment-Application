package com.masai.crimeByCriminalUseCases;

import java.util.Scanner;

import com.masai.Exceptions.CrimeException;
import com.masai.Exceptions.CriminalException;
import com.masai.crimeByCriminalDao.CrimeByCriminalDao;
import com.masai.crimeByCriminalDao.CrimeByCriminalDaoImpl;

public class CriminalMap {

	public static void main(String[] args) {
		
//		-------------------------------------taking scanner class to take input from admin---------------------------------------
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Crime_id");
		int crime_id = s1.nextInt();
		System.out.println("Enter the criminal_id");
		int Criminal_id = s1.nextInt();
		
//		--------------------------------------creating a object of crime by criminal interface to call method ---------------------
		
		CrimeByCriminalDao cbcd = new CrimeByCriminalDaoImpl();
		
		String insert = "";
		try {
			insert = cbcd.registerCriminalToCrime(crime_id, Criminal_id);
		} catch (CrimeException e) {
			
			insert = e.getMessage();
			
		} catch (CriminalException e) {
			
			insert = e.getMessage();
			
		}
		
		System.out.println(insert);
	}

}
