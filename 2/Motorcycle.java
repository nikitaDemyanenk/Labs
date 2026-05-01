public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int engineVolume;
    private String motoType;


    public Motorcycle (String make, int maxSpeed, int year, boolean hasSidecar, int engineVolume, String motoType) {
        super(make, maxSpeed, year);
        this.hasSidecar = hasSidecar;
        this.engineVolume = engineVolume;
        this.motoType = motoType;
    }

    public Motorcycle () {
        super();
        this.hasSidecar = false;
        this.engineVolume = 0;
        this.motoType = "Unknown";
    }

    @Override
    public void doTask() {
        System.out.println("Мотоцикл " + getMake() + " обеспечивает транспортировку 1-2 человек в условиях ограниченного пространства, где проезд автомобилей невозможен.");
    }

    public void attachSidecar() {
        this.hasSidecar = true;
        System.out.println("К мотоциклу " + getMake() + " присоединена коляска.");
    }

    public void park() {
        System.out.println("Мотоцикл " + getMake() + " припаркован.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: " + motoType + ", Объем: " + engineVolume + "cc, Коляска: " + (hasSidecar ? "Да" : "Нет"));
    }
}