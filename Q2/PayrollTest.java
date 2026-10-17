//Question 2 d class PayrollTest
//This is the one you can run to test  Sir
public class PayrollTest {
    public static void main(String[] args) {
        //let's keep both employees in an array of type Payable
        Payable[] staffList = new Payable[2];
        staffList[0] = new SalariedEmployee("S001", "Agape", 1500000);
        staffList[1] = new HourlyEmployee("H001", "Grace", 40, 12000);
        double total = 0;
        int x = 0;
        //printing each payment amount with a loop
        while (x < staffList.length) {
            System.out.println(staffList[x].toString());
            System.out.println("Payment amount: " + staffList[x].getPaymentAmount());
            total = total + staffList[x].getPaymentAmount();
            x++;
        }
        //here is the total payroll
        System.out.println("Total payroll: " + total);
    }
}
