package org.company;

public class CompanyInfo {
	private void companyName(String name) {
		System.out.println("CompanyName:"+name);
		

	}
	private void companyName(String name1,int id) {
		System.out.println("CompanyName1:"+name1+id);
		

	}
	private void companyName(String name,int id,String city) {
		System.out.println("CompanyName2:"+name+id+city);
		

	}
	private void companyName(String name,int id,String city,long pin) {
		System.out.println("CompanyName3:"+name+id+city+pin);
		

	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName("google");
		c.companyName("google", 88);
		c.companyName("google", 88, "Noida");
		c.companyName("google", 88, "Noida", 489320l);
		
<<<<<<< HEAD
		
		System.out.println("merged in master");
		System.out.println("Git conflict");
=======
		System.out.println("git test code new");
		System.out.println("end comment update");
>>>>>>> 94cdfc42e27cf71f93d7488ed9dd057b40911c8d
	}

}
