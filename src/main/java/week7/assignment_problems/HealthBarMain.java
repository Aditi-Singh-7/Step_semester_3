package main.java.week7.assignment_problems;

class Character {

    private final int maxHealth; // Fixed max health
    private int health;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) { // Floored at 0
            health = 0;
            System.out.println("c.takeDamage(" + amount + ") -> health = 0 (floored)");
        } else {
            System.out.println("c.takeDamage(" + amount + ") -> health = " + health);
        }
    }

    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) { // Capped at max health
            health = maxHealth;
            System.out.println("c.heal(" + amount + ") -> health = " + health + " (capped)");
        } else {
            System.out.println("c.heal(" + amount + ") -> health = " + health);
        }
    }

    public int getHealth() {
        return health; // Read-only access
    }
}

public class HealthBarMain {

    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        c.heal(50);
        c.takeDamage(150);
    }
}
