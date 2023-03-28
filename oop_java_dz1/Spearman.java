package oop_java_dz1;

public class Spearman extends BaseHero {
   
    /**
     * Копейщик
     * 
     * @param name - Имя
     */
    private int attack;
    private int defense;
    private int shots;
    private int minDamage;
    private int maxDamage;
    private int health;
    private int speed;
    private int delivery;
    private int magic;

    public Spearman(String name) {
        super(name);
        this.attack = 4;
        this.defense = 5;
        this.shots = 0;
        this.minDamage = 1;
        this.maxDamage = 3;
        this.health = 10;
        this.speed = 4;
        this.delivery = 0;
        this.magic = 0;
    }

    public Spearman(String name, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed, int delivery, int magic) {
        super(name);
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
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

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDelivery() {
        return delivery;
    }

    public int getMagic() {
        return magic;
    }
     



    // public Spearman(String name) {
    //     super(name, 150);
    // }


    // public Spearman() {
    //     super();
    // }

    // public void brace() {
    //     System.out.println(this.name + " is bracing with their spear.");
    // }

    // public void thrust() {
    //     System.out.println(this.name + " is thrusting their spear.");
    // }
    // public void step() {
    //     System.out.println("Spearman walks...");
    // }
    // public String getInfo() {
    //     return "Я Копейщик";
    // }
}