package ru.job4j.tracker;

/**
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 25.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Item {
    /**
     * Id заявки.
     */
    private String id;
    /**
     * Имя.
     */
    private String name;
    /**
     * Описание.
     */
    private String description;
    /**
     * Дата создания.
     */
    private long create;

    /**
     * Конструктор.
     *
     * @param name        Имя.
     * @param description Описание.
     */
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Конструктор.
     *
     * @param name        Имя.
     * @param description Описание.
     * @param create      Дата создания.
     */
    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    /**
     * Возвращает имя.
     *
     * @return Имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает описание.
     *
     * @return Описание.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Дата создания.
     *
     * @return Дата.
     */
    public long getCreate() {
        return create;
    }

    /**
     * Возвращает id.
     *
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * Устанавливает id.
     *
     * @param id id.
     */
    public void setId(String id) {
        this.id = id;
    }
}
