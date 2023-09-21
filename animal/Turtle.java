package animal;

import java.time.LocalDate;
import java.util.List;

public class Turtle extends Animal {

    private String breed;
    //private Boolean flyingAnimal = true;

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

}
