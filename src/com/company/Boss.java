package com.company;

public class Boss {
    private int health;
    private int damage;
    public String schield;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSchield() {
        return schield;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSchield(String schield) {
        this.schield = schield;
    }
}
