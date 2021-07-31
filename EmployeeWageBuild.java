package employeeWageComputation;
import java.lang.Math;


public class EmployeeWageBuild {
	


	    public static final int PARTTIME = 1;
	    public static final int FULLTIME = 2;

	    private final String company;
	    private final int empRatePerHour;
	    private final int numberOfWorkingDays;
	    private final int hrsPerMonth;
	    private int totalEmpWage;    
	    
	    public EmployeeWageBuild(String company, int empRatePerHour, int numberOfWorkingDays, 
	                                            int hrsPerMonth) {
	        
	        this.company = company;
	        this.empRatePerHour = empRatePerHour;
	        this.numberOfWorkingDays = numberOfWorkingDays;
	        this.hrsPerMonth = hrsPerMonth;

	    }

	    public void empWageComputation() {
	        
	        //Variables
	        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

	        //Computation
	        while (totalEmpHrs <= hrsPerMonth &&
	               totalWorkingDays < numberOfWorkingDays) {
	            totalWorkingDays++;
	            int checkEmp = (int) Math.floor(Math.random() * 10) % 3;
	            switch (checkEmp) {
	                case FULLTIME :
	                    empHrs = 8;
	                    break;
	                case PARTTIME :
	                    empHrs = 4;
	                    break;
	                default :
	                    empHrs = 0;
	            }
	            totalEmpHrs += empHrs;
	            System.out.println("Employee Working Days : " +totalWorkingDays + 
	                                "     Employee Working Hours : " +totalEmpHrs);
	        }
	        totalEmpWage = totalEmpHrs + empRatePerHour;

	    }

	    @Override
	    public String toString() {
	        return "Total Employee Wage for " +company+ " Company is : " +totalEmpWage;
	    }
	    public static void main (String[] args) {
	    	EmployeeWageBuild TCS = new EmployeeWageBuild("TCS", 20, 1, 10);
	    	EmployeeWageBuild Accenture = new EmployeeWageBuild("Accenture", 10, 2, 20);
	    	EmployeeWageBuild HCL = new EmployeeWageBuild("HCL", 10, 3, 20);
	    	EmployeeWageBuild Magic = new EmployeeWageBuild("Magic edTech", 20, 4, 10);
	        TCS.empWageComputation();
	        System.out.println(TCS);
	        Accenture.empWageComputation();
	        System.out.println(Accenture);
	        HCL.empWageComputation();
	        System.out.println(HCL);
	        Magic.empWageComputation();
	        System.out.println(Magic);
	    }
	}