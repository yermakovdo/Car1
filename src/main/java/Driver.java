class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

public class Driver extends Person {
    private int drvExp;

    public Driver(String fullName, int drvExp) {
        super(fullName);
        this.drvExp = drvExp;
    }

    public int getDrvExp() {
        return drvExp;
    }

    public void setDrvExp(int drvExp) {
        this.drvExp = drvExp;
    }
}
