package ru.job4j.profession;

/**
 * Class Engineer наследуется от Profesion.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 24.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Engineer extends Profession {
    /**
     * Раскажем о себе.
     *
     * @return вернет текст.
     */
    public String aboutMe() {
        return "Меня зовут " + getName() + ". Мой возвраст " + getAge() + ". Мой диплом "
                + getDiploma() + ". Мой профиль " + getProfil() + ".";
    }

    /**
     * Чем занимается.
     *
     * @return вернет текст.
     */
    public String working() {
        return "Инженер " + getName() + " пишет код.";
    }
}
