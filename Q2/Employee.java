//Question 2 b abstract class Employee
public abstract class Employee implements Payable {
    private String staffId;
    private String name;
    //the constructor
    public Employee (String staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }
    public String getStaffId () {
        return staffId;
    }
    public String getName () {
        return name;
    }
    //let's leave calculatePay without body, each child will write its own and the result
    public abstract double calculatePay ();
    public double getPaymentAmount () {
        return calculatePay();
    }
    // this part is for displaying the staffid and name
    public String toString () {
        return "Staff ID: " + staffId + ", Name: " + name;
    }
}
