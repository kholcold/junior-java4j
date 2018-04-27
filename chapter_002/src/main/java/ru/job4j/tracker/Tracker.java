package ru.job4j.tracker;

import java.util.Random;

/**
 * Class Tracker. Класс трекер - это обертка над массивом.
 *
 * @author Alexandr Kholodov.
 * @since 08.11.2017.
 */
public class Tracker {
    /**
     * Создание массива items c длинной 100.
     */
    private Item[] items = new Item[100];
    /**
     * Позиция.
     */
    private int position = 0;
    /**
     * Константа RN присваивается рандомно.
     */
    private static final Random RN = new Random();

    /**
     * Добавление заявок.
     *
     * @return item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }

    public void edit(Item fresh) {
        for (int index = 0; index != items.length; index++) {
            Item item = items[index];
            if (item != null && item.getId().equals(fresh.getId())) {
                items[index] = fresh;
                break;
            }
        }
    }

    /**
     * Генератор Id.
     *
     * @return Id.
     */

    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Редактирование заявок.
     */
    public void update(Item item) {
        for (int i = 0; i < this.position; i++) {
            if (items[i] != null && items[i].getId().equals(item.getId())) {
                items[i] = item;
                break;
            }

        }

    }

    /**
     * Удаление заявок.
     */
    public void delete(Item item) {
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(item.getId())) {
                this.items[i] = null;
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - (i + 1));
            }

        }
    }

    /**
     * Получение списка всех заявок.
     *
     * @return result.
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
     * @param key Имя которое ищем.
     * @return result.
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
     * @param id По какому id ищем.
     * @return result.
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
