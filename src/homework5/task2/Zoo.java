package homework5.task2;

import java.util.ArrayList;

public class Zoo {
    private final ArrayList<Animal> animals = new ArrayList<>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }

    public void add(int index, Animal animal) {
        this.animals.add(index, animal);
    }

    public int size() {
        return animals.size();
    }

    public void remove(int number) {

        for (Animal animal : animals) {
            if(animal.getId() == number) {
                animals.remove(animal);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Zoo{\n" +
                "animals=" + animals +
                "}" +
                "\nsize: " + size();
    }
}
