package animal;

import java.time.LocalDate;
import java.util.List;

public class Bird extends Animal {
    private String breed;

    public Bird(String name,
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

}
