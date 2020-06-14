package com.dxc.assignments;

public class EmailGenerator {

	public  String firstName = "";
	public  String lastName = "";
	public  String emailId = "";	
	static int countFirst = 1;
	static int countLast = 1;	
	public static String email = "";

	public static void main(String[] args) 
	{
		EmailGenerator gen1 = new EmailGenerator("Radha","Krishan");
		EmailGenerator gen2 = new EmailGenerator("Radha","Kiran");
		EmailGenerator gen3 = new EmailGenerator("Vamsy","Kiran");	

		gen1.emailId = generateEmailId(gen1);
		gen2.emailId = generateEmailId(gen2);
		gen3.emailId = generateEmailId(gen3);		

		System.out.println(gen1.emailId);
		System.out.println(gen2.emailId);
		System.out.println(gen3.emailId);			

	}

	public static String generateEmailId(EmailGenerator obj1) 
	{
		String fN = obj1.firstName.toLowerCase();
		String lN = obj1.lastName.toLowerCase();

		obj1.firstName = obj1.firstName + fN.substring(0,3);
		obj1.lastName = obj1.lastName + lN.substring(lN.length() - 3);

		if(email.contains(fN.substring(0,3))  &&    email.contains(lN.substring(lN.length() - 3)))
		{
			String cntF = String.valueOf(countFirst);
			String cntL = String.valueOf(countLast);

			obj1.emailId = obj1.emailId + fN.substring(0,3) +cntF+ "_" + lN.substring(lN.length() - 3)+cntL+"@dxc.com";
			countFirst =  Integer.parseInt(cntF);
			countFirst++;

			countLast =  Integer.parseInt(cntL);
			countLast++;

		}
		else if(email.contains(fN.substring(0,3)))
		{
			String cntF = String.valueOf(countFirst);
			obj1.emailId = obj1.emailId + fN.substring(0,3) +cntF+ "_" + lN.substring(lN.length() - 3)+"@dxc.com";
			countFirst =  Integer.parseInt(cntF);
			countFirst++;
		}
		else if(email.contains(lN.substring(lN.length() - 3)))
		{
			String cntL = String.valueOf(countLast);
			obj1.emailId = obj1.emailId + fN.substring(0,3) + "_" + lN.substring(lN.length() - 3)+cntL+"@dxc.com";
			countLast =  Integer.parseInt(cntL);
			countLast++;
		}

		else 
		{
			obj1.emailId = obj1.emailId + fN.substring(0,3) + "_" + lN.substring(lN.length() - 3)+"@dxc.com";
		}		
		email = email + obj1.emailId;
		email = email + " ";

		return obj1.emailId;
	}



	public EmailGenerator(String firstName, String lastName) 
	{		
		this.firstName = firstName;
		this.lastName = lastName;		
	}

}
