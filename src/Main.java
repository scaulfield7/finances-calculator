public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.displayWelcomeMessage();
        calculator.setSalary();
        calculator.calculateSalaryAfterTax(calculator.getSalary());
    }
}