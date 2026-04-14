public final class CombustionCar extends Vehicle implements Security
{
    private int tankCapacity;
    private String fuelType;
    private boolean headlight;

    public CombustionCar(String brand, String model, int velocity, int tankCapacity, String fuelType ){
        super(brand, model, velocity);
        this.tankCapacity = tankCapacity;
        this.fuelType = fuelType;
        this.headlight = false;
    }

    @Override
    public void acelerate(int acceleration) {
        super.acelerate(acceleration);
    }

    @Override
    public boolean absBrake(){
        System.out.println(getModel()+" Abs brake check!!");
        return true;
    }

    @Override
    public void drive(){
        System.out.println("Vruuummm!!!");
        System.out.println();
    }

    @Override
    public void status(){
        System.out.println("[Combustion Car] Brand: "+ getBrand()+ " | Model: "+ getModel() + " | Velocity: "+ getVelocity()+ " | Gas Type: "+ fuelType+ " | Tank Capacity: "+ tankCapacity + " | Headlight: "+ (headlight ? "ON" : "OFF"));
        drive();
    }
}
