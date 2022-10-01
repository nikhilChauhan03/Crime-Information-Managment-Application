package com.masai.crimeByCriminalDao;

import com.masai.Exceptions.CrimeException;
import com.masai.Exceptions.CriminalException;

public interface CrimeByCriminalDao {
	
//	-----------------------------------Mapping criminal to crime------------------------------------------

	String registerCriminalToCrime(int crime_id, int criminal_id) throws CrimeException,CriminalException;
	
//	-----------------------------------show the list of every case----------------------------------------
	
	void showListOfAllCases();
	
//	------------------------------------show details of particular case-----------------------------------
	
	void searchCrimeByCriminal(int criminal_id) throws CrimeException,CriminalException;
	
//	-------------------------------------Delete detaisl of case-------------------------------------------
	
	String deleteCrimeCriminal(int crime_id, int criminal_id) throws CriminalException, CrimeException;
	
}
