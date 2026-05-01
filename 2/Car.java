public class Car extends Vehicle {
    private int seats;
    private String bodyType;
    private String color;
    private String transmissionType;


    public Car (String make, int maxSpeed, int year, int seats, String bodyType, String color, String transmissionType) {
        super(make, maxSpeed, year);
        this.seats = seats;
        this.bodyType = bodyType;
        this.color = color;
        this.transmissionType = transmissionType;
    }

    public Car () {
        super();
        this.seats = 0;
        this.color = "White";
        this.transmissionType = "Manual";
    }

    public void doTask() {
        System.out.println("Автомобиль " + getMake() + " перевозит людей и малогабаритный груз.");
    }

    public void repaint(String newColor) {
        this.color = newColor;
        System.out.println("Автомобиль " + getMake() + " перекрашен в " + newColor);
    }

    public void setTransmission(String newTransmission) {
        this.transmissionType = newTransmission;
        System.out.println("Тип коробки передач автомобиля " + getMake() + " изменен на: " + newTransmission);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Мест: " + seats + ", Цвет: " + color + ", Коробка: " + transmissionType);
    }
}