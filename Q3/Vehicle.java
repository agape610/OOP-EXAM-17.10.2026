//Question 3 d abstract class Vehicle with two abstract methods
public abstract class Vehicle {
    private String plate;
    //the constructor
    public Vehicle (String plate) {
        this.plate = plate;
    }
    public String getPlate () {
        return plate;
    }
    //let's define the two abstract methods, no body here
    public abstract void start ();
    public abstract void stop ();
}
