public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String make, String carClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(make, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
