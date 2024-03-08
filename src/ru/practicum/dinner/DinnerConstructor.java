package ru.practicum.dinner;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> menu;
    ArrayList<String> dishName;
    Random random;

    DinnerConstructor() {
        menu = new HashMap<>();
        random = new Random();
    }
    // Добавляем тип и название блюда
    void addDishType(String type, String name) {
        if (menu.containsKey(type)) {
            if (menu.get(type).contains(name)) {
                System.out.println("Блюдо с таким названием уже добавлено.");
            } else {
                menu.get(type).add(name);
            }
        } else {
            dishName = new ArrayList<>();
            dishName.add(name);
            menu.put(type, dishName);
        }
    }
    void generateDishCombo(int numberOfCombos, ArrayList<String> addTypeCombo) {
        ArrayList<ArrayList<String>> combo = new ArrayList<>();
        for (int i = 0; i < numberOfCombos; i++) {
            combo.add(new ArrayList<>());
            for (int j = 0; j < addTypeCombo.size(); j++) {
                int b = random.nextInt(menu.values().size() - 1);
                combo.get(i).add(dishName.get(b));
            }
        }
        for (int i = 0; i < combo.size(); i++) {
            System.out.println("Комбо" + (i + 1));
            System.out.println(combo.get(i));
        }
    }
}
