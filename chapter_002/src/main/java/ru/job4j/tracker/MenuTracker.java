package ru.job4j.tracker;

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
    private UserAction[] actions = new UserAction[10];

    /**
     * Индекс массива.
     */
    private int position = 0;

    private int[] ranges = new int[]{0, 1, 2, 3, 4, 5, 6};

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

    public int[] getRanges() {
        return ranges;
    }

    public void fillActions() {
        this.actions[position++] = new AddItem("Add the new item.", 0);
        this.actions[position++] = new MenuTracker.ShowItems("Show all items.", 1);
        this.actions[position++] = new EditItem("Edit the new item.", 2);
        this.actions[position++] = new DeleteItem("Delete item.", 3);
        this.actions[position++] = new FindItemById("Find item by Id.", 4);
        this.actions[position++] = new FindItemsByName("Find items by name.", 5);
    }

    public void addAction(UserAction action) {
        this.actions[position++] = action;
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
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
            Item[] items = tracker.findByName(name);
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
