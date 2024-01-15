package fabricadoCarlos;

public class SemContratosFactory extends Factory {
    @Override
    Car retriaveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Golf (100,"vazio", "verde");
        }else{
            return null;
        }
    }
}
