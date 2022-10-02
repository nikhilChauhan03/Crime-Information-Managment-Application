package com.masai.CriminalDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Bean.Crime;
import com.masai.Bean.Criminal;
import com.masai.Exceptions.CrimeException;
import com.masai.Exceptions.CriminalException;
import com.masai.utility.DB_Connection;

public class CriminalDaoImpl implements CriminalDao{

	@Override
	public String addCriminalDetails(Criminal c) {
		
//		------------------------------------------taking string to return------------------------------------------------
		
		String message = "Failed to insert criminal record";
		
//		------------------------------------------getting the connection form DB-----------------------------------------
		
		try(Connection con = DB_Connection.getconnection())
		
//		------------------------------------------inserting the sql query to to i insert the values-----------------------
		
		{
			PreparedStatement ps = con.prepareStatement(" insert into criminal (name,Address,gender,age,identity_mark,crime,area) values(?,?,?,?,?,?,?);");
			ps.setString(1, c.getName());
			ps.setString(2, c.getAddress());
			ps.setString(3, c.getGender());
			ps.setInt(4, c.getAge());
			ps.setString(5, c.getIdentity_mark());
			ps.setString(6, c.getCrime());
			ps.setString(7, c.getArea());
			
			int insert = ps.executeUpdate();
			if(insert > 0)
			{
				
				message = "criminal record inserted succesfully";
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
		}
		
		
		
		
		return message;
	}

	@Override
	public List<Criminal> getAllCriminals() throws CriminalException {
//		------------Initializing List----------------------
		
		List<Criminal> list = new ArrayList<>();
		
//		------------connection to the data base----------------
		
		try(Connection con = DB_Connection.getconnection())
		{
			PreparedStatement ps = con.prepareStatement("select * from Criminal;");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				
				int id = rs.getInt("Criminal_id");
				String name = rs.getString("Name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String add = rs.getString("Address");
				String mark = rs.getString("Identity_mark");
				String crime = rs.getString("crime");
				String area = rs.getString("area");
				
//				---------creating crime object and add it to list--------------
				
				Criminal c = new Criminal(id, name, add, age, gender, mark, crime, area);
				list.add(c);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new CriminalException(e.getMessage());
		}
		
//		----------------check if list is empty then throw exception---------------
		
		if(list.isEmpty())
		{
			throw new CriminalException();
		}
		
		
		return list;
	}

	
//-------------------------------------------Delete criminal details based on criminal_id-------------------------------------------------------

//--> this method is used to delete the criminal details which is register into criminal table as well as crime_by_criminal table
	
	
	@Override
	public String deleteCriminalDetails(int id) throws CriminalException {
		
		String message = "criminal Id " + id + " is not a valid id into criminal talbe.";
		
//		-----------------getting the DB connection-------------------------------
		
		try(Connection con = DB_Connection.getconnection())
		{
			
//			----------------------first need to delete from crime_by_criminal table-------------------
			
			PreparedStatement ps1 = con.prepareStatement("Delete from crime_by_criminal where criminal_id = ?;");
			
			ps1.setInt(1, id);
			
			int status = ps1.executeUpdate();
			
//			---------------checking that details are deleted then delete from crime table----------------
			
			if(status > 0)
				
			{
			
				PreparedStatement ps = con.prepareStatement("Delete from criminal where criminal_id = ?;");
				
				ps.setInt(1, id);
				
				int delete = ps.executeUpdate();
				
				if(delete > 0)
				{
					message = "criminal details of criminal_id " + id + " deleted successfully";
					
//					PreparedStatement ps3 = con.prepareStatement("alter table criminal auto_increment = ?;");
//					ps3.setInt(1, id);
//					
//					int statusAM = ps3.executeUpdate();
//					
//					if(statusAM >= 0)
//					{
//						System.out.println("AutoIncrement is modified");
//					}
//					else
//					{
//						System.out.println("AutoIncrement Modification failed");
//					}
					
				}
		
			}	
//			--------------if id is not valid then throw the exception--------------------
			
			else
			{
				throw new CriminalException("Crime Id " + id + " is not a valid id into Crime_by_criminal table. you can use DeleteIvalidDetails method");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
		}
		
		
		return message;
	}

	
//---------------------------------------------Delete invalid Detailed from Crime table------------------------------------------------------

//  --> this method is used to delete the crime details which is not registered into the crime_by_criminal tab
	


	@Override
	public String deleteIvalidDetails(int id) {
		
//		---------------Initiating the String to return -----------------
		
		String message = "Invalid criminal_id " + id;
		
//		---------------establishing the database connection------------------
		
		try(Connection con = DB_Connection.getconnection())
		{
			PreparedStatement ps = con.prepareStatement("delete from criminal where criminal_id = ?;");
			ps.setInt(1, id);
			int status = ps.executeUpdate();
			
			if(status > 0)
			{
				
				message = "Details of criminal id " + id + " is successfully deleted ";
				
//				PreparedStatement ps3 = con.prepareStatement("alter table criminal auto_increment = ?;");
//				ps3.setInt(1, id);
//				
//				int statusAM = ps3.executeUpdate();
//				
//				if(statusAM >= 0)
//				{
//					System.out.println("AutoIncrement is modified");
//				}
//				else
//				{
//					System.out.println("AutoIncrement Modification failed");
//				}
				
			}
			
		} catch (SQLException e) {
			
			message = e.getMessage();
			
		}
		
		
		return message;
		
	}

	
//--------------------------------------------------Searching Criminals by their name-------------------------------------------------------
	
	
	@Override
	public List<Criminal> searchByName(String s) throws CriminalException {
		
//		----------------Initializing the list to return------------------
		
		List<Criminal> list = new ArrayList<>();
		
//		----------------establishing the connection--------------------
		
		try(Connection con = DB_Connection.getconnection())
		{
			PreparedStatement ps = con.prepareStatement("Select * from criminal where name = ?;");
			ps.setString(1, s);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				
				int id = rs.getInt("Criminal_id");
				String name = rs.getString("Name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String add = rs.getString("Address");
				String mark = rs.getString("Identity_mark");
				String crime = rs.getString("crime");
				String area = rs.getString("area");
				
//				---------creating crime object and add it to list--------------
				
				Criminal c = new Criminal(id, name, add, age, gender, mark, crime, area);
				list.add(c);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new CriminalException(e.getMessage());
		}
		
//		--------------------if list is empty then throw an exception--------------------
		
		if(list.isEmpty())
		{
			throw new CriminalException(s + " is not found in Database");
		}
		
		return list;
		
		
	}

	
//------------------------------------------------Serach Criminal Details by Criminal_id----------------------------------------------------
	
	@Override
	public Criminal searchByID(int id) throws CriminalException {
		
		Criminal c = null;
		
//		---------------establishing the database connection------------------
		
		try(Connection con = DB_Connection.getconnection())
		{
			PreparedStatement ps = con.prepareStatement("Select * from criminal where criminal_id = ?;");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				
				int Cid = rs.getInt("Criminal_id");
				String name = rs.getString("Name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String add = rs.getString("Address");
				String mark = rs.getString("Identity_mark");
				String crime = rs.getString("crime");
				String area = rs.getString("area");
				
//				---------creating crime object and add it to list--------------
				
				 c = new Criminal(Cid, name, add, age, gender, mark, crime, area);
			}
			else
			{
				throw new CriminalException(id + " id Invalid Crime id ");
			}
				

			
		} catch (SQLException e) {
			throw new CriminalException(e.getMessage());
		}
		
		return c;
		
	}

}


