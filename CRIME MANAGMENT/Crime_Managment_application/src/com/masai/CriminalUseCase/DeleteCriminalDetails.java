package com.masai.CriminalUseCase;

import java.util.Scanner;

import com.masai.CriminalDao.CriminalDao;
import com.masai.CriminalDao.CriminalDaoImpl;import com.masai.Exceptions.CriminalException;

public class DeleteCriminalDetails {

	public void deleteCriminalDetails()
	{
		
//		------------------------ Scanner class to take crime_id from admin------------------------------
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Criminal_id to delete criminal details");
		int id = s1.nextInt();
		
//		----------------------- Creating CrimeDao object to call method --------------------------------
		
		CriminalDao cd = new CriminalDaoImpl();
		
		try {
			String status = cd.deleteCriminalDetails(id);
			System.out.println(status);
		} catch (CriminalException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args)
	{
		new DeleteCriminalDetails().deleteCriminalDetails();
	}
}
