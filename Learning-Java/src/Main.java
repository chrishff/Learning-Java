public class Main {
    public static void main(String[] args) {

        CombustionCar gasCar = new CombustionCar("Porsche", "911 Turbo S", 200, 76, "Gas");
        ElectricCar eCar = new ElectricCar("Porsche", "Taycan", 220, 95);


        eCar.absBrake();
        gasCar.absBrake();
        eCar.headlight();

        eCar.status();
        gasCar.status();

        eCar.acelerate(150);
        gasCar.acelerate(100);

        eCar.brake(50);
        gasCar.brake(25);

        eCar.status();
        gasCar.status();
    }
}
