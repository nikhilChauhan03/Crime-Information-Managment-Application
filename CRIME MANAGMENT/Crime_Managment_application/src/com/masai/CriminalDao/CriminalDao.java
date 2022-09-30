package com.masai.CriminalDao;

import java.util.List;

import com.masai.Bean.Crime;
import com.masai.Bean.Criminal;
import com.masai.Exceptions.CrimeException;
import com.masai.Exceptions.CriminalException;

public interface CriminalDao {

//	------------------------------------------------add criminal to table----------------------------------------------------
	
	String addCriminalDetails(Criminal c);
	
//	------------------------------------------Get the list of all criminals--------------------------------------------------
	
	List<Criminal> getAllCriminals() throws CriminalException;
	
//	---------------Delete criminal details based on criminal_id from criminal and crime_by_criminal table------------------
	
	String deleteCriminalDetails(int id) throws CriminalException;
	
//  ----------------------- Delete criminal details based on criminal_id from criminal table ------------------------------
	
	String deleteIvalidDetails(int id);
	
//	--------------------------------------------search Criminals by name-----------------------------------------------------
	
	List<Criminal> searchByName(String s) throws CriminalException;
	
//	--------------------------------------------search criminal by ID--------------------------------------------------------
	
	Criminal searchByID(int id) throws CriminalException;
	
	
	
}
