package NormalSelenium;

import com.google.gson.Gson;

public class Employee {
	public void Employee1(int a,String b,String c) {
		
		
	}
	public static void main(String[] args) {
		
	
	Employee emp = new Employee();
	emp.Employee1(1, "sumesh","hello");
	Gson gson = new Gson();
	String json = gson.toJson(emp);
	System.out.println(json);
	

	
	
	
	 
	}
		
	
		
	

}
