package fabricadoCarlos;

public class ContratosFactory extends Factory{
    @Override
    Car retriaveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new CorolaCar(100,"cheio","preto");
        }else{
            return null;
        }
    }
}
