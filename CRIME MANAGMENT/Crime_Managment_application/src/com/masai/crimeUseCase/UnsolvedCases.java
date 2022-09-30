package com.masai.crimeUseCase;

import com.masai.CrimeDao.CrimeDao;
import com.masai.CrimeDao.CrimeDaoImpl;

public class UnsolvedCases {

	public static void main(String[] args) {

//		------------creating the object of the CrimeDao class to call a method--------------
		
		CrimeDao cd = new CrimeDaoImpl();
		String s = cd.numberOfUnsolvedCases();
		System.out.println(s);
		

	}

}
