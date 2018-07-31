package ru.job4j.coffee;

import java.util.ArrayList;

public class CoffeeMachine {
    public int[] changes(int value, int price) {

        int deliveryOfMoney = value - price;

        ArrayList<Integer> listMoney = new ArrayList<>();
        int[] values = {10, 5, 2, 1};

        while (deliveryOfMoney != 0) {
            for (int i : values) {
                if (deliveryOfMoney >= i) {
                    listMoney.add(i);
                    deliveryOfMoney -= i;
                    break;
                }
            }
        }

        int[] result = new int[listMoney.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = listMoney.get(i).intValue();
        }
        return result;
    }
}
