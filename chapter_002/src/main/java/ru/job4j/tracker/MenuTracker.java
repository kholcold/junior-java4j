package ru.job4j.tracker;

import java.util.ArrayList;

/**
 * Класс редактирование заявки.
 */
class EditItem extends BaseAction {
    /**
     * Конструктор класса.
     *
     * @param menuName Имя меню.
     * @param key      Номер меню.
     */
    public EditItem(String menuName, int key) {
        super(menuName, key);
    }

    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите id заявки: ");
        String name = input.ask("Введите имя задачи: ");
        String desc = input.ask("Введите описание задачи: ");
        Task task = new Task(name, desc);
        task.setId(id);
        tracker.edit(task);
    }
}

/**
 * Класс меню трекера.
 */
public class MenuTracker {
    /**
     * Переменная для объекта Input.
     */
    private Input input;
    /**
     * Переменная для объекта Tracker.
     */
    private Tracker tracker;
    /**
     * Массив для реализации интерфейса.
     */
    private ArrayList<UserAction> actions = new ArrayList<>();

    /**
     * Индекс массива.
     */

    private ArrayList<Integer> ranges = new ArrayList<>();

    /**
     * Конструктор класса.
     *
     * @param input   input.
     * @param tracker tracker.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public ArrayList<Integer> getRanges() {
        for (UserAction userAction : actions) {
            ranges.add(userAction.key());
        }
        return ranges;
    }

    public void fillActions() {
        this.actions.add(new AddItem("Add the new item.", 0));
        this.actions.add(new MenuTracker.ShowItems("Show all items.", 1));
        this.actions.add(new EditItem("Edit the new item.", 2));
        this.actions.add(new DeleteItem("Delete item.", 3));
        this.actions.add(new FindItemById("Find item by Id.", 4));
        this.actions.add(new FindItemsByName("Find items by name.", 5));
    }

    public void addAction(UserAction action) {
        this.actions.add(action);
    }

    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }

        }
    }

    /**
     * Класс добавления заявки.
     */
    private class AddItem extends BaseAction {
        /**
         * Конструктор класса.
         *
         * @param menuName Имя меню.
         * @param key      Номер меню.
         */
        public AddItem(String menuName, int key) {
            super(menuName, key);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя задачи: ");
            String desc = input.ask("Введите описание задачи: ");
            tracker.add(new Task(name, desc));
        }
    }

    /**
     * Класс просмотра всех заявок.
     */
    private static class ShowItems extends BaseAction {
        /**
         * Конструктор класса.
         *
         * @param menuName Имя меню.
         * @param key      Номер меню.
         */
        public ShowItems(String menuName, int key) {
            super(menuName, key);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(
                        String.format("ID: %s Имя: %s", item.getId(), item.getName())
                );
            }
        }
    }

    /**
     * Класс удаления заявки.
     */
    private class DeleteItem extends BaseAction {
        /**
         * Конструктор класса.
         *
         * @param menuName Имя меню.
         * @param key      Номер меню.
         */
        public DeleteItem(String menuName, int key) {
            super(menuName, key);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id заявки: ");
            Item item = tracker.findById(id);
            tracker.delete(item);
        }
    }

    /**
     * Класс поиска заявки по id.
     */
    private class FindItemById extends BaseAction {
        /**
         * Конструктор класса.
         *
         * @param menuName Имя меню.
         * @param key      Номер меню.
         */
        public FindItemById(String menuName, int key) {
            super(menuName, key);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id заявки: ");
            Item item = tracker.findById(id);
            System.out.println(String.format("Имя: %s ID: %s", item.getName(), item.getDesc()));

        }
    }

    /**
     * Класс поиска по имени.
     */
    private class FindItemsByName extends BaseAction {
        /**
         * Конструктор класса.
         *
         * @param menuName Имя меню.
         * @param key      Номер меню.
         */
        public FindItemsByName(String menuName, int key) {
            super(menuName, key);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя заявки: ");
            ArrayList<Item> items = tracker.findByName(name);
            for (Item item : items) {
                System.out.println(
                        String.format(
                                "Имя: %s Описание: %s ID: %s",
                                item.getName(), item.getDesc(), item.getId())
                );
            }
        }
    }

}
