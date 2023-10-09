public class Lorry extends Car{
    private double cCap;

    public Lorry(String make, String carClass, double weight, Driver driver, Engine engine, double cCap) {
        super(make, carClass, weight, driver, engine);
        this.cCap = cCap;
    }

    public double getCCap() {
        return cCap;
    }

    public void setCCap(double cCap) {
        this.cCap = cCap;
    }
}
