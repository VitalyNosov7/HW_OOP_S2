/*
// Домашнее задание.
========================================================================
 * Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
========================================================================
V 1. Создать класс Doctor и подумать над его поведением и состоянием.
V 2. Создать класс Nurse(медсестра) и подумать над его поведением и состоянием.
V 3. В классе доктора должно быть поле с типом Nurse.
V 4. Придумайте метод, при котором доктор взаимодействует с медсестрой.

V 5. Создать класс Создайте интерфейсы Runnable, Flyable, Swimable. У интерфейсов должны быть
методы получения скорости заданного действия.

6. Добавьте наследников этим интерфейсам

7. У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих, всех говорящих и всех летающих.

Формат сдачи: ссылка на гитхаб проект
========================================================================
 */


package clinic;

import animal.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic(new ArrayList<>());
        clinic.addAnimal(new Cat("", 12.0, new Owner("Alex"), LocalDate.now(), List.of(new Vaccination("chumka", LocalDate.now())), Color.BLACK, 0.3, ""));
        
  
        Nurse nrsIvanova = new Nurse("Иванова", PersonnelCategory.NURSE, "Медсестра");
        Doctor drPetrov = new Doctor("Petov", PersonnelCategory.DOCTOR, "Ветеринар", nrsIvanova);
        
        nrsIvanova.primaryMedicalExaminationPatient();
        drPetrov.toHaveAnOperation();
        drPetrov.giveTaskToStaff(drPetrov.getName(), nrsIvanova.getName());
        nrsIvanova.toMedicalRecordEntry();
        

    }
}
