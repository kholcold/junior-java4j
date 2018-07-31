package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transfer {
    Map<User, List<Account>> bankAccount = new HashMap<>();

    /**
     * Добавление пользователя.
     *
     * @param user пользователь.
     */
    public void addUser(User user) {
        bankAccount.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Удаление пользователя.
     *
     * @param user пользователь
     */
    public void deleteUser(User user) {
        bankAccount.remove(user);
    }

    /**
     * Добавить счёт пользователю.
     *
     * @param passport Паспорт.
     * @param account  Акк.
     */
    public void addAccountToUser(String passport, Account account) {
        List<Account> list = this.bankAccount.get(getUser(passport));
        list.add(account);
    }

    /**
     * Удалить один счёт пользователя по паспорту.
     *
     * @param passport Паспорт.
     * @param account  Банковский счет.
     */
    public void deleteAccountFromUser(String passport, Account account) {
        List<Account> list = this.bankAccount.get(getUser(passport));
        list.remove(account);
    }

    /**
     * Получить список счетов для пользователя.
     *
     * @param passport Паспорт.
     * @return Список счетов.
     */
    public List<Account> getUserAccounts(String passport) {
        return this.bankAccount.get(getUser(passport));
    }


    /**
     * Метод для перечисления денег с одного счёта на другой счёт:
     * если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.
     *
     * @param srcPassport  паспорт кто переводит.
     * @param srcRequisite счет кто переводит.
     * @param destPassport паспорт кому переводят.
     * @param dstRequisite счет кому переводят.
     * @param amount       сколько переводят.
     * @return true or false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dstRequisite, double amount) {
        boolean transfer = false;
        if (bankAccount.containsKey(getUser(srcPassport)) && bankAccount.containsKey(getUser(destPassport))) {
            Account accountSrc = getAccountForPassportAndRequisite(srcPassport, srcRequisite);
            Account accountDest = getAccountForPassportAndRequisite(destPassport, dstRequisite);
            if (accountSrc.getValue() >= amount) {
                accountSrc.setValue(accountSrc.getValue() - amount);
                accountDest.setValue(accountDest.getValue() + amount);
            }
            transfer = true;
        }
        return transfer;
    }

    /**
     * Поиск пользователя по паспорту.
     *
     * @param passport Пасспорт.
     * @return пользователь.
     */
    public User getUser(String passport) {
        User searchedUser = new User();
        for (Map.Entry<User, List<Account>> userEntry : bankAccount.entrySet()) {
            if (passport.equals(userEntry.getKey().getPassport())) {
                searchedUser = userEntry.getKey();
            }
        }
        return searchedUser;
    }

    /**
     * Метод получения аккаунта по паспорту и реквизитам.
     *
     * @param passport  Паспорт.
     * @param requisite Реквизиты.
     * @return Аккаунт.
     */
    public Account getAccountForPassportAndRequisite(String passport, String requisite) {
        Account result = null;
        List<Account> list = getUserAccounts(passport);
        for (Account account : list) {
            if (account.getRequisites().equals(requisite)) {
                result = account;
            }
        }
        return result;
    }

}
