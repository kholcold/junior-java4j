package ru.job4j.bank;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransferTest {
    /**
     * Тест удаление пользователя.
     */
    @Test
    public void whenDeleteUser() {
        Transfer transfer = new Transfer();
        User alex = new User("Alex", "12345");
        transfer.addUser(alex);
        transfer.deleteUser(alex);
        assertThat(transfer.bankAccount.isEmpty(), is(true));
    }

    /**
     * Тест метода getUser.
     * Ищем пользователя по паспорту.
     */
    @Test
    public void whenFindUserForPassport() {
        User alex = new User("Alex", "12345");
        User kolya = new User("Kolya", "54321");
        Transfer transfer = new Transfer();
        transfer.addUser(alex);
        transfer.addUser(kolya);
        User user = transfer.getUser("12345");
        assertThat(user, is(alex));
    }

    /**
     * Тест метода getUser.
     * Ищем пользователя по паспорту.
     * Когда 3 пользователя.
     */
    @Test
    public void whenFindUserForPassportThreeUser() {
        User alex = new User("Alex", "12345");
        User kolya = new User("Kolya", "54321");
        User vova = new User("Vova", "33224");
        Transfer transfer = new Transfer();
        transfer.addUser(alex);
        transfer.addUser(kolya);
        transfer.addUser(vova);
        User user = transfer.getUser("33224");
        assertThat(user, is(vova));
    }

    /**
     * Тест addAccountToUser.
     */
    @Test
    public void whenAddAccountToUser() {
        User alex = new User("Alex", "12345");
        Account account = new Account(1000, "112233");
        Transfer transfer = new Transfer();
        transfer.addUser(alex);
        transfer.addAccountToUser("12345", account);
        List<Account> accounts = transfer.bankAccount.get(alex);
        assertThat(accounts.contains(account), is(true));
    }

    /**
     * Тест deleteAccountFromUser.
     */
    @Test
    public void whenDeleteAccountFromUser() {
        User alex = new User("Alex", "12345");
        Account account = new Account(1000, "112233");
        Transfer transfer = new Transfer();
        transfer.addUser(alex);
        transfer.addAccountToUser("12345", account);
        transfer.deleteAccountFromUser("12345", account);
        List<Account> accounts = transfer.bankAccount.get(alex);
        assertThat(accounts.isEmpty(), is(true));
    }

    /**
     * Тест метода для перечисления денег с одного счёта на другой счёт
     */
    @Test
    public void whentransferMoney() {
        User user = new User("Alex", "111333");
        User user2 = new User("Vova", "222333");
        Account accountUser = new Account(1000, "123");
        Account accountUser2 = new Account(1000, "456");
        Transfer transfer = new Transfer();
        transfer.addUser(user);
        transfer.addUser(user2);
        transfer.addAccountToUser("111333", accountUser);
        transfer.addAccountToUser("222333", accountUser2);
        boolean resault = transfer.transferMoney("111333", "123",
                "222333", "456", 500);
        assertThat(true, is((accountUser.getValue() == 500) && (accountUser2.getValue() == 1500) && resault));

    }

}
