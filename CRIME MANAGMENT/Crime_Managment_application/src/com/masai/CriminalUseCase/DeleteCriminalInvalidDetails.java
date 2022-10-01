package com.masai.CriminalUseCase;

import java.util.Scanner;

import com.masai.CriminalDao.CriminalDao;
import com.masai.CriminalDao.CriminalDaoImpl;

public class DeleteCriminalInvalidDetails {

	public void deleteInvalidDetails()
	{
		
//		------------------------ Scanner class to take crime_id from admin------------------------------
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Criminal_id to delete criminal details");
		int id = s1.nextInt();
		
//		----------------------- Creating CrimeDao object to call method --------------------------------
		
		CriminalDao cd = new CriminalDaoImpl();
		String status = cd.deleteIvalidDetails(id);
		System.out.println(status);


	}
	
	public static void main(String[] args) {
		new DeleteCriminalInvalidDetails().deleteInvalidDetails();
	}

}
