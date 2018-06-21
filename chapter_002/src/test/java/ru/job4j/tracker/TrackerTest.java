package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Трекер тест.
 * @author Alexandr Kholodov.
 * @since 08.11.2017/
 */
public class TrackerTest {
    /**
     * Тест.
     */
    @Test
    public void whenUpdateNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.update(next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Тест. Добавляем заявку и смотрим что она есть.
     */
    @Test
    public void whenAddApplicationAndCheckInTracker() {
        Tracker tracker = new Tracker();
        Item previos = new Item("test1", "testDescriptor", 123L);
        tracker.add(previos);
        tracker.findAll();
        assertThat(tracker.findAll().get(0), is(previos));
    }

    /**
     * Добавляем заявку и удаляем ее.
     */
    @Test
    public void whenAddApplicationAndRemove() {
        Tracker tracker = new Tracker();
        Item previos = new Item("test1", "testDescriptor", 123L);
        tracker.add(previos);
        tracker.delete(previos);
        assertThat(tracker.findAll().isEmpty(), is(true));
    }

    /**
     * Добавляем заявку и ищем по имени.
     */
    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item previos = new Item("test1", "testDescriptor", 123L);
        tracker.add(previos);
        assertThat(tracker.findByName("test1").get(0).getName(), is("test1"));
    }
}
