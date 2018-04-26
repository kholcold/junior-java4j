package ru.job4j.tracker;

/**
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 26.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";
    /**
     * Константа меню для показа всех заявок.
     */
    private static final String SHOW = "1";
    /**
     * Константа меню для редактирования заявки.
     */
    private static final String EDIT = "2";
    /**
     * Константа меню для удаления заявки.
     */
    private static final String DELETE = "3";
    /**
     * Константа меню для поиска по ID.
     */
    private static final String FIND_BY_ID = "4";
    /**
     * Константа меню для поиска по имени.
     */
    private static final String FIND_BY_NAME = "5";
    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showItem();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                deleteItem();
            } else if (FIND_BY_ID.equals(answer)) {
                findItemById();
            } else if (FIND_BY_NAME.equals(answer)) {
                findItemByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой языки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод реализует просмотр всех заявок.
     */
    private void showItem() {
        System.out.println("------------ Просмотр всех заявок --------------");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.printf("ID = %s имя = %s описание = %s \n", item.getId(), item.getName(), item.getDescription());
        }
    }

    /**
     * Метод реализует редактирование заявки.
     */
    private void editItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String name = this.input.ask("Введите имя заявки.");
        String desc = this.input.ask("Введите описание заявки.");
        String id = this.input.ask("Введите id заявки");
        Item item = new Item(name, desc);
        this.tracker.replace(id, item);
    }

    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItem() {
        System.out.println("------------ Удалить заявку --------------");
        String id = this.input.ask("Введите id заявки.");
        this.tracker.delete(id);
    }

    /**
     * Метод реализует поиск по id.
     */
    private void findItemById() {
        System.out.println("------------ Поиск по id --------------");
        String id = this.input.ask("Введите id заявки.");
        Item item = this.tracker.findById(id);
        System.out.printf("ID = %s имя = %s описание = %s \n", item.getId(), item.getName(), item.getDescription());
    }

    /**
     * Метод реализует поиск по имени.
     */
    private void findItemByName() {
        System.out.println("------------ Поиск по имени --------------");
        String name = this.input.ask("Введите имя заявки.");
        Item[] items = this.tracker.findByName(name);
        for (Item item : items) {
            System.out.printf("ID = %s имя = %s описание = %s \n", item.getId(), item.getName(), item.getDescription());
        }
    }

    /**
     * Вывести меню.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select");
    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
