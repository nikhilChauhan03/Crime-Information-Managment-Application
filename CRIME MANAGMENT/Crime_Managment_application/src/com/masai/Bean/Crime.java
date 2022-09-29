package com.masai.Bean;



public class Crime {

	private int id;
	private String name;
	private int victims;
	private String details;
	private String date;
	private String police;
	private String suspected;
	private String status;
	
//---------------------------------	constructor using fields---------------------------
	public Crime( String name, int victims, String details, String date, String police, String suspected,String status) {
		
		this.name = name;
		this.victims = victims;
		this.details = details;
		this.date = date;
		this.police = police;
		this.suspected = suspected;
		this.status = status;
	}
	
	public Crime(int id, String name, int victims, String details, String date, String police, String suspected,String status) {
		this.id = id;
		this.name = name;
		this.victims = victims;
		this.details = details;
		this.date = date;
		this.police = police;
		this.suspected = suspected;
		this.status = status;
	}
	


	public Crime()
	{
		
	}
	


// ------------------------------------------ override to string method-------------------------------
	
	@Override
	public String toString() {
		return "Crime [ name=" + name + ", victims=" + victims + ", details=" + details + ", date=" + date
				+ ", police=" + police + ", suspected=" + suspected + ", status=" + status + "]";
	}
	
//	-------------------------------------------getters and setters ------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVictims() {
		return victims;
	}

	public void setVictims(int victims) {
		this.victims = victims;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPolice() {
		return police;
	}

	public void setPolice(String police) {
		this.police = police;
	}

	public String getSuspected() {
		return suspected;
	}

	public void setSuspected(String suspected) {
		this.suspected = suspected;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
