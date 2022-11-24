package WestTwo.Round2.Problem1;

public class AnimalNotFountException extends RuntimeException {
    private Animal animal;
    public AnimalNotFountException(Animal animal){
        this.animal=animal;
    }

    public String getAnimalName() {
        return animal.getName();
    }
}
