package employeeWageComputation;
import java.lang.Math;

public class EmployeeWageBuild {
	
 public static final  int partTime=1,fullTime=2;
	
public static int computeEmployeeWage(String company ,int salaryPerHour, int workingDays, int maxWorkingHours) {
	    	   
	    	   int empHours=0,totalEmpHours=0,totalWorkingDays=0,totalEmpWage=0;
	    	   
	    	   while(totalWorkingDays < workingDays && totalEmpHours < maxWorkingHours) {
	    		   
	    		   totalWorkingDays ++;
				    
					  int empCheck = (int)Math.floor(Math.random() *10 )% 3;
					  
					  
					  switch(empCheck) {
					  
					      case partTime:
						  System.out.println("Employee is Present Part Time");
						  empHours=4;
						  break;
						  
					      case fullTime:
					    	  System.out.println("Employee is Present Full Time");
					    	  empHours=8;
					    	  break;
					    	  
					      default:
					    	  System.out.println("Employee is Absent");
					    	  empHours=0;
					    	  
					  }
					  
					  

					    totalEmpHours += empHours;
					    System.out.println("DAY:"+ totalWorkingDays +" Emphrs:" + totalEmpHours);
					    	  
			    }
	    	   
	    	   
					    totalEmpWage= totalEmpHours * salaryPerHour;
					  
					    System.out.println("Total wage for company " + company + " is" + totalEmpWage);
					    return totalEmpWage;
					 	  
				
	       }
					  	
	    
	
		        public static void main(String[] args) {
			       System.out.println("Welcome to Salary Calculator on Master branch"); 
			   
			      computeEmployeeWage("TCS",5,2,10);
			      computeEmployeeWage("Accenture",3,4,20);
			
		
		  }
				           			    

	}

