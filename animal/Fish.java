package animal;

import java.time.LocalDate;
import java.util.List;

import clinic.Swimable;

public class Fish extends Animal implements Swimable{
    private String breed;

    public Fish(String name,
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
     public void getSwimSpeed() {
        System.out.printf("%s '%s' плавает со скоростью %.1f км.ч %n", this.TYPE, this.getName(), this.getSpeed());
     }
}
