package clinic;

import animal.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));

        Nurse nrsIvanova = new Nurse("Иванова", PersonnelCategory.NURSE, "Медсестра");
        Doctor drPetrov = new Doctor("Petov", PersonnelCategory.DOCTOR, "Ветеринар", nrsIvanova);

        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 0.7, "Такса");
        Turtle Donatelo = new Turtle("Donatelo", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 1.5,
                "Морская черепаха");
        Bat Aero = new Bat("Aero", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 5.4, "летучая мышь");
        Cat pushok = new Cat("pushok", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 7.3, "Сфинкс");
        Bird Kesha = new Bird("Kesha", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 11, "Попугай");
        Rat Larisa = new Rat("Larisa", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 8.0,
                "Крыса Сирийская");
        Fish Nemo = new Fish("Nemo", 0.1, alex, LocalDate.now(), null, null, 0.1, null);

        nrsIvanova.primaryMedicalExaminationPatient();
        drPetrov.toHaveAnOperation();
        drPetrov.giveTaskToStaff(drPetrov.getName(), nrsIvanova.getName());
        nrsIvanova.toMedicalRecordEntry();

        VeterinaryClinic veterinaryClinic = new VeterinaryClinic(new ArrayList<>());

        veterinaryClinic.addAnimal(barbos);
        veterinaryClinic.addAnimal(Donatelo);
        veterinaryClinic.addAnimal(Aero);
        veterinaryClinic.addAnimal(pushok);
        veterinaryClinic.addAnimal(Kesha);
        veterinaryClinic.addAnimal(Larisa);
        veterinaryClinic.addAnimal(Nemo);

        System.out.println("=========================================");
        veterinaryClinic.getRunAnimal();
        System.out.println("=========================================");
        veterinaryClinic.getFlyAnimal();
        System.out.println("=========================================");
        veterinaryClinic.getSwimAnimal();
        System.out.println("=========================================");

    }
}
