/*
// Домашнее задание.
========================================================================
// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
========================================================================

// V    1. Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
// V    2. Создать по два класса наследника Animal, умеющих летать, плавать, бегать.
// V    3. Добиться того, чтобы не умеющие летать не могли этого делать, либо как-то оповещали об этом пользователя.

// САМАЯ ВАЖНАЯ ЧАСТЬ:
// В файле readme.md в репозитории гитхаб описать
// какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
// (если они есть)
========================================================================
*/

package animal;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));

        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 0.7, "Такса");
        Turtle Donatelo = new Turtle("Donatelo", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 1.5, "Морская черепаха");
        Bat Aero = new Bat("Aero", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 5.4, "летучая мышь");
        Cat pushok = new Cat("pushok", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE,7.3, "Сфинкс");
        Bird Kesha = new Bird("Kesha", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 11, "Попугай");
        Rat Larisa = new Rat("Larisa", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, 8.0, "Крыса Сирийская");
        Fish Nemo = new Fish("Nemo", 0.1, alex,  LocalDate.now(), null, null, 0.1, null);

        Donatelo.getRunSpeed();
        Donatelo.getSwimSpeed();
        barbos.getRunSpeed();
        Aero.getFlySpeed();
        pushok.getRunSpeed();
        Kesha.getFlySpeed();
        Larisa.getRunSpeed();
        Nemo.getSwimSpeed();
        Larisa.toGo();
    }
}