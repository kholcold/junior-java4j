package ru.job4j.tracker;

import java.util.ArrayList;
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
    private ArrayList<Item> items = new ArrayList<>();
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
        this.items.add(item);
        return item;
    }

    public void edit(Item fresh) {
        for (int index = 0; index != items.size(); index++) {
            Item item = items.get(index);
            if (item != null && item.getId().equals(fresh.getId())) {
                items.add(index, fresh);
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
        for (int i = 0; i < this.items.size(); i++) {
            if (items.get(i) != null && items.get(i).getId().equals(item.getId())) {
                items.set(i, item);
                break;
            }

        }

    }

    /**
     * Удаление заявок.
     */
    public void delete(Item item) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(item.getId())) {
                this.items.remove(i);
                break;
            }

        }
    }

    /**
     * Получение списка всех заявок.
     *
     * @return result.
     */
    public ArrayList<Item> findAll() {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item != null) result.add(item);
        }
        return result;
    }

    /**
     * Получение списка по имени.
     *
     * @param key Имя которое ищем.
     * @return result.
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();

        for (Item item : this.items) {
            if (item != null && item.getName().equals(key)) {
                result.add(item);
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
