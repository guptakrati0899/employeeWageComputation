package employeeWageComputation;
import java.lang.Math;

public class EmployeeWageBuilder {
		
		    public static final int partTime = 1;
		    public static final int fullTime = 2;

		    private final String company;
		    private final int salaryPerHour;
		    private final int workingDays;
		    private final int maxWorkingHours;
		    private int totalEmpWage;   
		    private int dailyWage; 
		    
		    public EmployeeWageBuilder(String company, int salaryPerHour, int workingDays, 
		                                            int maxWorkingHours) {
		        
		        this.company = company;
		        this.salaryPerHour = salaryPerHour;
		        this.workingDays = workingDays;
		        this.maxWorkingHours = maxWorkingHours;

		    }

		    public void empWageComputation() {
		        
		     
		        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		        while (totalEmpHrs <= maxWorkingHours &&
		               totalWorkingDays < workingDays) {
		            totalWorkingDays++;
		            int checkEmp = (int) Math.floor(Math.random() * 10) % 3;
		            switch (checkEmp) {
		                case fullTime :
		                	System.out.println("Employee is full time present"); 
		                    empHrs = 8;
		                    break;
		                case partTime :
		                    empHrs = 4;
		                    System.out.println("Employee is part time present"); 
		                    break;
		                default :
		                	System.out.println("Employee is absent"); 
		                    empHrs = 0;
		            }
		            totalEmpHrs += empHrs;
		            dailyWage = salaryPerHour*empHrs;
		            System.out.println("Daily Wage :" + dailyWage);
		            
		            System.out.println("Employee Working Days : " +totalWorkingDays + 
                            "     Employee Working Hours : " +totalEmpHrs);
		          
		            
		           
		        }
		        totalEmpWage = totalEmpHrs * salaryPerHour;
		        

		    }

		    @Override
		    public String toString() {
		        return "Total Employee Wage for " + company + " Company is : " + totalEmpWage ;
		    }
		    
		    
		    public static void main (String[] args) {
		    	EmployeeWageBuilder TCS = new EmployeeWageBuilder("TCS", 20, 1, 10);
		    	EmployeeWageBuilder Accenture = new EmployeeWageBuilder("Accenture", 10, 2, 20);
		    	EmployeeWageBuilder HCL = new EmployeeWageBuilder("HCL", 10, 3, 20);
		    	EmployeeWageBuilder Magic = new EmployeeWageBuilder("Magic edTech", 20, 4, 10);
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

