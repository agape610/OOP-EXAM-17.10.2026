//Question 3 e concrete subclass Car 
public class Car extends Vehicle {
    private int seats;
    public Car (String plate, int seats) {
        super(plate);
        this.seats = seats;
    }
    //start
    public void start () {
        System.out.println("The car " + getPlate() + " starts");
    }
    //stop
    public void stop () {
        System.out.println("The car " + getPlate() + " stops");
    }
    public void showSeats () {
        System.out.println("Number of seats: " + seats);
    }
}
