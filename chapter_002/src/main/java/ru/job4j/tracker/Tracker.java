package ru.job4j.tracker;

import java.util.Random;

/**
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 25.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    /**
     * Генератор случайных чисел.
     */
    private static final Random RN = new Random();

    /**
     * Генератор id.
     *
     * @return случайное id.
     */
    public String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Добавление заявок.
     *
     * @param item заявка.
     * @return заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }

    /**
     * Редактирование заявки по id.
     *
     * @param id   id.
     * @param item Заявка.
     */
    public void replace(String id, Item item) {
        for (int i = 0; i != this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = item;
                break;
            }
        }
    }

    /**
     * Удаление заявок.
     *
     * @param id Id.
     */
    public void delete(String id) {
        for (int i = 0; i != position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = null;
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - (i + 1));
            }
        }
    }

    /**
     * Получение списка всех заявок.
     *
     * @return Заявки.
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * Получение списка по имени.
     *
     * @param key Имя.
     * @return Заявка.
     */
    public Item[] findByName(String key) {
        int arrayLong = 0;
        int index = 0;

        for (Item item : this.items) {
            if (item != null && item.getName().equals(key)) {
                arrayLong++;
            }
        }

        Item[] result = new Item[arrayLong];

        for (Item item : this.items) {
            if (item != null && item.getName().equals(key)) {
                result[index++] = item;
            }
        }
        return result;
    }

    /**
     * Получение заявки по id.
     *
     * @param id Id.
     * @return Заявка.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }


}
