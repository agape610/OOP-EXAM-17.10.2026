//Question 6 - superclass Staff (no main here)
public class Staff {
    private String staffNo;
    private String staffName;
    private int staffAge;

    public Staff (String staffNo, String staffName, int staffAge) {
        this.staffNo = staffNo;
        this.staffName = staffName;
        this.staffAge = staffAge;
    }

    //let's define the method that prints the staff number, name and age
    public void displayInfo () {
        System.out.println("Staff No: " + staffNo);
        System.out.println("Name: " + staffName);
        System.out.println("Age: " + staffAge);
    }
}
