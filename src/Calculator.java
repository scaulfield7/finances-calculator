import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###.##");
    private double standardTaxRate = 0.2;
    private double upperTaxRate = 0.4;
    private double taxRateBand = 44000;
    private double tax;
    private double salary;
    private double salaryAfterTax;

    public Calculator(){

    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(){
        System.out.print("Enter your gross salary: €");
        this.salary = scanner.nextDouble();
    }

    public void displayWelcomeMessage(){
        System.out.println("Welcome to the finances calculator!\nThis calculator can calculate your salary after tax, based on Irish tax rates.");
    }
    public void calculateSalaryAfterTax(double salary){
        if(salary > taxRateBand){
            double upperSalary = salary - taxRateBand;
            tax = taxRateBand*standardTaxRate + upperSalary*upperTaxRate;
        }
        else{
            tax = salary*standardTaxRate;
        }
        salaryAfterTax = salary - tax;
        System.out.println("Salary after tax: €" + df.format(salaryAfterTax) + " (€" + df.format(salaryAfterTax/12) + " per month)");
    }
}