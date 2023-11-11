package Abstractizare;

public class Cleric implements GameCharacter {
    private double healingPower;

    public Cleric(double healingPower) {
        this.healingPower = healingPower;
    }

    public double getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(double healingPower) {
        this.healingPower = healingPower;
    }

    @Override
    public void attack() {
        System.out.println("Cleric attacks with a holy spell!");
    }

    @Override
    public void defend() {
        System.out.println("Cleric heals and defends allies! Current Healing Power: " + getHealingPower());
    }

    @Override
    public void move() {
        System.out.println("Cleric moves gracefully with a staff.");
    }

    public void increaseHealingPower(double amount) {
        System.out.println("Increasing Cleric's healing power by " + amount);
        setHealingPower(getHealingPower() + amount);
    }

    @Override
    public String showInfo() {
        return "===== Thief =====\n" +
                "HealingPower: " + getHealingPower() + "\n";
    }
}
