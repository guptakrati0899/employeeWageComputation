package employeeWageComputation;

public class CompanyEmpWage {
	
		public static final  int partTime=1,fullTime=2;
		 public final String company;
		 public final int salaryPerHour;
		 public final int workingDays;
		 public final int maxWorkingHours;
		 public int totalEmpWage;
		 
		 
		 public CompanyEmpWage (String company ,int salaryPerHour, int workingDays, int maxWorkingHours) {
			 
			 this.company = company;
			 this.salaryPerHour = salaryPerHour;
			 this.workingDays = workingDays;
			 this.maxWorkingHours = maxWorkingHours;
			 
		 }
		 
		 
		 public void setTotalEmpWage(int totalEmpWage) {
			 
			 this.totalEmpWage = totalEmpWage;
			 
			 
		 }
		 
		 public String toString() {
			 return "Total Emp Wage for" + company + "is" + totalEmpWage ;
		 }
	}





