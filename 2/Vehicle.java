public abstract class Vehicle {
    private String make;
    private int maxSpeed;
    private int year;

    private static int vehicleCount = 0;

    public Vehicle(String make, int maxSpeed, int year) {
        this.make = make;
        this.maxSpeed = maxSpeed;
        this.year = year;
        vehicleCount++; 
    }

    public Vehicle() {
        this("Unknown", 0, 2000);
    }

    public String getMake () {
        return make;
    }

    public void setMake (String make) {
        this.make = make;
    }

    public int getMaxSpeed () {
        return maxSpeed;
    }

    public void setMaxSpeed (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear () {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public abstract void doTask();

    public void displayInfo() {
        System.out.println("Транспорт: " + make + ", Скорость: " + maxSpeed + " км/ч, Год: " + year);
    }
}