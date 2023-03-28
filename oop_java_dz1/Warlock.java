package oop_java_dz1;

import java.util.ArrayList;

public class Warlock extends BaseHero {
    private ArrayList<Character> party;

    // Конструктор с параметрами
    public Warlock(String name) {
        super(17, 12, 0, "-5", 30, 9, 0, 1, name);
    }

    // Второй конструктор с возможностью задания всех характеристик героя
    public Warlock(int attack, int defense, int shots, String damage, int health, int speed, int delivery, int magic, String name) {
        super(attack, defense, shots, damage, health, speed, delivery, magic, name);
    }
     /**
     * Колдун
     * 
     * @param name - Имя
     */
    public void step() {
        if (!isDead()) {
            setState("Stand");

            // Find the character with the lowest health in the party
            Character target = null;
            int lowestHealth = Integer.MAX_VALUE;
            for (Character c : party) {
                if (!c.isDead() && c.getHealth() < lowestHealth) {
                    target = c;
                    lowestHealth = c.getHealth();
                }
            }

            // If a target was found, heal them
            if (target != null) {
                heal(10); // Change this to adjust the amount healed
            }
        }
   
}