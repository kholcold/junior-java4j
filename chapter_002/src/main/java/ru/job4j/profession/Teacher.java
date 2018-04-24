package ru.job4j.profession;

/**
 * Class Teacher наследуется от Profession.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 24.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Teacher extends Profession {
    /**
     * Рассказ о себе.
     *
     * @return вернет текст.
     */
    public String aboutMe() {
        return "Меня зовут " + getName() + ". Мой возвраст " + getAge() + ". Мой диплом "
                + getDiploma() + ". Мой профиль " + getProfil() + ".";
    }

    /**
     * Учим студента.
     *
     * @param student студент.
     * @return текст.
     */
    public String teach(Student student) {
        return "Учитель " + getName() + " учит студента " + student.getName();
    }
}
