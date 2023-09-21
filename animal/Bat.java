package animal;

import java.time.LocalDate;
import java.util.List;
import clinic.Flyable;


public class Bat extends Animal implements Flyable{

    private String breed;

    public Bat(String name,
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
    public void getFlySpeed (){
        System.out.printf("%s '%s' летает со скоростью %.1f км.ч %n", this.TYPE, this.getName(), this.getSpeed());
    };


}
