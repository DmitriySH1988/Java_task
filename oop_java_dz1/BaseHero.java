package oop_java_dz1;

import java.util.Random;

public abstract class BaseHero {
    private int attack;
    private int defense;
    private int shots;
    private int minDamage;
    private int maxDamage;
    private int health;
    private int speed;
    private int delivery;
    private int magic;
    private String name;
    private int maxHealth;
    private boolean isDead;
    private String state;

    public BaseHero(String name) {
        super(name);
        this.attack = 8;
        this.defense = 3;
        this.shots = 0;
        this.minDamage = 2;
        this.maxDamage = 4;
        this.health = 10;
        this.speed = 6;
        this.delivery = 0;
        this.magic = 0;
        this.isDead = false;
        this.state = "Stand";
    }

    public BaseHero(String name, int attack, int defense, int shots, int minDamage, int maxDamage, int health,
            int speed, int delivery, int magic) {
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
        this.isDead = false;
        this.state = "Stand";
    }

    private String getName(String name) {
        return name;
    }

    private Object getAttack() {
        return attack;
    }

    private Object getDefense() {
        return defense;
    }

    private Object getShots() {
        return shots;
    }

    private Object getDamageMin() {
        return minDamage;
    }

    private Object getDamageMax() {
        return maxDamage;
    }

    private Object getHealth() {
        return health;
    }

    private Object getSpeed() {
        return speed;
    }

    private Object getDelivery() {
        return delivery;
    }

    private Object getMagic() {
        return magic;
    }
    public int getMaxHealth() {
        return health;
    }
  public void takeDamage(int damage) {
        if (!isDead) {
            health -= damage;
            if (health <= 0) {
                isDead = true;
                state = "Dead";
            }
        }
    }

    public void heal(int amount) {
        if (!isDead) {
            health += amount;
            if (health > 0) {
                health = getMaxHealth();
            }
        }
    }


    public boolean isDead() {
        return isDead;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getShortDescription() {
        return String.format("Name: %s, Health: %d, Attack: %d, Defense: %d, Damage: %d-%d",
                this.getName(), this.getHealth(), this.getAttack(), this.getDefense(),
                this.getDamageMin(), this.getDamageMax());
    }

    public String getInfo() {
        return String.format(
                "Name: %s, Health: %d, Attack: %d, Defense: %d, Damage: %d-%d, Shots: %d, Speed: %d, Delivery: %d, Magic: %d",
                this.getName(), this.getHealth(), this.getAttack(), this.getDefense(),
                this.getDamageMin(), this.getDamageMax(), this.getShots(), this.getSpeed(),
                this.getDelivery(), this.getMagic());
    }

    public BaseHero(String name, int x, int y) {
        this.name = name;
        this.coord = new Coord(x, y);
    }

    protected Coord coord;

    protected static class Coord {
        private int x;
        private int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}