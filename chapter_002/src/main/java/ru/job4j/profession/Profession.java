package ru.job4j.profession;

/**
 * Class Professin.
 * Родительский класс.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 24.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Profession {
    public String name;
    public int age;
    public String diploma;
    public String profil;

    /**
     * Get.
     *
     * @return Имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Set.
     *
     * @param name Имя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get.
     *
     * @return Возвраст.
     */
    public int getAge() {
        return age;
    }

    /**
     * Set.
     *
     * @param age Возвраст.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get.
     *
     * @return Диплом.
     */
    public String getDiploma() {
        return diploma;
    }

    /**
     * Set.
     *
     * @param diploma Диплом.
     */
    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    /**
     * Get.
     *
     * @return Профиль.
     */
    public String getProfil() {
        return profil;
    }

    /**
     * Set.
     *
     * @param profil Профиль.
     */
    public void setProfil(String profil) {
        this.profil = profil;
    }
}
