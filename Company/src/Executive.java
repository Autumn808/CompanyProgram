public class Executive extends Employee {

    //Variables for the Executive class
    private double stock;
    private double totalSalary;
    private double annualSalary;


    //Constructor that allows the name, monthly Salary and stock options to initialize
    public Executive (String employeeName,double monthlySalary, double stock){
        super (employeeName, monthlySalary);
        this.stock = stock;
        this.totalSalary = totalSalary;
    }

    //Override method to AnnualSalary that returns the salary for a whole year. The salary for an
    //executive consists of the base salary computed from the monthly salary plus a bonus.


    //This method adds the bonus to the salary if it applies.
    public void annualSalary(double monthlySalary, double stock){

        //If stock is over 50$ then Exectutive gets 30,000$ bonus
        if(stock > 50){
            this.annualSalary = monthlySalary *  12 +30000;
        }


        //If stock is under 50$ a share no bonus.
        else {
            this.annualSalary = monthlySalary * 12;
        }


    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }

    //overridden toString method that returns Employee name, monthly salary and stock price
    @Override
    public String toString(){
        return super.toString()+String.format("Employees Name: %s", super.getEmployeeName(),"%n Monthly Salary: %s, .2f", super.getMonthlySalary(), "%n Stock Price: %s",.2f, stock );
    }

    //Getter and Setter methods to access private variables



    //EmployeeName Getter and Setter
    public String getEmployeeName(){

        return super.getEmployeeName();
    }

    public void setEmployeeName(String employeeName){

        super.setEmployeeName(employeeName);
    }



    //MonthlySalary Getter and Setter
    public double getMonthlySalary(){

        return super.getMonthlySalary();
    }

    public void setMonthlySalary(double monthlySalary){

        super.setMonthlySalary(monthlySalary);
    }



    //year getter & setters


    //Stock getter & setter
    public double getStock(){
        return stock;
    }

    public void setStock(){
        this.stock = stock;
    }
}
