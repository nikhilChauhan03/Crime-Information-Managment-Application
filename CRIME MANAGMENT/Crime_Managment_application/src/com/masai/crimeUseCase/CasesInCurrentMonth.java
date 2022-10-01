package com.masai.crimeUseCase;

import com.masai.CrimeDao.CrimeDao;
import com.masai.CrimeDao.CrimeDaoImpl;

public class CasesInCurrentMonth {
	
	public void casesInCurrenMonth()
	{
	
//		-----------------------------creating the object of CrimeDao class to call the method-------------------------------------------
		
		CrimeDao cd = new CrimeDaoImpl();
		String count = cd.countNumberOfCasesInCurrentMonth();
		System.out.println(count);	
		
	}

	public static void main(String[] args) {

		new CasesInCurrentMonth().casesInCurrenMonth();
		
	}

}
