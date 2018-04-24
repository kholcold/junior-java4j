package ru.job4j.profession;

/**
 * Class Doctor наследуем от Profession.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 24.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Doctor extends Profession {
    /**
     * Метод aboutMe рассказать о себе.
     *
     * @return вернет текст.
     */
    public String aboutMe() {
        return "Меня зовут " + getName() + ". Мой возвраст " + getAge() + ". Мой диплом "
                + getDiploma() + ". Мой профиль " + getProfil() + ".";
    }

    /**
     * Метод toLearn. Лечим пациента.
     *
     * @param patient пациент.
     * @return вернем сообщение.
     */
    public String toLearn(Patient patient) {
        return "Доктор " + getName() + " вылечил пациента " + patient.getName()
                + " от заболевания " + patient.getDiagnosis();
    }
}
