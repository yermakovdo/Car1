import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите ФИО водителя ");
        String drvName = scanner.nextLine();
        System.out.print("введите стаж вождения ");
        int drvExp = scanner.nextInt();

        System.out.print("введите марку автомобиля ");
        String make = scanner.nextLine();
        System.out.print("введите класс автомобиля ");
        String carClass = scanner.nextLine();
        System.out.print("введите вес автомобиля ");
        double weight = scanner.nextDouble();

        System.out.print("введите мощность двигателя ");
        int hpower = scanner.nextInt();
        System.out.print("введите производителя двигателя ");
        String engineManuf = scanner.nextLine();

        System.out.print("выберите тип автомобиля: 1 - легковой, 2 - грузовой, 3 - спортивный ");
        int carType = scanner.nextInt();

        Driver driver = new Driver(drvName, drvExp);
        Engine engine = new Engine(hpower, engineManuf);

        if (carType == 1) {
            Car car = new Car(make, carClass, weight, driver, engine);
            car.start();
            car.turnRight();
            car.stop();
            System.out.println(car.toString());
        } else if (carType == 2) {
            System.out.print("введите грузоподъемность грузовика ");
            double cCap = scanner.nextDouble();
            Lorry lorry = new Lorry(make, carClass, weight, driver, engine, cCap);
            System.out.println("грузоподъемность грузовика " + lorry.getCCap());
        } else {
            System.out.print("введите предельную скорость спорткара ");
            int maxSpeed = scanner.nextInt();
            SportCar sportCar = new SportCar(make, carClass, weight, driver, engine, maxSpeed);
            System.out.println("предельная скорость спорткара " + sportCar.getMaxSpeed());
        }
    }
}
