package ru.practicum.dinner;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> menu;
    Random random;

    DinnerConstructor() {
        menu = new HashMap<>();
        random = new Random();
    }
    // Добавляем тип и название блюда
    void addDishType(String type, String name) {
        menu.put(type, new ArrayList<>());
        menu.get(type).add(name);
    }
    // Генерируем комбинации блюд
    ArrayList<ArrayList<String>> generateDishCombo(int numberOfCombos, ArrayList<String> addTypeCombo) {
        ArrayList<ArrayList<String>> combo = new ArrayList<>();
        for (int i = 0; i < numberOfCombos; i++) {
            combo.add(new ArrayList<>());
            for (String type : addTypeCombo) {
                int b = random.nextInt(menu.get(type).size());
                combo.get(i).add(menu.get(type).get(b));
            }
        }
        return combo;
    }
    // Проверяем наличие типа блюд
    boolean checkType(String type) {
        if (menu.containsKey(type)) {
            return true;
        } else {
            return false;
        }
    }
}
