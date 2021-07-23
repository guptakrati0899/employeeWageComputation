package employeeWageComputation;
import java.lang.Math;

public class EmployeeWageBuild {
	
		   public static void main(String[] args) {
			    System.out.println("Welcome to Salary Calculator on Master branch"); 
			    
			   int salaryPerHour=20,partTime=1,fullTime=2;
			   int empHours=0,empWageDaily=0;
			    
			  double empCheck = Math.floor(Math.random() *10 )% 3;
			  if(empCheck==partTime) {
				  System.out.println("Employee is Present Part Time");
				  empHours=4;
			  }
			  
			  else if(empCheck==fullTime) {
				  
				 System.out.println("Employee is Present Full Time");
				 empHours=8;
			  }
			  
			  else {
				  
				  System.out.println("Employee is Absent");
				  
			  }
			  empWageDaily = empHours*salaryPerHour;
			  System.out.println("Daily Wage Of Employee is: " + empWageDaily);
			  
			  
			  
		
		  }
				           			    

	}

