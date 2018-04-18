package ru.job4j.condition;

/**
 * Класс глупый бот.
 *
 * @author Alexandr Kh
 * @version 0.1
 * @since 18.04.18
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     *
     * @param question Вопрос клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
