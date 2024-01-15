package fabricadoCarlos;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color){
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }
    public void startEngine(){
        System.out.println("the" + fuelSource + "engine has been started, and is ready to utilize" + horsePower);
    }
    public void clean(){
        System.out.println("Car has been cleaned, and the" + color.toLowerCase() + "color shines");
    }
    public void mechanicCheck(){
        System.out.println("Car has been checked by the mechanic. Everything lookds good!");
    }
    public void fuelcar(){
        System.out.println("Car is being fiiled with" + fuelSource.toLowerCase());
    }
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                ", fuelSource='" + fuelSource + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
