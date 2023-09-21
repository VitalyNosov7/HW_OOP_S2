package animal;

import clinic.Illable;

import java.time.LocalDate;
import java.util.List;

public class Animal implements Illable {
    private String name;
    private double weight;
    private Owner owner;
    private LocalDate birthDay;
    private List<Vaccination> vaccinations;
    private Color color;
    protected final String TYPE = this.getClass().getSimpleName();
    protected double speed;

    public Animal(
            String name,
            double weight,
            Owner owner,
            LocalDate birthDay,
            List<Vaccination> vaccinations,
            Color color,
            double speed) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.color = color;
        this.speed = speed;

    }

    public Animal(
            String name,
            double weight,
            Owner owner,
            LocalDate birthDay,
            Color color,
            Boolean flyingAnimal) {
        this(name, weight, owner, birthDay, null, color, 0.0);
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void lifeCycle() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }


    private void wakeUp() {
        System.out.printf("%s   %s проснулся.%n", this.TYPE, this.getName());
    }

    protected void toGo() {
        System.out.printf("%s   %s двигается.%n", this.TYPE, this.getName());
    }

    private void findFood() {
        System.out.printf("%s   %s ищет еду.%n", this.TYPE, this.getName());
    }

    private void eat() {
        System.out.printf("%s   %s ищет кушает.%n", this.TYPE, this.getName());
    }

    private void toPlay() {
        System.out.printf("%s   %s играет.%n", this.TYPE, this.getName());
    }

    private void goToSleep() {
        System.out.printf("%s   %s ищет собирается спать.%n", this.TYPE, this.getName());
    }

    public void toSound() {
        System.out.printf("%s   %s ищет издает звук.%n", this.TYPE, this.getName());
    }

    // getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Color getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override
    public void heal() {
        System.out.printf("%s лечит ",this.TYPE);
    }

    @Override
    public String toString() {
        return TYPE + " по кличке " + name + '\'';
    }
}
