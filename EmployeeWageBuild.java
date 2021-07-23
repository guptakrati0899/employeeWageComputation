package employeeWageComputation;
import java.lang.Math;

public class EmployeeWageBuild {
	
		   public static void main(String[] args) {
			    System.out.println("Welcome to Salary Calculator on Master branch"); 
			    
			   int empHours=0,salaryPerHour=20,empWageDaily=0;
			    
			  double empCheck = Math.floor(Math.random() *10 )% 2;
			  if(empCheck==1) {
				  System.out.println("Employee is Present");
				  empHours=8;
			  }
			  else {
				  
				 System.out.println("Employee is absent");
				 empHours=0;
			  }
			  empWageDaily = empHours*salaryPerHour;
			  System.out.println("Daily Wage Of Employee is: " + empWageDaily);
			  
			  
			  
		
		  }
				           			    

	}

