package com.masai.crimeUseCase;

import com.masai.CrimeDao.CrimeDao;
import com.masai.CrimeDao.CrimeDaoImpl;

public class SolvedCases {

	public void solvedCases()
	{

//		------------creating the object of the CrimeDao class to call a method--------------
		
		CrimeDao cd = new CrimeDaoImpl();
		String s = cd.numberOfSolvedCases();
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {

		new SolvedCases().solvedCases();
		
	}

}
