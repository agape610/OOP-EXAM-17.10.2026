//Question 6 - subclass PartTimeStaff (has its own main)
import java.util.Scanner;

public class PartTimeStaff extends Staff {
    private int hoursWorked;
    private double ratePerHour = 10;   //10 US dollars per hour
    private double taxRate = 0.30;     //tax of 30%

    public PartTimeStaff (String staffNo, String staffName, int staffAge, int hoursWorked) {
        super(staffNo, staffName, staffAge);
        this.hoursWorked = hoursWorked;
    }

    //let's calculate the net monthly pay
    public double calculateNetPay () {
        double totalPay = hoursWorked * ratePerHour;
        double tax = totalPay * taxRate;
        return totalPay - tax;
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

        System.out.print("Enter hours worked this month: ");
        int hoursWorked = input.nextInt();

        //let's create the object and call the overridden method
        PartTimeStaff pt = new PartTimeStaff(staffNo, staffName, staffAge, hoursWorked);
        pt.displayInfo();

        input.close();
    }
}
