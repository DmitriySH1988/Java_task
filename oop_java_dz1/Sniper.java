package oop_java_dz1;

public class Sniper extends BaseHero {

    /**
     * Снайпер
     * 
     * @param name - Имя
     */
    private int shots;
    private int minDamage;
    private int maxDamage;

    public Sniper(String name) {
        super(name, 12, 10, 32, 15, 9, 0, 0);
        this.shots = 32;
        this.minDamage = 8;
        this.maxDamage = 10;
    }

    public Sniper(String name, int attack, int defense, int shots, int health, int speed, int delivery, int magic, int minDamage, int maxDamage) {
        super(name, attack, defense, shots, health, speed, delivery, magic);
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



    // public Sniper(String name) {
    //     super(name, 50);
    // }

    // public Sniper() {
    //     super();
    // }

    // public void aim() {
    //     System.out.println(this.name + " is aiming the sniper rifle.");
    // }

    // public void shoot() {
    //     System.out.println(this.name + " is shooting the sniper rifle.");
    // }
    // public void step() {
    //     System.out.println("Sniper walks...");
    // }
    // public String getInfo() {
    //     return "Я Снайпер";
    }
}