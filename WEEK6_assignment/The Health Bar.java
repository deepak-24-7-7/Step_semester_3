class Character {
    private int health;
    private final int maxHealth;

    Character(int maxHealth) {
        this.maxHealth = maxHealth;
        health = maxHealth;
    }

    void takeDamage(int amount) {
        health = Math.max(0, health - amount);
    }

    void heal(int amount) {
        health = Math.min(maxHealth, health + amount);
    }

    int getHealth() {
        return health;
    }
}
