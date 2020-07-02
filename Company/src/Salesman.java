public class Salesman extends Employee {
    //Variables for this class
    private double annualSales;
    private double commission;
    private double monthlySalary;
    String employeeName;
    private double annualSalary;

    //Constructor that allows the Employee Name, monthly Salary and annual Sales to initialize
    public Salesman (String employeeName, double monthlySalary, double annualSales) {
        super(employeeName, monthlySalary);
        double annualSalary = monthlySalary * 12;
        this.annualSales = annualSales;
        this.commission = commission;
        this.setEmployeeType("Salesman");
    }

    //Override method to overide annual salary to factor in commission
    /* Salesman salary is computed by taking the annual salary and adding commission.
     commission is calculated at 2% with a cap of 20000.
      */

    @Override
    //computing 2% of commission
    public void annualSalary(double monthlySalary) {
        double commission = annualSales * .02;

        //capping commission at 20,000 for a salesman
        if (commission > 20000) {
            commission =2000;
        }

        //If commission is less than 20,000
        {
            this.annualSalary = monthlySalary * 12 + commission;
        }

    }


    public double getAnnualSalary() {
        return this.annualSalary;
    }

    //Overriden toString for name, Monthly Salary and Annual Sales
    @Override
    public String toString() {
        return super.toString()+ String.format("\n Employees Name: %s" , this.employeeName, " Annual Sales: %s, %.2f", annualSales );
    }


    //Getter and Setter methods to access private variables

    //AnnualSales Getter & Setter
    public double getAnnualSales(){

        return this.annualSales;
    }

    public void setAnnualSales(double annualSales){

        this.annualSales = annualSales;
    }



    //EmployeeName Getter and Setter
    public String getEmployeeName(){
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName){

        super.setEmployeeName(employeeName);
    }



    //MonthlySalary Getter and Setter
    public double getMonthlySalary(){

        return super.getMonthlySalary();
    }

    public void setMonthlySalary(double monthlySalary){

        this.monthlySalary = monthlySalary;
    }




}
