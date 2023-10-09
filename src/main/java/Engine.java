public class Engine {
    private int hpower;
    private String manuf;

    public Engine(int hpower, String manuf) {
        this.hpower = hpower;
        this.manuf = manuf;
    }

    public int getHpower() {
        return hpower;
    }

    public void setHpower(int hpower) {
        this.hpower = hpower;
    }

    public String getManuf() {
        return manuf;
    }

    public void setManuf(String manuf) {
        this.manuf = manuf;
    }
}
