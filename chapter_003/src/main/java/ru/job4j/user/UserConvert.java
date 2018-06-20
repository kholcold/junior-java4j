package ru.job4j.user;

import java.util.HashMap;
import java.util.List;

/**
 * List в Map.
 * @author Alexandr Kholodov.
 *
 */
public class UserConvert {
    /**
     *  Метод оторый принимает в себя список пользователей и конвертирует его в Map
     *  с ключом Integer id и соответствующим ему User.
     * @param list Список пользователей.
     * @return Результат.
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User user : list) {
            result.put(user.getId(), user);
        }
        return result;
    }
}
