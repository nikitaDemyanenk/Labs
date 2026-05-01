public class Truck extends Vehicle {
    private double payloadCapacity;
    private int axleCount;
    private boolean hasTrailer;

    public Truck (String make, int maxSpeed, int year, double payloadCapacity, int axleCount, boolean hasTrailer) {
        super(make, maxSpeed, year);
        this.payloadCapacity = payloadCapacity;
        this.axleCount = axleCount;
        this.hasTrailer = hasTrailer;
    }

    public Truck () {
        super();
        this.payloadCapacity = 0.0;
        this.axleCount = 0;
        this.hasTrailer = false;
    }

    @Override
    public void doTask() {
        System.out.println("Грузовик " + getMake() + " перевозит много груза или крупногабаритный груз.");
    }

    public void loadCargo() {
        System.out.println("Грузовик " + getMake() + " загружается.");
    }

    public void attachTrailer() {
        this.hasTrailer = true;
        System.out.println("Прицеп сцеплен к " + getMake());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Грузоподъемность: " + payloadCapacity + "т, Оси: " + axleCount + ", Прицеп: " + (hasTrailer ? "Да" : "Нет"));
    }
}