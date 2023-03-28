package oop_java_dz1;

public class Monk extends BaseHero {
    /**
    * Монах
    * @param name - Имя
    */
    
    private int magic;

    public Monk(String name, int attack, int defense, int shots, int damageMin, int damageMax,
                int health, int speed, int mana) {
        super(name, attack, defense, shots, damageMin, damageMax, health, speed);
        this.magic = mana;
    }

    public Monk(String name) {
        super(name, 12, 7, 0, -4, -4, 30, 5);
        this.magic = 1;
    }

    public int getMagic() {
        return magic;
    }
    public void step() {
        if (!isDead()) {
            setState("Stand");
        }
    }
    // public Monk(String name) {
    //     super(name, 90);
    // }

    // public Monk() {
    //     super();
    // }

    // public void meditate() {
    //     System.out.println(this.name + " is meditating.");
    // }

    // public void heal() {
    //     System.out.println(this.name + " is using their healing powers.");
    // }
    // public void step() {
    //     System.out.println("Monk walks...");
    // }
    // public String getInfo() {
    //     return "Я Монах";
    // }
}