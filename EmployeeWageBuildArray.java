package employeeWageComputation;

public class EmployeeWageBuildArray {
	

	
 public static final  int partTime=1,fullTime=2;
private int numberOfCompany=0;
private CompanyEmpWage[] companyEmpWageArray;


 public EmployeeWageBuildArray() {
	 companyEmpWageArray = new CompanyEmpWage[5];
	 
 }
 
 private void addCompanyEmpWage(String company ,int salaryPerHour, int workingDays, int maxWorkingHours) {
	 
	 
	 companyEmpWageArray[numberOfCompany]= new CompanyEmpWage(company, salaryPerHour, workingDays, maxWorkingHours);
			 
			 numberOfCompany ++;
	 
 }

	
private void computeEmpWage() {
	
	        for(int i=0;i<numberOfCompany;i++) {
	        	companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
	        	System.out.println(companyEmpWageArray[i]);
	        	
	        	
	        }
	        
}
               private int computeEmpWage(CompanyEmpWage companyEmpWage) {
            	   
	    	   
	    	   int empHours=0,totalEmpHours=0,totalWorkingDays=0;
	    	   
	    	   while(totalWorkingDays < companyEmpWage.workingDays && totalEmpHours <= companyEmpWage.maxWorkingHours) {
	    		   
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
	    	   
	    	   
					    return totalEmpHours * companyEmpWage.salaryPerHour;
					    
               }
             
                    
                      
             
              
              
					  	
	    
	
		        public static void main(String[] args) {
			       System.out.println("Welcome to Salary Calculator on Master branch"); 
			       
			      EmployeeWageBuildArray empWageBuild =new EmployeeWageBuildArray();
			      empWageBuild.addCompanyEmpWage("TCS",5,2,10);
			      empWageBuild.addCompanyEmpWage("Accenture",3,4,20);
			      empWageBuild.computeEmpWage();
			      
			  
		  }
				           			    

	}




