public class Employee {
    //Name and Monthly Salary Variables
    private  String employeeName;
    private double monthlySalary;
    private String employeeType;
    private double annualSalary;
    private int year;


    //Constructor for Name and Salary

    public Employee(String employeeName, double monthlySalary) {
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
        this.employeeType = "Employee";
        this.annualSalary(monthlySalary);
    }


    //Annual Salary Method (Monthly Salary * 12)
    public void annualSalary(double monthlySalary) {

        this.annualSalary =  (monthlySalary * 12);
    }

    //toString method that will return the Employees Name and Monthly Salary
    public String toString() {
        return String.format("Employees Salary : %s, %.2f", employeeName, monthlySalary );
    }


    //Getters and Setters

    //EmployeeName Getter & setter
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }


    //monthlySalary Getters & Setter
    public double getMonthlySalary(){
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    //year getter & setter
    public int getYear(){
        return year;
    }

    public void setYear(){
        this.year = year;
    }

    //annualSalary getter & setters
    public double getAnnualSalary(){
        return annualSalary;
    }

    public void setAnnualSalary(){
        this.annualSalary = annualSalary;
    }

    public void setEmployeeType(String eType) {
        this.employeeType = eType;
    }

    public String getEmployeeType() {
        return this.employeeType;
    }

}
