package ru.job4j.profession;

/**
 * Class Patient.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 24.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Patient {
    public String name;
    public String diagnosis;

    /**
     * getName.
     *
     * @return Вернет имя.
     */
    public String getName() {
        return name;
    }

    /**
     * setName.
     *
     * @param name установить имя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getDiagnosis.
     *
     * @return вернет диагноз.
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * setDiagnosis.
     *
     * @param diagnosis вернет диагноз.
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
