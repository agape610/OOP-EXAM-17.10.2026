//Question 6   subclass FullTimeStaff
import java.util.Scanner;

public class FullTimeStaff extends Staff {
    private double basicSalary;
    private double deductionRate = 0.15;   //statutory deductions: 15%

    public FullTimeStaff (String staffNo, String staffName, int staffAge, double basicSalary) {
        super(staffNo, staffName, staffAge);
        this.basicSalary = basicSalary;
    }

    //let's calculate the net monthly salary
    public double calculateNetPay () {
        double deductions = basicSalary * deductionRate;
        return basicSalary - deductions;
    }

    //let's override the method to add the monthly pay
    @Override
    public void displayInfo () {
        super.displayInfo();
        System.out.println("Monthly net pay: " + calculateNetPay() + " USD");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter staff number: ");
        String staffNo = input.nextLine();

        System.out.print("Enter staff name: ");
        String staffName = input.nextLine();

        System.out.print("Enter staff age: ");
        int staffAge = input.nextInt();

        System.out.print("Enter basic salary (USD): ");
        double basicSalary = input.nextDouble();

        //let's create the object and call the overridden method
        FullTimeStaff ft = new FullTimeStaff(staffNo, staffName, staffAge, basicSalary);
        ft.displayInfo();

        input.close();
    }
}
