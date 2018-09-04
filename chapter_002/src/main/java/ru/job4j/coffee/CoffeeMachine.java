package ru.job4j.coffee;

import java.util.ArrayList;

public class CoffeeMachine {
    final int[] VALUES = {10, 5, 2, 1};

    public int[] valid(int value, int price) {
        int[] result = new int[0];
        if (value >= price) {
            result = changes(value, price);
        }
        return result;
    }

    public int[] changes(int value, int price) {
        int[] result;
        int deliveryOfMoney = value - price;
        ArrayList<Integer> listMoney = new ArrayList<>();

        while (deliveryOfMoney != 0) {
            for (int i : VALUES) {
                if (deliveryOfMoney >= i) {
                    listMoney.add(i);
                    deliveryOfMoney -= i;
                    break;
                }
            }
        }

        result = new int[listMoney.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = listMoney.get(i);
        }
        return result;
    }
}

