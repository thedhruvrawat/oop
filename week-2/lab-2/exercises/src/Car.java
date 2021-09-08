import java.lang.Math;
class Car {
    private int year;
    private String make;
    private double speed;
    
    public Car(int year, String model, double initSpeed) {
        this.year = year;
        this.make = model;
        this.speed = initSpeed;
    }

    public int getYear() {
        return this.year;
    }

    public String getMake() {
        return this.make;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void Accelerate() {
        this.speed++;
    }

    public void Accelerate(int increment) {
        this.speed += increment;
    }

    public void Break(int b) {
        this.speed -= Math.sqrt(b);
    }
}
