package oop_java_dz1;

public class Rogue extends BaseHero {
    /** Разбойник
    * @param name - Имя
    */

    private int shots;
    private int minDamage;
    private int maxDamage;

    public Rogue(String name) {
        super(name, 8, 3, 0, 2, 10, 6, 0, 0);
        this.shots = 0;
        this.minDamage = 2;
        this.maxDamage = 4;
    }

    public Rogue(String name, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed, int delivery, int magic) {
        super(name, attack, defense, health, speed, delivery, magic);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int getShots() {
        return shots;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
    // public Rogue(String name) {
    //     super(name, 120);
    // }

    // public Rogue() {
    //     super();
    // }
    // private int attack;
    // private int defense;
    // private int damageMin;
    // private int damageMax;
    // private int delivery;
    // private int magic;

    // // Конструктор без параметров
    // public Rogue() {
    //     super();
    //     this.attack = 8;
    //     this.defense = 3;
    //     this.damageMin = 2;
    //     this.damageMax = 4;
    //     this.delivery = 0;
    //     this.magic = 0;
    // }

    // // Конструктор с параметрами
    // public Rogue(String name, int level, int experience, int strength, int dexterity, int intelligence, int wisdom, int charisma, int hitPoints, int armorClass, int attack, int defense, int damageMin, int damageMax, int delivery, int magic) {
    //     super(name, level, experience, strength, dexterity, intelligence, wisdom, charisma, hitPoints, armorClass);
    //     this.attack = attack;
    //     this.defense = defense;
    //     this.damageMin = damageMin;
    //     this.damageMax = damageMax;
    //     this.delivery = delivery;
    //     this.magic = magic;
    // }
    // public void pickPocket() {
    //     System.out.println(this.name + " is picking pockets.");
    // }

    // public void sneak() {
    //     System.out.println(this.name + " is sneaking around.");
    // }
    // public void step() {
    //     System.out.println("Rogue walks...");
    // }
    // public String getInfo() {
    //     return "Я Разбойник";
    }
}