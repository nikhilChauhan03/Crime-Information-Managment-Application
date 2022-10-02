package com.masai.crimeByCriminalDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.utility.DB_Connection;
import com.masai.Bean.Crime;
import com.masai.Exceptions.CrimeException;
import com.masai.Exceptions.CriminalException;

public class CrimeByCriminalDaoImpl implements CrimeByCriminalDao{

	@Override
	public String registerCriminalToCrime(int crime_id, int criminal_id) throws CriminalException, CrimeException {
		
//		---------------------------------Initiating the String------------------------------------------------
		
		String message = "failed to map criminal to crime";
		
//		---------------------------------Getting the Database connection--------------------------------------
		
		try(Connection con = DB_Connection.getconnection())
		{
			
//		--------------------------------- checking that is crime_id is valid or not ? -----------------------
			
			PreparedStatement ps1 = con.prepareStatement("select * from crime where crime_id = ?;");
			ps1.setInt(1, crime_id);
			
			ResultSet rs1 = ps1.executeQuery();
			
			if(rs1.next())
			{
				
//		-----------------------------------now if crime_id is valid check again for the  criminal Id--------------
				
				PreparedStatement ps2 = con.prepareStatement("Select * from criminal where criminal_id = ?;");
				ps2.setInt(1, criminal_id);
				ResultSet rs2 = ps2.executeQuery();
				
				if(rs2.next())
				{
					
//					-----------------------------------now if crime_id and criminal Id id valid add them into DB--------------
					
					PreparedStatement ps3 = con.prepareStatement("insert into crime_by_criminal (crime_id,criminal_id) values(?,?);");
					
					ps3.setInt(1, crime_id);
					ps3.setInt(2, criminal_id);
					
					int insert = ps3.executeUpdate();
					
					if(insert > 0)
					{
						message = "Criminal_id " + criminal_id +  " is successfully mapped to crime_id " + crime_id ;
					}
					
				}
//		 		----------------------------------if criminal_id is not valid throw criminalException---------------------------
				else
				{
					throw new CriminalException("Invalid Criminal_id");
				}
				
			}
// 		----------------------------------if crime_id is not valid throw crimeException---------------------------
			else
			{
				
				throw new CrimeException("Invalid Crime_id");
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
		}
		
		return message;
	}

	
//	------------------------------------------------list of all cases ---------------------------------------------------------------------
	
	
	@Override
	public void showListOfAllCases() {
		
//		------------connection to the data base----------------
		
		try(Connection con = DB_Connection.getconnection())
		{
			PreparedStatement ps = con.prepareStatement("select t.case_id, t.criminal_id, c.name,c.address, c.crime, t.crime_id,x.victims,x.date, x.detailed_des,x.status from crime x inner join criminal c inner join crime_by_criminal t on t.crime_id = x.crime_id and t.criminal_id = c.criminal_id;");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println();
				
				System.out.println( "Case id : " + rs.getInt("case_id"));
				System.out.println( "Criminal id : " + rs.getInt("criminal_id"));
				System.out.println( "Name of the Criminal : " + rs.getString("name"));
				System.out.println( "Address of the criminal : " + rs.getString("address"));
				System.out.println( "Name of Crime : " + rs.getString("crime"));
				System.out.println( "Crime_id : " + rs.getInt("crime_id"));
				System.out.println( "Number of Victims : " + rs.getInt("victims"));
				System.out.println( "Date : " + rs.getString("date"));
				System.out.println( "Detailed description of crime : " + rs.getString("detailed_des"));
				System.out.println( "Status of the case : " + rs.getString("status"));
				System.out.println();
				
				System.out.println("*******************************************************************************************************************");
				
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

	
//----------------------------------------search particular case by crime_id and criminal_id------------------------------------------------
	
	
	@Override
	public void searchCrimeByCriminal(int criminal_id)throws CrimeException,CriminalException {
		
//		-----> establisgin the connection between data base ->
		
		try(Connection con = DB_Connection.getconnection())
		{
			
//			----> if crime_id is valid check for criminal_id
	
				PreparedStatement ps2 = con.prepareStatement("select case_id from crime_by_criminal where criminal_id = ?;");
				ps2.setInt(1, criminal_id);
				
				ResultSet rs2 = ps2.executeQuery();
				
//				-----> if id is valid then get the details
				if(rs2.next())
				{
					
					PreparedStatement ps3 = con.prepareStatement("select t.case_id, t.criminal_id, c.name,c.address, c.crime, t.crime_id,x.victims,x.date, x.detailed_des,x.status from crime x inner join criminal c inner join crime_by_criminal t on c.criminal_id = ? and t.criminal_id = ? and t.crime_id = x.crime_id;");
					ps3.setInt(1, criminal_id);
					ps3.setInt(2, criminal_id);
					
					ResultSet rs3 = ps3.executeQuery();
					
					Boolean flag = false;
					
					while(rs3.next())
					{
						flag = true;
						System.out.println();
						
						System.out.println( "Case id : " + rs3.getInt("case_id"));
						System.out.println( "Criminal id : " + rs3.getInt("criminal_id"));
						System.out.println( "Name of the Criminal : " + rs3.getString("name"));
						System.out.println( "Address of the criminal : " + rs3.getString("address"));
						System.out.println( "Name of Crime : " + rs3.getString("crime"));
						System.out.println( "Crime_id : " + rs3.getInt("crime_id"));
						System.out.println( "Number of Victims : " + rs3.getInt("victims"));
						System.out.println( "Date : " + rs3.getString("date"));
						System.out.println( "Detailed description of crime : " + rs3.getString("detailed_des"));
						System.out.println( "Status of the case : " + rs3.getString("status"));
						System.out.println();
						
						System.out.println("*******************************************************************************************************************");
						
						
					}
					if(flag == false)
					{
						
						throw new CrimeException("Criminal Details with crminal id " + criminal_id + " is not registered");
						
					}
					
				}
				else
				{
					throw new CriminalException("Invalid criminal_id");
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}


//---------------------------------------------------Delete Details of Case-----------------------------------------------------------------
	
	
	
	@Override
	public String deleteCrimeCriminal(int crime_id, int criminal_id) throws CriminalException, CrimeException {
		
		String message = "Failed to Delete, crime id " + crime_id + " is not mapped with criminal id " + criminal_id;
		
//		-----> establisgin the connection between data base ->
		
		try(Connection con = DB_Connection.getconnection())
		{
//			----> checking that crime_id is valid or not
			PreparedStatement ps1 = con.prepareStatement("select case_id from crime_by_criminal where crime_id = ?;");
			ps1.setInt(1, crime_id);
			
			ResultSet rs = ps1.executeQuery();
			
//			----> if crime_id is valid check for criminal_id
			if(rs.next())
			{
				
				PreparedStatement ps2 = con.prepareStatement(" select * from crime_by_criminal where criminal_id = ?;");
				ps2.setInt(1, criminal_id);
				
				ResultSet rs2 = ps2.executeQuery();
			
//				-----> if both are id's are valid then delete the details
				if(rs2.next())
				{
					
					PreparedStatement ps3 = con.prepareStatement("delete  from crime_by_criminal where crime_id = ? and criminal_id = ?;");
					ps3.setInt(1, crime_id);
					ps3.setInt(2, criminal_id);
					
					int rs3 = ps3.executeUpdate();
					
					if(rs3>0)
					{
						
						message = "case with crime_id " + crime_id + " which is mapped with criminal_id " + criminal_id + " successfully deleted ";
						
					}else
					{
						throw new CrimeException(message);
					}
	
				}
				else
				{
					throw new CriminalException("Invalid criminal_id");
				}
			}
			else
			{
				throw new CrimeException("Invalid crime_id");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		return message;
		
	}


}


