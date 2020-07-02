import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;

public class Company {
    //Main method
    //Variables
    final int employeesTotal = 10;
    int count2015;
    int count2014;
    double[] Salaries2014 = new double[employeesTotal];
    double[] Salaries2015 = new double[employeesTotal];
    String fileName;
    String[] headerLine;
    Scanner scanner;
    Scanner file;
    double average;
    double total;


    Employee[] year2014 = new Employee[employeesTotal];

    int year14Index = 0;


    Employee[] year2015 = new Employee[employeesTotal];

    int year15Index = 0;


    public static void main(String[] args) {

        double yearSalary;
        //Employee[] year2014 = new Employee[employeeTotal], year2015 = new Employee[employeeTotal];
        //double[]Salaries2014 = new double[employeeTotal], Salaries2015 = new double[employeeTotal];


        Company myCompany = new Company();
        //Try to open the file
        try {


            FileReader fr = new FileReader("employee.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] values = null;
            String year = null;
            String employeeTitle = null;
            String employeeName = null;
            Double monthlySalary = null;
            int lineNum = 0;

            while ((line = br.readLine()) != null) {
                lineNum++;
                System.out.println(lineNum);
                System.out.println(line);
                if (lineNum > 10) {

                    System.out.println("Max file size 10 lines");
                    System.exit(0);
                }


                values = line.split(",");
                System.out.println(values[0]);
                year = values[0];
                employeeTitle = values[1];
                employeeName = values[2];
                monthlySalary = Double.parseDouble(values[3]);



                //Separate by job title and give salary
                System.out.println(" \n Employee Title is \n" + employeeTitle + "\n");
                switch (employeeTitle) {
                    //employee title
                    case "Employee": {
                        Employee employee = new Employee(employeeName, monthlySalary);
                        yearSalary = employee.getAnnualSalary();
                        myCompany.yearStore(year, employee, yearSalary);
                        break;

                    }

                    //salesman title
                    case "Salesman": {
                        //Double annualSales = lineBreaker.nextDouble();
                        Double annualSales = Double.parseDouble(values[4]);
                        Salesman Salesman = new Salesman(employeeName, monthlySalary, annualSales);
                        Salesman.setAnnualSales(annualSales);
                        yearSalary = Salesman.getAnnualSalary();
                        myCompany.yearStore(year, Salesman, yearSalary);

                        break;
                    }

                    case "Executive": {
                        //Double stock = lineBreaker.nextDouble();
                        Double stock = Double.parseDouble(values[4]);
                        Executive executive = new Executive(employeeName, monthlySalary, stock);
                        executive.annualSalary(monthlySalary, stock);
                        yearSalary = executive.getAnnualSalary();
                        myCompany.yearStore(year, executive, yearSalary);
                        break;
                    }

                }

            }

        }

        //will print stack trace in case of failure
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
        //output to the console.
        myCompany.display("2014");
        myCompany.display("2015");

    }

    //end of main method 


    //Separate by year
    public void yearStore(String year, Employee employee, double yearSalary) {

        if (year == "2014") {
            //add employee to next poisition in array
            this.year2014[year14Index] = employee;
            this.Salaries2014[year14Index] = yearSalary;
            year14Index++;
        } else {
            this.year2015[year15Index] = employee;
            this.Salaries2015[year15Index] = yearSalary;
            year15Index++;
        }
    }


    private void display(String year) {
        //organizing the info using the display method
        double total2014 = 0.00;
        double total2015 = 0.00;
        double average = 0.0;



        average = total2014 / year2014.length;
        average = total2015 / year2015.length;


        //prints annual info for each employee

       System.out.format("\n Employee Info for %s", year);
       for(int i = 0; i < this.year2014.length; i++)
           total2014 += this.Salaries2014[i];


           for (int i = 0; i < this.year2015.length; i++)
           total2015 += this.Salaries2015[i];



        average = total2014 / year2014.length;
        average = total2015 / year2015.length;



        //Prints Average Salary for the year

        if (year == "2014"){
           System.out.format("\n Average Salary for 2014: %2f \n ", average, "\n");
        }else {
           System.out.format("\n  Average Salary for 2015: %2f \n ", average, "\n");
        }

       }
}
