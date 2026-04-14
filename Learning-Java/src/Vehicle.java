public sealed abstract class Vehicle permits ElectricCar,CombustionCar {
    private final String brand;
    private final String model;
    private int velocity;
    private boolean headlight;

    public Vehicle(String brand, String model, int velocity){
        this.brand = brand;
        this.model = model;
        this.velocity = velocity;
        this.headlight = false;
    }
    public void headlight()
    {
        this.headlight = true;
        System.out.println(getModel()+ " Headlight is on!");
    }

    public abstract void drive();
    public abstract void status();

    public void acelerate(int acceleration){
        velocity += acceleration;
    }
    public void brake(int brakePower){
        velocity -= Math.max(0, velocity - brakePower);
    }

    public String getBrand() {return brand;}
    public int getVelocity() {return velocity;}
    public String getModel() {return model;}
}
