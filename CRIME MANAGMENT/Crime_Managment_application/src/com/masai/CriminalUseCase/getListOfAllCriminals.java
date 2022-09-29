package com.masai.CriminalUseCase;

import java.util.List;

import com.masai.Bean.Criminal;
import com.masai.CriminalDao.CriminalDao;
import com.masai.CriminalDao.CriminalDaoImpl;
import com.masai.Exceptions.CriminalException;

public class getListOfAllCriminals {

	public static void main(String[] args) {
//		------------------------------- Creating CrimeDao object to call Method ---------------------------------
		
		CriminalDao cd = new CriminalDaoImpl();
		
		try {
			
			List<Criminal> list = cd.getAllCriminals();
			
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
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}


	}


