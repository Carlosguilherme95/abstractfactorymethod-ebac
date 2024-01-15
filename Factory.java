package fabricadoCarlos;

public abstract class Factory {
    public Car create (String requestedGrade){
        Car car = retriaveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }
    private Car prepareCar(Car car){
        car.clean();
        car.mechanicCheck();
        car.fuelcar();
        return car;
    }
    abstract Car retriaveCar(String requestedGrade);


}
