class Character {
    String name;
    int health;
    int strength;
    int defense;
    static int characterCount = 0;
    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        characterCount++;
    }
    void attack(Character other) {
        int damage = this.strength - other.defense;
        if (damage < 0) {
            damage = 0;
        }
        System.out.println(this.name + " attacks " + other.name + " and causes harm " + damage);
        other.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void displayStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Strength: " + this.strength);
        System.out.println("Defense: " + this.defense);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Character wizzard = new Character("Wizzard", 120, 40, 20);
        Character witch = new Character("Witch", 100, 35, 15);
        wizzard.displayStatus();
        witch.displayStatus();
        while (wizzard.isAlive() && witch.isAlive()) {
            wizzard.attack(witch);
            if (witch.isAlive()) {
                witch.attack(wizzard);
            }
            wizzard.displayStatus();
            witch.displayStatus();
        }
        if (wizzard.isAlive()) {
            System.out.println(wizzard.name + " won!");
        } else {
            System.out.println(witch.name + " won!");
        }
        System.out.println("Total amount of characters: " + Character.characterCount);
    }
}