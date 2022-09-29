package com.masai.Bean;

public class Criminal {
	
	private int id;
	private String name;
	private String Address;
	private int Age;
	private String Gender;
	private String Identity_mark;
	private String Crime;
	private String Area;
	
	
//	--------------------------------constructors--------------------------------------------------------
	
	public Criminal()
	{
		
	}


	public Criminal(String name, String address, int age, String gender, String identity_mark, String crime,
			String area) {
		
		this.name = name;
		this.Address = address;
		this.Age = age;
		this.Gender = gender;
		this.Identity_mark = identity_mark;
		this.Crime = crime;
		this.Area = area;
	}
	
	public Criminal(int id,String name, String address, int age, String gender, String identity_mark, String crime,
			String area) {
		
		this.id = id;
		this.name = name;
		this.Address = address;
		this.Age = age;
		this.Gender = gender;
		this.Identity_mark = identity_mark;
		this.Crime = crime;
		this.Area = area;
	}
	
//	----------------------------------To String --------------------------------------------------------


	@Override
	public String toString() {
		return "Criminal [name=" + name + ", Address=" + Address + ", Age=" + Age + ", Gender=" + Gender
				+ ", Identity_mark=" + Identity_mark + ", Crime=" + Crime + ", Area=" + Area + "]";
	}

//	-----------------------------------getter and setter------------------------------------------------

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


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getIdentity_mark() {
		return Identity_mark;
	}


	public void setIdentity_mark(String identity_mark) {
		Identity_mark = identity_mark;
	}


	public String getCrime() {
		return Crime;
	}


	public void setCrime(String crime) {
		Crime = crime;
	}


	public String getArea() {
		return Area;
	}


	public void setArea(String area) {
		Area = area;
	}
		
}
