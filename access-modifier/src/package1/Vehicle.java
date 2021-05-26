package package1;

public class Vehicle {
    private int wheelCount;

    // [case1] protected - Car Class (subclass of Vehicle class)
//    protected Vehicle(int wheelCount) {
//        this.wheelCount = wheelCount;
//    }

    // [case2] No modifier - Bus Class
//    Vehicle(int wheelCount) {
//        this.wheelCount = wheelCount;
//    }

    // [case3]
//    private static final Vehicle uniqueInstance = new Vehicle();
//    private Vehicle() {}
//    public static Vehicle getInstance(){
//        return uniqueInstance;
//    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}
