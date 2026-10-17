//Question 2 c  class SalariedEmployee
public class SalariedEmployee extends Employee {
    private double monthlySalary;
    public SalariedEmployee (String staffId, String name, double monthlySalary) {
        super(staffId, name);
        //for those trying to crash my code with negative typing...
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.monthlySalary = monthlySalary;
    }
    //a salaried employee is paid the monthly salary
    public double calculatePay () {
        return monthlySalary;
    }
}
