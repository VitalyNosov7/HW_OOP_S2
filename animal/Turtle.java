package animal;

import java.time.LocalDate;
import java.util.List;
import clinic.Runable;
import clinic.Swimable;

public class Turtle extends Animal implements Runable, Swimable {

    private String breed;

    public Turtle(String name,
            double weight,
            Owner owner,
            LocalDate birthDay,
            List<Vaccination> vaccinations,
            Color color,
            double speed,
            String breed) {
        super(name, weight, owner, birthDay, vaccinations, color, speed);
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void getRunSpeed() {
        System.out.printf("%s '%s' бегает со скоростью %.1f км.ч %n", this.TYPE, this.getName(), this.getSpeed());
    }

    @Override
    public void getSwimSpeed() {
        System.out.printf("%s '%s' плавает со скоростью %.1f км.ч %n", this.TYPE, this.getName(), this.getSpeed() * 2);
    }

}
