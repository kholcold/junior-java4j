package ru.job4j.tracker;

/**
 * Class Item.
 *
 * @author Alexandr
 * @since 06.12.2017
 */
public class Item {
    /**
     * id.
     */
    String id;
    /**
     * Имя.
     */
    String name;
    /**
     * Описание.
     */
    String desc;
    /**
     * Дата создания.
     */
    long created;
    /**
     * Список комментариев.
     */
    String[] comments;

    /**
     * Конструктор.
     *
     * @param name Имя.
     * @param desc Описание.
     */
    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * Конструктор.
     *
     * @param name Имя.
     * @param desc Описание.
     * @param id   id.
     */
    public Item(String name, String desc, String id) {
        this.name = name;
        this.desc = desc;
        this.id = id;
    }

    /**
     * Конструктор.
     *
     * @param name    Имя.
     * @param desc    Описание.
     * @param created Дата создания.
     */
    public Item(String name, String desc, long created) {
        this.name = name;
        this.desc = desc;
        this.created = created;
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
     * Устанавливаем id.
     *
     * @param id id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Возвращает имя.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает описание.
     *
     * @return desc.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Возвращает время создания.
     *
     * @return created.
     */
    public long getCreated() {
        return created;
    }

    /**
     * Возвращает комментарий.
     *
     * @return comments.
     */
    public String[] getComments() {
        return comments;
    }
}
