package employeeWageComputation;


public class EmployeeWageBuild {
	
 public static final  int partTime=1,fullTime=2;
 private final String company;
 private final int salaryPerHour;
 private final int workingDays;
 private final int maxWorkingHours;
 private int totalEmpWage;
 
 
 public EmployeeWageBuild (String company ,int salaryPerHour, int workingDays, int maxWorkingHours) {
	 
	 this.company = company;
	 this.salaryPerHour = salaryPerHour;
	 this.workingDays = workingDays;
	 this.maxWorkingHours = maxWorkingHours;
	 
 }
	
public void computeEmployeeWage() {
	    	   
	    	   int empHours=0,totalEmpHours=0,totalWorkingDays=0;
	    	   
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
					     System.out.println("The wage for "+ company + " is "+ totalEmpWage); 
					     
					     int totalWageTCS=5*2*10;
					     int totalWageAccenture=3*4*20;
					     
					     int wageSaveTCS=totalWageTCS-totalEmpWage;
					 
				
	       }
                    
                      
             
              
              
					  	
	    
	
		        public static void main(String[] args) {
			       System.out.println("Welcome to Salary Calculator on Master branch"); 
			       
			      EmployeeWageBuild TCS =new EmployeeWageBuild("TCS",5,2,10);
			      EmployeeWageBuild Accenture =new EmployeeWageBuild("Accenture",3,4,20);
			      
			      TCS.computeEmployeeWage();
			      System.out.println(TCS);
			      Accenture.computeEmployeeWage();
			      System.out.println(Accenture);
		
		  }
				           			    

	}

