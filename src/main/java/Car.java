public class Car {
    private String make;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String make, String carClass, double weight, Driver driver, Engine engine) {
        this.make = make;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}
