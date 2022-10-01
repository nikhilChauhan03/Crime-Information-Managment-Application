package com.masai.crimeByCriminalUseCases;

import com.masai.crimeByCriminalDao.CrimeByCriminalDao;
import com.masai.crimeByCriminalDao.CrimeByCriminalDaoImpl;

public class DetailedListOfAllCases {

	
	public void detailedListOfAllCases()
	{
		
//		----------------------creating the object of crimebycriminal class to call method----------------------------------
		
		
		CrimeByCriminalDao ccd = new CrimeByCriminalDaoImpl();
		
		ccd.showListOfAllCases();
		
	}
	
	
	public static void main(String[] args) {

		new DetailedListOfAllCases().detailedListOfAllCases();
		
	}

}
