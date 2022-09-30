package com.masai.crimeByCriminalUseCases;

import com.masai.crimeByCriminalDao.CrimeByCriminalDao;
import com.masai.crimeByCriminalDao.CrimeByCriminalDaoImpl;

public class DetailedListOfAllCases {

	public static void main(String[] args) {
		
//		----------------------creating the object of crimebycriminal class to call method----------------------------------
		
		CrimeByCriminalDao ccd = new CrimeByCriminalDaoImpl();
		
		ccd.showListOfAllCases();
		
	}

}
