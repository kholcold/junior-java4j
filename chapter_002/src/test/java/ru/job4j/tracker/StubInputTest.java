package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс тестирует пользовательский ввод.
 */
public class StubInputTest {
    /**
     * Тест.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * Тест.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc"));
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"1", item.getId(), "test name", "desc", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }

    /**
     * Добавляем заявку и удаляем ее.
     */
    @Test
    public void whenUserAddedApplicationAndRemoved() {
        Tracker tracker = new Tracker();
        Item result = null;
        Item item = tracker.add(new Item("test", "desc", 123L));
        Input input = new StubInput(new String[]{"1", "3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0], is(result));
    }

    /**
     * Добавляем заявку и редактируем ее.
     */
    @Test
    public void whenAddApplicationAndViewingThem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "desc", 123L));
        Input input = new StubInput(new String[]{"2", "new test", "new desc", item.getId(), "1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("new test"));
        assertThat(tracker.findAll()[0].getDesc(), is("new desc"));

    }
}
