//Question 2 c class HourlyEmployee
public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;
    public HourlyEmployee (String staffId, String name, double hoursWorked, double hourlyRate) {
        super(staffId, name);
        //there is no negative hours or rate, this code bellow is to prevent that
        if (hoursWorked < 0 || hourlyRate < 0) {
            throw new IllegalArgumentException("Hours and rate cannot be negative");
        }
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    //an hourly employee is paid hours multiplied by the rate
    public double calculatePay () {
        return hoursWorked * hourlyRate;
    }
}
