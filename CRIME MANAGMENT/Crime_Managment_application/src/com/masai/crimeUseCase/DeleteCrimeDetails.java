package com.masai.crimeUseCase;

import java.util.Scanner;

import com.masai.CrimeDao.CrimeDao;
import com.masai.CrimeDao.CrimeDaoImpl;
import com.masai.Exceptions.CrimeException;

public class DeleteCrimeDetails {

	
	public void deleteCrimeDetails()
	{
		
//		------------------------ Scanner class to take crime_id from admin------------------------------
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Crime_id to delete crime details");
		int id = s1.nextInt();
		
//		----------------------- Creating CrimeDao object to call method --------------------------------
		
		CrimeDao cd = new CrimeDaoImpl();
		
		try {
			String status = cd.deleteCrimeDetails(id);
			System.out.println(status);
		} catch (CrimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void main(String[] args) {

		new DeleteCrimeDetails().deleteCrimeDetails();
		
	}		

	}


