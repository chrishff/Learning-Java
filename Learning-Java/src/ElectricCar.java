public final class ElectricCar extends Vehicle implements Security
{
    private final int batteryLevel;
    private boolean headlight;

    public ElectricCar(String brand, String model, int velocity, int batteryLevel){
        super(brand,model,velocity);
        this.batteryLevel = batteryLevel;
        this.headlight = false;
    }

    @Override
    public boolean absBrake(){
        System.out.println(getModel()+" Abs brake check!!");
        return true;
    }

    @Override
    public void drive() {
        System.out.println("ZZZZZZZZ!!");
        System.out.println();
    }

    @Override
    public void status(){
        System.out.println("[Eletric Car] Brand: "+ getBrand()+ " | Model: "+ getModel() + " | Velocity: "+ getVelocity()+ " | Battery Level: "+ batteryLevel + " | Headlight: "+ (headlight ? "ON" : "OFF"));
        drive();
    }
}
