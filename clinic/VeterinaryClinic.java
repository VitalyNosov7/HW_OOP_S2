package clinic;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public final class VeterinaryClinic {
    private List<Animal> pacients;

    public VeterinaryClinic(List<Animal> pacients) {
        this.pacients = pacients;
    }

    public void addAnimal(Animal animal) {
        pacients.add(animal);
    }

    public List<Animal> getPacients() {
        return pacients;
    }

    public void getRunAnimal() {
        List<Animal> runAnimal = new ArrayList<>();
        for (Animal animal : this.pacients)
            if (animal instanceof Runable) {
                runAnimal.add(animal);
            }
        System.out.println("Список  животных, которые умеют бегать:");
        System.out.println(runAnimal);
    }

    public void getFlyAnimal() {
        List<Animal> flyAnimal = new ArrayList<>();
        for (Animal animal : this.pacients)
            if (animal instanceof Flyable) {
                flyAnimal.add(animal);
            }
        System.out.println("Список  животных, которые умеют летать:");
        System.out.println(flyAnimal);
    }

    public void getSwimAnimal() {
        List<Animal> swimAnimal = new ArrayList<>();
        for (Animal animal : this.pacients)
            if (animal instanceof Swimable) {
                swimAnimal.add(animal);
            }
        System.out.println("Список  животных, которые умеют плавать:");
        System.out.println(swimAnimal);
    }
}
