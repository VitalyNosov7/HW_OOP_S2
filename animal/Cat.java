package animal;

import java.time.LocalDate;
import java.util.List;
import clinic.Runable;

public class Cat extends Animal  implements Runable{
    private String breed;

    public Cat(String name,
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
        //System.out.printf("%s по кличке '%s' убегает к хозяину со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }
}
